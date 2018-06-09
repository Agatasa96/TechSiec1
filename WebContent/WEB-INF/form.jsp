<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Witaj w sklepie!</title>
</head>
<body>

	<form action="/TechSiec_1/Servlet01" method="post">
		<div>
			Produkt <input type="text" name="name1"> Cena <input
				type="text" name="price1">
		</div>
		<div>
			Produkt <input type="text" name="name2"> Cena <input
				type="text" name="price2">
		</div>
		<div>
			Produkt <input type="text" name="name3"> Cena <input
				type="text" name="price3">
		</div>
		<div>
			Produkt <input type="text" name="name4"> Cena <input
				type="text" name="price4">
		</div>
		<input type="submit" value="Dodaj do koszyka">
	</form>

</body>
</html>