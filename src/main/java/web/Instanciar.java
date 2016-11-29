package web;

import javax.servlet.http.HttpServletRequest;

import dominio.Endereco;
import dominio.Entrega;
import dominio.ItemEntregue;
import dominio.Produto;
import servico.EntregaServico;
import servico.ProdutoServico;

public class Instanciar {

	public static Endereco endereco (HttpServletRequest request) {
		Endereco aux = new Endereco();
		String s;
		
		s = request.getParameter("logadouro");
		if(s!=null && !s.isEmpty()) {
			aux.setLogadouro(s);
		}
		
		s = request.getParameter("numero");
		if(s!=null && !s.isEmpty()) {
			aux.setNumero(Integer.parseInt(s));
		}
		
		s = request.getParameter("complemento");
		if(s!=null && !s.isEmpty()) {
			aux.setComplemento(s);
		}
		
		s = request.getParameter("bairro");
		if(s!=null && !s.isEmpty()) {
			aux.setBairro(s);
		}
		
		s = request.getParameter("cep");
		if(s!=null && !s.isEmpty()) {
			aux.setCep(s);
		}
		return aux;
		
	}
	
	public static ItemEntregue item (HttpServletRequest request) {
		ItemEntregue aux = new ItemEntregue();
		String s;
		EntregaServico es = new EntregaServico();
		ProdutoServico ps = new ProdutoServico();
		
		s = request.getParameter("codEntrega");
		if(s!=null && !s.isEmpty()) {
			int cod = Integer.parseInt(request.getParameter("codEntrega"));
			Entrega x = es.buscar(cod);
			aux.setEntrega(x);
		}
		
		s = request.getParameter("codProduto");
		if(s!=null && !s.isEmpty()) {
			int cod = Integer.parseInt(request.getParameter("codProduto"));
			Produto x = ps.buscar(cod);
			aux.setProduto(x);
		}
		
		s = request.getParameter("quantidade");
		if(s!=null && !s.isEmpty()) {
			aux.setQuantidade(Integer.parseInt(s));
		}
		return aux;
		
	}
}
