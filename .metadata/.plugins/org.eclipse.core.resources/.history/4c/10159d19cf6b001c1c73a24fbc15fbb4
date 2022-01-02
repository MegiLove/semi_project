<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/signup.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap" rel="stylesheet">
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript">
	function checkForm() {
		var regExpPwd = /^[0-9a-zA-Z]{8,20}$/;
		var regExpName = /^[가-힣]*$/;
		var regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/;
		var regExpEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
		
		var pwd = document.loginForm.cust_pwd.value;
		var pwdCheck = document.loginForm.cust_pwdCheck.value;
		var name = document.loginForm.cust_name.value;
		var phone = document.loginForm.cust_phone.value;
		var email = document.loginForm.cust_email.value;
		var addr = document.loginForm.cust_addr.value;
		var idDp = document.loginForm.idDuplication.value;
		
		if(idDp != "idCheck"){
			alert("아이디 중복 검사를 해주세요");
			return false;
		}
		if(!regExpPwd.test(pwd)){
			alert("비밀번호는 영문, 숫자 조합 8자 이상 입력해 주세요");
			document.loginForm.pwd.focus();
			return false;
		}
		if(pwd != pwdCheck){
			alert("비밀번호를 동일하게 입력해 주세요");
			return false;
		}
		if(!regExpName.test(name)){
			alert("이름은 한글만 입력해 주세요");
			document.loginForm.name.focus();
			return false;
		}
		if(!regExpPhone.test(phone)){
			alert("전화번호 형식에 맞지 않습니다");
			document.loginForm.phone.focus();
			return false;
		}
		if(!regExpEmail.test(email)){
			alert("이메일 형식에 맞지 않습니다");
			document.loginForm.email.focus();
			return false;
		}
		if(addr == ""){
			alert("주소를 입력해 주세요");
			document.loginForm.addr.focus();
			return false;
		}
		document.loginForm.submit();
	}
	
	function kakaopost() {
	    new daum.Postcode({
	        oncomplete: function(data) {
	           document.querySelector("#zipcode").value = data.zonecode;
	           document.querySelector("#address").value =  data.address
	        }
	    }).open();
	}
	
	function winopen(){
		//새창을 열어서 페이지를 오픈 후 -> 회원아이디정보를 가지고 중복체크
		//1. 아이디가 없으면 알림창과 진행x
		if(document.loginForm.cust_id.value == "" || document.loginForm.cust_id.value.length < 0){
			alert("아이디를 먼저 입력해 주세요")
			document.loginForm.cust_id.focus();
		}else{
			//2. 회원정보아이디를 가지고 있는 지 체크하려면 DB에 접근해야한다.
			//자바스크립트로 어떻게 DB에 접근할까? => 파라미터로 id값을 가져가서 jsp페이지에서 진행하면 된다.
			window.open("signupIdCheck.jsp?cust_id="+document.loginForm.cust_id.value,"","width=500, height=300");
		}
	}
 
 function inputIdCheck(){
	 document.loginForm.idDuplication.value = "idUncheck";
 }
</script>
</head>
<body>
	<jsp:include page="header1.jsp"/>
	
	<form action="signupOK.do" method="post" name="loginForm">
		<div class="register-container">
			
			<div id="register-user">
				<h2>회원 가입</h2>
			</div>
			
			<div id="register-article">
				<strong class="register-tf">아이디</strong>
				<div class="register-subtitle">
					<label for="user-id" class="register-lab"></label>
					<input class="register-input" id="user-id" type="text" placeholder="아이디 입력" name="cust_id" onkeydown="inputIdCheck()">
					<input type="button" value="아이디 중복 확인" onclick="winopen()">
					<input type="hidden" name="idDuplication" value="idUncheck">
				</div>
					 
				<strong class="register-tf">비밀번호</strong>
				<div class="register-subtitle">
					<label for="user-pwd" class="register-lab"></label>
					<input class="register-input" id="user-pwd" type="password" placeholder="비밀번호 입력" name="cust_pwd"> *숫자,영문 조합 8자 이상<br>
					<input class="register-input" type="password" placeholder="비밀번호 확인" name="cust_pwdCheck">
					<div style="height: 15px;"></div>
				</div>
					
				<strong class="register-tf">이름</strong>
				<div class="register-subtitle">
					<label for="user-name" class="register-lab"></label>
					<input class="register-input" id="user-name" type="text" placeholder="이름 입력" name="cust_name">
				</div>
				
				  <strong class="register-tf">성별</strong>
                <div class="register-subtitle" style="margin-top: 10px;">
         			<c:if test= "${gender=='male'}">
                   <label for="user-male" class="register-lab">남
                        <input class="register-input gender" type="radio" id="user-male" name="gender_code" value="1" checked="checked"
                           style="width: 15px;height: 15px;">
                    </label>
                    <label for="user-female" class="register-lab">여
                         <input class="register-input gender" type="radio" id="user-female" name="gender_code" value="2"
                            style="width: 15px;height: 15px;">
                     </label>
                    </c:if>
                    <c:if test= "${gender=='female'}">
                   <label for="user-male" class="register-lab">남
                        <input class="register-input gender" type="radio" id="user-male" name="gender_code" value="1"
                           style="width: 15px;height: 15px;">
                    </label>
                    <label for="user-female" class="register-lab">여
                         <input class="register-input gender" type="radio" id="user-female" name="gender_code" value="2"  checked="checked"
                            style="width: 15px;height: 15px;">
                     </label>
                    </c:if>
                 </div>
				
				
				<strong class="register-tf">전화번호</strong>
				<div class="register-subtitle">
					<label for="user-tel" class="register-lab"></label>
					<input class="register-input" type="tel" id="user-tel" placeholder="전화번호 입력" name="cust_phone">
				</div>
				
				<strong class="register-tf">이메일</strong>
				<div class="register-subtitle">
					<label for="user-email" class="register-lab"></label>
					<input class="register-input" type="email" id="user-email" placeholder="이메일 입력" name="cust_email" value="${email}"> 
				</div>
				
				<strong class="register-tf">주소</strong>
				<div class="register-subtitle">
					<label><input class="register-input addr1" placeholder="우편번호 입력" type="text" name="zipcode" id="zipcode" size="7" readonly="readonly" style="width: 200"> 
	                		<input type="button" value="우편번호찾기" onclick="kakaopost()" style="width: 200">
	                </label>
					<label><input class="register-input addr2" placeholder="주소 입력" type="text" name="cust_addr" id="address" size="70" readonly="readonly">
	                </label>
				</div>
				
				<div class="register-submit">
					<input id="submit_all" type="button" value="가입하기" onclick="checkForm()">
				</div>
			</div>
		</div>
	</form>
	
	<jsp:include page="footer.jsp"/>
</body>
</html>