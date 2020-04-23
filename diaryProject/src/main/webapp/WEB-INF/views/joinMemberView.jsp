<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/resources/script/joinCheck.js"></script>


</head>
<body>
	
	<div>	
	<h3>아이디</h3> 
	<input id="id" type="text" name="id"  onblur="regCheck1()"/><br/>
	<span id="errorId" style="color: red;"></span>
	
	<h3>비밀번호</h3>
	<input id="password" type="text" name="password" onblur="regCheck2()"/><br/>
	<span id="errorPw" style="color: red;"></span>
	
	<h3>비밀번호 재확인</h3>
	<input type="text" name="password_re"/>
	</div>
	
	<h3>이름</h3>
	<input type="text" name="name"/>
	<h3>생년월일</h3>
	<input type="text" name="birth_day"/>
	<h3>전화번호</h3>
	<input type="text" name="phone_number"/>
	<h3>성별</h3>
	<input type="radio" value="남자" name="gender">남자</input>
	<input type="radio" value="여자" name="gender">여자</input>
</body>
</html>