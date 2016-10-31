package web;

import javax.servlet.http.HttpServletRequest;

import dominio.Endereco;

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
}
