<%@page import="com.avtar.dao.SubjectDAO"%>
<%@page import="com.avtar.pojo2.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve</title>
</head>
<body>
<h1>Details of all Subjects</h1>
<%
SubjectDAO dao=new SubjectDAO();
System.out.print("fine-1");
List<Subject> list=dao.getallsubject();
System.out.print("fine-2");
%>
<table border="1"> 
<tr><th>Subject ID</th><th>Subject Name</th><th>Edit</th><th><a hre="delete.jsp">Delete</a></th></tr>
<%for(Subject ss:list){ %>
<tr><td><%=ss.getId() %></td><td><%=ss.getSubjectname()%></td><td><a href="updateJSP.jsp">edit</</a></td><td><a href="delete.jsp">delete</a></td></tr>
<%}%>
</table>


</body>
</html>
