<%@page import="com.example.demo.model.Product"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>Index page</title>
<script>
 function deleteData()
 {
	alert("You are going to delete data");
	document.myform.action="delete";
	document.myform.submit();
 }
 function updateData()
 {
	alert("You are going to update data");
	document.myform.action="update";
	document.myform.submit();
 }
 
</script>

</head>
<body>
	<h2>You register successfully...</h2>
	<%List<Product> product=(List<Product>)request.getAttribute("data"); %>
	<!-- show in tabular format -->
    <form name="myform">	
	<table border="2">
	  <thead>
	     <tr>
	        <th>select</th>
	        <th>prod Id</th>
	        <th>prod Name</th>
	        <th>prod Price</th>
	        <th>quantity</th>
	        <th>User name</th>
	        <th>Password</th>
	     </tr>
	  </thead>
	  <tbody>
	    <% for(Product p:product) {%>
	   	<tr>
	   	   <td><input type="radio" name="pid" value="<%= p.getPid() %>"></td>
	   	   <td><%= p.getPid() %></td>
	   	   <td><%= p.getPname() %></td>
	   	   <td><%= p.getPprice() %></td>
	   	   <td><%= p.getPquantity() %></td>
	   	   <td><%= p.getPuname() %></td>
	   	   <td><%= p.getPwd() %></td>
	   	</tr>
	    
	    <%} %>
	  </tbody>
	</table>
	<button onClick="deleteData()">Delete</button>
	<button onClick="updateData()">Update</button>
	</form>
	
</body>
</html>
