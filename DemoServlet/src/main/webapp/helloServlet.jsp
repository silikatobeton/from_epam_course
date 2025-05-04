<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Fujitsu
  Date: 04.03.2025
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello servlet</title>
</head>
<body>
<h1> time</h1>
<%@ page import ="java.util.Date" %>
<% Date now=new Date();
String someString = "Текущая дата - "+ now;

%>
<p>
  <%= someString%>
</p>
</body>
</html>
