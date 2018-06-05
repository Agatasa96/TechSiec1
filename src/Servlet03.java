
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet03
 */
@WebServlet("/Servlet03")
public class Servlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		double sum = (double) sess.getAttribute("sum");
		double avg = (double) sess.getAttribute("avg");
		List<Product> products = (List<Product>) sess.getAttribute("produkty");

		StringBuilder sb = new StringBuilder();
		sb.append("<div><h1>").append(products).append("</h1></div>").append("<div>").append("Suma: ").append(sum)
				.append("</div>").append("<div>").append("Srednia za produkt: ").append(avg).append("</div>");

		response.getWriter().append(sb);

	}

}
