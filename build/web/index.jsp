<%-- 
    Document   : firstjsp
    Created on : 19/06/2023, 01:22:50 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! html</h1>
        <% String bottle="hello world java";   %>
        <h2><%=bottle%></h2>
        <%
     String array[]=Alumno.select("select* from productos1");
        
      for( String a :array){
            out.println(a);
        }
        
        %>
       
    </body>
</html>
