
package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Endereco;
import servico.EnderecoServico;
import servico.ValidacaoException;

@WebServlet("/enderecos/inserir")
public class EnderecoInserir extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private static String DESTINO = "/enderecos/listar.jsp";
    private static String FORM = "/enderecos/formInserir.jsp";
  	 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	EnderecoServico es = new EnderecoServico();
    	Endereco x = Instanciar.endereco(request);
    	try {
			es.validar(x);
			es.inserirAtualizar(x);
	    	List<Endereco> itens = es.buscarTodos();
	    	request.setAttribute("itens", itens);
	    	request.getRequestDispatcher(DESTINO).forward(request, response);
		} catch (ValidacaoException e) {
			request.setAttribute("erros", e.getErros());
			request.setAttribute("item", x);
			request.getRequestDispatcher(FORM).forward(request, response);
		}
   	 response.getWriter().append("Served at: ").append(request.getContextPath());
    }

}
