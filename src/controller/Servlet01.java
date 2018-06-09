package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;

/**
 * Servlet implementation class Servlet01
 */
@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/form.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Product p1 = new Product(request.getParameter("name1"), request.getParameter("price1"));
		Product p2 = new Product(request.getParameter("name2"), request.getParameter("price2"));
		Product p3 = new Product(request.getParameter("name3"), request.getParameter("price3"));
		Product p4 = new Product(request.getParameter("name4"), request.getParameter("price4"));
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);

		HttpSession sess = request.getSession();

		if (products.get(0).getName() == null || products.get(0).getPrice() == null) {
			getServletContext().getRequestDispatcher("/WEB-INF/form.jsp").forward(request, response);
		} else {
			sess.setAttribute("produkty", products);
			response.sendRedirect(request.getContextPath() + "/Servlet02");

		}

	}

}
