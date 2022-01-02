<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<link rel="stylesheet" href="css/mypage_cust_update.css" type="text/css">

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
	
	
</script>
</head>
<body>
	<%
		if(session.getAttribute("now_id") == null){
			%>
				<jsp:include page="header1.jsp" />
			<%
		}else{
			%>
				<jsp:include page="header2.jsp" />
			<%
		}
	%>
	
	<h2>&nbsp;&nbsp;&nbsp;MyPage</h2>
	<hr>
	<div class="mypage">
		<div class="menu_mypage">
			<form action="mypageMain.jsp" method="post">
				<input id="my_menu1" type="hidden" name="cust_id" value="${now_id }">
				<input id="my_menu1" class="menu_button1" id="1" type="submit" value="회원정보 관리">
			</form>
			<form action="listQnA_mypage.do" method="post">
				<input id="my_menu" type="hidden" name="cust_id" value="${now_id }">
				<input id="my_menu" class="menu_button2" type="submit" value="나의게시물 관리">
			</form>
			<form action="showLoc.jsp" method="post">
				<input id="my_menu" class="menu_button3" type="submit" value="관심지역 관리">
			</form>
		</div>
		
		<div class="login_mypage">
			<form id="login" action="update_custOK.do" method="post" name="loginForm">
				<h3 style="margin-right:0px;">회원 정보 수정</h3>
				<hr>
				<input type="hidden" name="cust_id" value="${c.cust_id }"><br>
				<table>
					<tr>
						<td id="title">이름</td>
						<td>
							<input type="text" name="cust_name" value="${c.cust_name }">
						</td>
					</tr>
					<tr>
						<td id="title">비밀번호</td>
						<td>
							<input type="password" name="cust_pwd"> *숫자,영문 조합 8자 이상
						</td>
					</tr>
					<tr>
						<td id="title">비밀번호 확인</td>
						<td>
							<input type="password" name="cust_pwdCheck">
						</td>
					</tr>
					
					<tr>
						<td id="title">성별</td>
						<td>
							<input type="radio" name="gender_code" value="1" checked="checked">남성	
							<input type="radio" name="gender_code" value="2">여성
							
						</td>
					</tr>
					<tr>
						<td id="title">휴대전화</td>
						<td>
							<input type="tel" name="cust_phone" value="${c.cust_phone }">
						</td>
					</tr>
					<tr>
						<td id="title">이메일</td>
						<td>
							<input type="email" name="cust_email" value="${c.cust_email }">
						</td>
					</tr>
					<tr>
			            <td id="title" width="200">우편번호</td>
			            <td>
			            	<input type="text" name="zipcode" id="zipcode" size="7" readonly="readonly"> 
			                <input type="button" value="우편번호찾기" onclick="kakaopost()">
			            </td>
			        </tr>
					<tr>
						<td id="title">주소</td>
						<td>
							<input type="text" name="cust_addr" id="address" size="70" readonly="readonly" value="${c.cust_addr }">
						</td>
					</tr>
				</table>
				<br>
				<br>
				<div class="register-submit">
					<input id="submit_all" type="button" value="수정" onclick="checkForm()">
					<input id="submit_all" type="reset" value="취소">
				</div>
			</form>
		</div>
	</div>
	
	<div id="footer">
		<jsp:include page="footer.jsp"/>
	</div>
	
	
</body>
</html>

