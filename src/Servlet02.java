
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet02
 */
@WebServlet("/Servlet02")
public class Servlet02 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();
		List<Product> products = new ArrayList<>();
		products = (List<Product>) sess.getAttribute("produkty");
		double sum = 0;

		for (int i = 0; i < products.size(); i++) {
			try {
				double price = Double.parseDouble(products.get(i).getPrice());
				sum += price;
			} catch (NumberFormatException e) {

			}
		}

		double avg = sum / products.size();

		sess.setAttribute("sum", sum);
		sess.setAttribute("avg", avg);

		StringBuilder sb = new StringBuilder();
		sb.append("<h1> Cena obliczona, zobacz podsumowanie</h1>")
				.append("<a href = \"/TechSiec_1/Servlet03\"> Klik</a> ");
		response.getWriter().append(sb);

	}

}
