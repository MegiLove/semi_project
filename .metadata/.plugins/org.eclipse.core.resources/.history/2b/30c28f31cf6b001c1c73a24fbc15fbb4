<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 문의내역</title>
<link rel="stylesheet" href="css/mypage_qna.css" type="text/css">
</head>
<script type="text/javascript">
	function checkKeyword(){
		var form= document.keywordForm;
		if(form.keyword.value == ""){
			alert("검색내용을 입력해주세요!");
			form.keyword.focus();
			return false;
			}
		
		form.submit();
	}
</script>
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
				<input id="my_menu" type="hidden" name="cust_id" value="${now_id }">
				<input id="my_menu" class="menu_button1" id="1" type="submit" value="회원정보 관리">
			</form>
			<form action="listQnA_mypage.do" method="post">
				<input id="my_menu1" type="hidden" name="cust_id" value="${now_id }">
				<input id="my_menu1" class="menu_button2" type="submit" value="나의게시물 관리">
			</form>
			<form action="showLoc.jsp" method="post">
				<input id="my_menu" class="menu_button3" type="submit" value="관심지역 관리">
			</form>
		</div>
	
	
		<div class="listQnA_mypage">
			<h3 style="margin-right:0px;">나의 문의내역</h3>
				<hr>
			<form id="search" name="keywordForm" action="listQnA_mypage.do?cust_id=${now_id }" method="post">
				
				<select name="searchColum">
					<option name="q_title" value="qna_title">제목</option>
				</select>
			    <input type="search" name="keyword">
				<input type="submit" value="검색" onclick="checkKeyword()">
			</form>
		
		
			<table id="table" border="1" width="80%">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>아이디</th>
					<th>날짜</th>
					<th>조회</th>
					
				</tr>
				
				<c:forEach var="b" items="${list}">
					<tr>
						<td>${b.qna_no }</td>
						<td>
							
							<a href="showContent_mypage.do?qna_no=${b.qna_no }">${b.qna_title }</a>
						</td>
						<td>${b.cust_id }</td>
						<td>${b.qna_date }</td>
						<td>${b.qna_hits }</td>
					</tr>
				</c:forEach>
			</table>
					
			<br>
			<br>
			<c:forEach var="i" begin="1" end="${totalPage }">
				<a href="listQnA_mypage.do?pageNUM=${i }">${i }</a>&nbsp;&nbsp;
			</c:forEach>
		</div>
	</div>
	
	<div id="footer">
		<jsp:include page="footer.jsp"/>
	</div>
</body>
</html>
