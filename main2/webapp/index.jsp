<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>

<h1>Add New Product in Database</h1>

<form action="insert" method="post">

Product ID <input type="text" name="id" required> <br> <br>
Product Name <input type="text" name="pname" required> <br> <br>
Product Price <input type="text" name="price" required> <br> <br>
<input type="submit" value = "Add Product">

</form>

</center>
</body>
</html>