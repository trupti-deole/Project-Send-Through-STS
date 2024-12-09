<%@page import="com.example.demo.model.Product"%>
<html>
<head>
<title>Index page</title>
</head>
<body>
    <% Product p=(Product)request.getAttribute("data"); %>
	<form action="edit">
	Product Id:<input type="number" name="pid" value=<%= p.getPid() %>><br>
		Product Name:<input type="text" name="pname" value=<%= p.getPname() %>><br>
		Product price:<input type="number" name="pprice" value=<%= p.getPprice() %>><br>
		Product Quantity:<input type="number" name="pquantity" value=<%= p.getPquantity() %>><br>
		User Name:<input type="text" name="puname" value=<%= p.getPuname() %>><br>
		Password:<input type="password" name="pwd" value=<%= p.getPwd() %>><br>
		<input type="submit" value="Submit"><br>
	</form>
</body>
</html>
