<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkContent(){
		var form= document.insertForm;
		if(form.qna_content.value == ""){
			alert("필수사항을 입력해주세요!");
			form.qna_content.focus();		
			return false;
			}
		if(form.qna_title.value == ""){
			alert("필수사항을 입력해주세요!");
			form.qna_title.focus();	
			return false;
			}	
		form.submit();
	}
	
	function checkReject(){
		if(confirm("작성을 취소하시겠습니까?")==true){
			document.insertForm.submit();
		}else{
			return;
		}
	}
</script>
<body>
	<h2>문의등록</h2>
	<hr>
	<form name="insertForm" action="insertQnAOK.do" method="post">
		<input type="hidden" name="no" value="${no}">
		제목 : <input type="text" name="qna_title" placeholder="필수 사항입니다"><br>
		아이디 : <input type="text" name="cust_id"><br>
		문의내용 : <br>
		<textarea rows="10" cols="80" name="qna_content" placeholder="필수 사항입니다"></textarea><br>
		<input type="submit" value="등록" onclick="checkContent()">
		<input id="re_button" type="button" value="취소" onclick="checkReject()">
		
	</form>
</body>
</html>