
package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Cliente;
import dominio.Endereco;
import servico.ClienteServico;
import servico.EnderecoServico;
import servico.ValidacaoException;

@WebServlet("/enderecos/atualizar")
public class EnderecoAtualizar extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private static String DESTINO = "/enderecos/listar.jsp";
    private static String FORM = "/enderecos/formEditar.jsp";
  	 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Endereco x = null;
    	EnderecoServico es = new EnderecoServico();
    	ClienteServico cs = new ClienteServico();
    	int y = Integer.parseInt(request.getParameter("codCliente"));
    	Cliente c = cs.buscar(y);
    	x.setCliente(c);
    	x = Instanciar.endereco(request);
    	
    	try {
			es.validar(x);
			es.inserirAtualizar(x);
	    	List<Endereco> itens = es.buscarTodos();
	    	request.setAttribute("itens", itens);
	    	request.getRequestDispatcher(DESTINO+y).forward(request, response);
		} catch (ValidacaoException e) {
			request.setAttribute("erros", e.getErros());
			request.setAttribute("item", x);
			request.getRequestDispatcher(FORM).forward(request, response);
		}
   	 
    }

}
