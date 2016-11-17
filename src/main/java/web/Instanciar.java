package web;

import dominio.Endereco;
import dominio.Fornecedor;
import dominio.Produto;
import servico.FornecedorServico;
import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.SystemException;

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
			aux.setLogadouro(s);
		}
		
		s = request.getParameter("bairro");
		if(s!=null && !s.isEmpty()) {
			aux.setLogadouro(s);
		}
		
		s = request.getParameter("cep");
		if(s!=null && !s.isEmpty()) {
			aux.setLogadouro(s);
		}
		return aux;
		
	}

	public static Produto produto (HttpServletRequest request){

		FornecedorServico fs = new FornecedorServico();


		Produto aux = new Produto();
		String s;

		s = request.getParameter("nome");
		if(s!=null && !s.isEmpty()) {
			aux.setNome(s);
		}

		s = request.getParameter("preco");
		if(s!=null && !s.isEmpty()) {
			aux.setPreco(new BigDecimal(s));
		}

		s = request.getParameter("fornecedor.codFornecedor");
		if(s!=null && !s.isEmpty()) {
			try {
				Fornecedor x = fs.buscar(Integer.parseInt(s));
				aux.setFornecedor(x);
			} catch (NumberFormatException e) {
				System.out.println("Instanciacao: codFornecedor inválido");
			}

		}

		return aux;
	}
}
