
package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import dominio.Entrega;
import servico.EntregaServico;
import servico.ItemEntregueServico;

@WebServlet("/entregas/listar")
public class ItemListarEntregas extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private static String DESTINO = "/incluirItem/listaEntregas.jsp";
  	 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	EntregaServico es = new EntregaServico();
		int cod = Integer.parseInt(request.getParameter("codCliente"));
		List<Entrega> x = es.buscarTodos();
    	request.setAttribute("entregas", x);
    	request.getRequestDispatcher(DESTINO).forward(request, response);
    	
   	 
    }

}
