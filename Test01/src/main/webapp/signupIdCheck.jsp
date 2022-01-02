<%@page import="com.sist.dao.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap" rel="stylesheet">
<style type="text/css">
*{
	font-family: 'IBM Plex Sans KR', sans-serif;
}
</style>
</head>
<body>
	<h2>아이디중복체크</h2>
	<%
	request.setCharacterEncoding("UTF-8");
	String cust_id = request.getParameter("cust_id");
	
	CustomerDAO dao = new CustomerDAO();
	

	int result = dao.doubleCheckId(cust_id);
	if (result >= 1){
		out.print("중복된 아이디입니다");
	}else{
		out.print("사용가능한 아이디입니다");
		%>
		 <input type="button" value="아이디 사용하기" onclick="result()" style="margin-top: 2px;">
		<%
	}
	
	%>
	
	<fieldset>
		<form action="signupIdCheck.jsp" method="post" name="idcheck">
			아이디 : <input type="text" name="cust_id" value="<%=cust_id%>">
			<input type="submit" value="중복 확인">	 
		</form>
	</fieldset>
	
	 <script type="text/javascript">
	    function result(){
	    	opener.document.loginForm.idDuplication.value = "idCheck";
	    	opener.document.loginForm.cust_id.value = document.idcheck.cust_id.value;
	    	opener.document.loginForm.cust_id.readOnly=true;
	    	window.close();
	    }
	 
	 </script>
</body>
</html>