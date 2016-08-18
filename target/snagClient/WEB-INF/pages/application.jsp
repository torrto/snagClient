<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Project Bark</title>
</head>
<body style="text-align: center">
<form action="/submitForm" method="post">
	<p>Name: <input type="text" name="username" value=""/></p>
	<p>Email: <input type="text" name="email"/></p>
	<p>Phone: <input type="text" name="phone"/></p>
	<%--<p>Questions</p>--%>
	<%--<p>Question 1: Are you 18 or older? <input type="text" name="question1"/></p>--%>
	<%--<p>Question 2: Can you program? <input type="text" name="question2"/></p>--%>
	<%--<p>Question 3: Do you live in the US? <input type="text" name="question3"/></p>--%>
	<%--<br>--%>
	<p><input value="Login" type="submit"></p>
	<br>
</form>