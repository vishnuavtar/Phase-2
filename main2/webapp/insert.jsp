<%@page import="com.product.dao.DbUtil"%>
<%@page import="org.hibernate.dialect.DB2390Dialect"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Connection con = DbUtil.getConn();
String id =  request.getParameter("id");
String pname = request.getParameter("pname");
String price = request.getParameter("price");
int row=dao.insert(e);
if(row>0){
	out.print("insertion sucessful");
}
else{
	out.print("insertion failed");
}

%>

<form action="retrive.jsp">
<input type="submit" value="getallemp">
</form>
</body>
</html>
