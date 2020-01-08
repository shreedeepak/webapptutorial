<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: ShreeDeep
  Date: 08-01-2020
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web App Tutorial Page</title>
  </head>
  <body>
  <h1>Hello World !!!</h1>
  <p>This is first intellij Webtest jsp page</p>

  <%
    Date date=new Date();
    String s = date.toString();
    out.println("<h2>"+ s + "</h2>");
  %>
  </body>
</html>
