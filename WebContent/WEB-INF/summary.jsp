<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		HttpSession sess = request.getSession();
		double sum = (double) sess.getAttribute("sum");
		double avg = (double) sess.getAttribute("avg");
		List<Product> products = (List<Product>) sess.getAttribute("produkty");
	%>
	<table border="1" type="all">
		<%
			for (int i = 0; i < products.size(); i++) {
		%>
		<tr>
			<th><%=products.get(i).getName()%></th>
			<th><%=products.get(i).getPrice()%></th>
		</tr>
		<%
			}
		%>
	</table>
	<h4>
		Suma:
		<%=sum%></h4>
	<h4>
		Srednia:
		<%=avg%>
	</h4>
</body>
</html>