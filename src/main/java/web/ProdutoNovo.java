
package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Produto;

@WebServlet("/produtos/novo")
public class ProdutoNovo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/produtos/formInserir.jsp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produto p = new Produto();
		request.setAttribute("item", p);
		request.getRequestDispatcher(DESTINO).forward(request, response);

		
	}

}
