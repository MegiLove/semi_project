<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/insertQnA.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap" rel="stylesheet">
</head>
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
<script type="text/javascript">
	function checkContent(){
		var form= document.insertForm;
		if(form.qna_content.value==""){
			alert("필수사항을 입력해주세요!");
			form.qna_content.focus();		
			return false;
			}
		if(form.qna_title.value==""){
			alert("필수사항을 입력해주세요!");
			form.qna_title.focus();	
			return false;
			}	
		form.submit();
	}
	
	function checkReject(){
		if(confirm("작성을 취소하시겠습니까?")==true){
			document.insertForm.reset();
			location.href='http://localhost:8080/semiTest01/listQnA.do';
		}else{
			return; 
		}
	}
	
</script>
<body>
<div id="QnAinsert">
	&nbsp;<h2>문의등록</h2>
	<hr>
	<form name="insertForm" action="insertQnAOK.do" method="post">
		<input type="hidden" name="no" value="${no}">
		제목 : <input type="text" name="qna_title" placeholder="필수 사항입니다" id=sub><br>
		아이디 :<input type="text" name="cust_id" value="${now_id}" id=sub> <br>
		문의내용 : <br>
		<textarea rows="10" cols="80" name="qna_content" placeholder="필수 사항입니다" id=sub></textarea><br>
		<input type="button" value="등록" onclick="checkContent()">
		<input id="re_button" type="button" value="취소" onclick="checkReject()">
</div>	
	</form>
	<div id="footer">
		<jsp:include page="footer.jsp"/>
		</div>
</body>
</html>