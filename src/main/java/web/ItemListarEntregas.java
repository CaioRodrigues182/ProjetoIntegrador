
package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Entrega;
import servico.EnderecoServico;
import servico.EntregaServico;

@WebServlet("/entregas/listar")
public class ItemListarEntregas extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private static String DESTINO = "/incluirItem/listaEntregas.jsp";
  	 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	EnderecoServico eds = new EnderecoServico();
    	EntregaServico es = new EntregaServico();
		int cod = Integer.parseInt(request.getParameter("codCliente"));
		Entrega x = es.buscar(cod);
    	request.setAttribute("entregas", x);
    	request.getRequestDispatcher(DESTINO).forward(request, response);
    	
   	 
    }

}
