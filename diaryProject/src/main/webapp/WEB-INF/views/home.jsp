<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<br/>
<br/>
<h1>Test Send Message</h1>
<form action="sendCode">
	<input type="text" name="number"/>
	<input type="submit" value="인증"/> 
</form>
</body>
</html>
