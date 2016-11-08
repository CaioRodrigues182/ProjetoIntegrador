package web;

import javax.servlet.http.HttpServletRequest;

import dominio.Cliente;
import dominio.Endereco;
import servico.ClienteServico;

public class Instanciar {

	public static Endereco endereco (HttpServletRequest request) {
		Endereco aux = new Endereco();
		String s;
		
		ClienteServico cs = new ClienteServico();
		int codCliente = Integer.parseInt(request.getParameter("codCliente"));
		
		
		
		s = request.getParameter("codCliente");
		if(s!=null && !s.isEmpty()){
			Cliente c = cs.buscar(codCliente);
			aux.setCliente(c);
		}

		
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
}
