<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap" rel="stylesheet">
</head>
<body>
	<jsp:include page="header1.jsp"/>
		
	<div class="inner_login">
    	<div class="login">
		<form action="loginOK.do" method="post" id="authForm">
			<fieldset>
			<legend class="screen_out">로그인 정보 입력폼</legend>
			<div class="box_login">
				<div class="inp_text">
					<label for="loginId" class="screen_out"></label>
					<input type="text" id="loginId" name="cust_id" placeholder="아이디">
				</div>
				<div class="inp_text">
					<label for="loginPw" class="screen_out"></label>
					<input type="password" id="loginPw" name="cust_pwd" placeholder="비밀번호">
				</div>
			</div>
			<div class="register-submit" style="margin-top: 20px; text-align: center;">
				<input id="submit_all" type="submit" value="로그인">
			</div>
			<div class="login_append" style="overflow: hidden;padding: 15px 0 0;">
				<span class="txt_find">
                <a href="find_id.do" class="link_find" style="margin-right: 0;">아이디</a>
                    / 
                <a href="find_pwd.do" class="link_find" style="margin-right: 0;">비밀번호 찾기</a>
                </span>
			</div>
			</fieldset>
		</form>
		
		<hr>
		<div style=" text-align: center">
			<a href="javascript:kakaoLogin();"><img
				src="images/kakao_signup_logo.PNG"
				style="height: 45px; width: 45%; padding-left: 89px;"></a>
			<script src="http://developers.kakao.com/sdk/js/kakao.js"></script>
			<script>
			 //35c3cc0f08c2ed79977d3cc0c584dcca
			 window.Kakao.init("35c3cc0f08c2ed79977d3cc0c584dcca");
			 
			 function kakaoLogin() {
				window.Kakao.Auth.login({
					scope:'profile_nickname,account_email,gender',
					success: function(authObj){
						console.log(authObj);
						window.Kakao.API.request({
							url: '/v2/user/me',
							success: res => {
								const kakao_account= res.kakao_account;
								console.log(kakao_account);
								var email=kakao_account['email'];
								var gender= kakao_account['gender'];
								console.log(email);
								location.href="signup.do?email="+email+"&gender="+gender;
								}
							});
						}
					});
				}
			</script>
			<div class="register-submit">
				<button id="move-page" onclick="location.href='signup.do'">회원가입</button>
			</div>
		</div>
		</div>
	</div>
		
	<jsp:include page="footer.jsp"/>
</body>
</html>