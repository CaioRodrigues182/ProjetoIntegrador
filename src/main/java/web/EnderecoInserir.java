
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

@WebServlet("/enderecos/inserir")
public class EnderecoInserir extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private static String DESTINO = "/enderecos/listar?codCliente=";
    private static String FORM = "/enderecos/formInserir.jsp";
  	 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	System.out.println("passou 1");
    	
    	EnderecoServico es = new EnderecoServico();
    	Endereco x = Instanciar.endereco(request);
    	ClienteServico cs = new ClienteServico();
       	int cod = Integer.parseInt(request.getParameter("codCliente"));
       	Cliente y = cs.buscar(cod);
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
