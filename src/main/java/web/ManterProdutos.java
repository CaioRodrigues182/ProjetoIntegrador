
package web;


import dominio.Produto;
import servico.ProdutoServico;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/produtos/manter")
public class ManterProdutos extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private static String DESTINO = "/produtos/manter.jsp";
  	 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	ProdutoServico ps = new ProdutoServico();
    	List<Produto> produtos = ps.buscarTodos();
    	request.setAttribute("produtos", produtos);
    	request.getRequestDispatcher(DESTINO).forward(request, response);
    	
   	 
    }

}