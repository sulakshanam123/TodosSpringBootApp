<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
    <h1>Hello, ${name}!</h1>
    <p>The current date and time is: <%= new java.util.Date() %></p>
</body>
</html>