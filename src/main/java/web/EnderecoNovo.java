
package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Endereco;

@WebServlet("/enderecos/novo")
public class EnderecoNovo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/enderecos/formInserir.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("endereco", new Endereco());
		request.getRequestDispatcher(DESTINO).forward(request, response);

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
