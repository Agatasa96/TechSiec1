

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
 * Servlet implementation class Servlet01
 */
@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product p1 = new Product(request.getParameter("name1"), request.getParameter("price1"));
		Product p2 = new Product(request.getParameter("name2"), request.getParameter("price2"));
		Product p3 = new Product(request.getParameter("name3"), request.getParameter("price3"));
		Product p4 = new Product(request.getParameter("name4"), request.getParameter("price4"));
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		StringBuilder sb = new StringBuilder();
		HttpSession sess = request.getSession();
		
		if (products.get(0).getName()==null || products.get(0).getPrice()==null){
			sb.append("<h1> Dodaj cos do koszyka...</h1>")
			.append("<div><a href = \"/TechSiec_1/strGlowna.html\">Powrot do strony glownej</a></div> ");
			response.getWriter().append(sb);
		}
		else{
			sess.setAttribute("produkty", products);
			sb.append("<h1> Oblicz cene produktow </h1>")
			.append("<a href = \"/TechSiec_1/Servlet02\"> Klik</a> ");
			response.getWriter().append(sb);
			
		}
		
	}

}
