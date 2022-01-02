<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/listQnA.css" type="text/css">
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
	<div id="QnAtable">
		<div id="keyword">
			<form name="keywordForm" action="listQnA.do" method="post">
				<select name="searchColum">
					<option name="q_title" value="qna_title">제목</option>
					<option name="q_custid" value="cust_id" >아이디</option>			
				</select>
			    <input type="search" name="keyword">
				<input type="submit" value="검색" onclick="checkKeyword()">
			</form>
		</div>
		<table border="1" width="80%">
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
						
						<a href="showContent.do?qna_no=${b.qna_no }">${b.qna_title }</a>
					</td>
					<td>${b.cust_id }</td>
					<td>${b.qna_date }</td>
					<td>${b.qna_hits }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
		<br>
		<br>
	<div id="paging">
		 <div id="paging-body">
	<c:forEach var="i" begin="1" end="${totalPage }">
		<a href="listQnA.do?pageNUM=${i }">${i }</a>&nbsp;&nbsp;
	</c:forEach>
		</div>
	</div>
	<div id="menu">
	<li><a href="insertQnA.do">글쓰기</a></li>
	</div>
	<div id="footer">
		<jsp:include page="footer.jsp"/>
		</div>
</body>
</html>