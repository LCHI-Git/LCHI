<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
	<div class="container">
		
		<div class="join_head">
			<h1>Couple Dairy Join Member</h1>
		</div>
		
		<div class="join_row">
			<h3 class="join_title">아이디</h3>
			<span class="input">
				<input type="text" name="id" maxlength="16"/>
			</span>
			<span id="id_error">
			
			</span>
		</div>
		
		<div class="join_row">
			<h3 class="join_title">비밀번호</h3>
			<span class="input">
				<input type="password" name="password" maxlength="18"/>
			</span>
			<span id="pw_error">
			
			</span>
		</div>
		
		<div class="join_row">
			<h3 class="join_title">이름</h3>
			<span class="input">
				<input type="text" name="name" maxlength="10"/>
			</span>
			<span id="name_error">
			
			</span>
		</div>
	
		<div class="join_row">
			<h3 class="join_title">전화번호</h3>
			<span class="input">
				<input type="text" name="phone_number" maxlength="10"/>
				<a href="test">인증번호받기</a>
			</span>
			<span id="phone_number_error">
			
			</span>
		</div>
	
	
		<div class="join_row">
			<h3 class="join_title">생년월일</h3>
			<span class="input">
				<input type="text" name="year" maxlength="4"/>
				<select>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
				</select>
				<input type="text" name="month" maxlength="1"/>
			</span>
			<span id="gender_error">
			
			</span>
		</div>
	
	
		<div class="join_row">
			<h3 class="join_title">성별</h3>
			<span class="input">
				<select id="gender" name="gender">
					<option selected="selected">성별</option>
					<option value="M">남자</option>
					<option value="W">여자</option>
				</select>
			</span>
			<span id="gender_error">
			
			</span>
		</div>
		
		<div id="submit">
			<input type="submit" value="가입하기">
		</div>
		
	
	
	</div>
	</form>
	
</body>
</html>