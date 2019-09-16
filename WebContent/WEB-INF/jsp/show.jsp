<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="bean.Fruit" %>
 <%
 Fruit fruit = (Fruit) request.getAttribute("strawberry");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フルーツの値段</title>
</head>
<body>
<h1>フルーツの値段</h1>
<p>
フルーツ：<%= fruit.getName() %>
値段：<%= fruit.getPrice() %>
</body>
</html>