<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<style>
.c1{text-align:center; position:absolute; font-size:30px; color:purple; left:35%;}
.c2{color:Green; font-size:50px; background-color:#E1D9D6;}
</style>
</head>
<body bgcolor="#F7C0AE">
<center>
<h1 class="c2">Student Registration</h1>

<div class="c1">
<form action="insert.jsp">
Student ID &nbsp &nbsp &nbsp &nbsp<input type="text" name="id" style="font-size:20px; color:blue;" required>
<br> <br>
Student Name &nbsp <input type="text" name="name" style="font-size:20px; color:blue;" required>
<br> <br>
Student Email &nbsp <input type="email" name="email" style="font-size:20px; color:blue;" required >
<br> <br>
<input type="submit" value="Add Record" style="font-size:30px; color:blue; width:450px;">


</form>

</div>
</center>
</body>
</html>
