/**
 * Join Member Check
 */

function alreadyCheck() {
	alert("f");
}

function regCheck1(){
	
	var id = document.getElementById("id").value;
	var regType1 = /^[A-Za-z0-9+]{8,16}$/;
	var idSpan = document.getElementById("errorId");
	
	if(!regType1.test(id)){
		idSpan.innerHTML = "영문숫자 조합 8~16자 사이로 입력해주세요!";
	}
	else{
		idSpan.innerHTML = "";
	}
	
}

function regCheck2() {
	var pw = document.getElementById("password").value;
	var regType2 = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{10,18}$/;
	var idSpan = document.getElementById("errorPw");
	
	if(!regType2.test(pw)){
		idSpan.innerHTML = "영문(대,소문자) 숫자, 특수문자 조합 10~18자 사이로 입력해주세요!";
	}
	else{
		idSpan.innerHTML = "";
	}
}