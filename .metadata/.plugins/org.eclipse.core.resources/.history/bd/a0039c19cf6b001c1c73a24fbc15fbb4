<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css" type="text/css">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap" rel="stylesheet">

</head>
<body>
	<div id="wrap">
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
		<div id="main">
		
		<img class="image-thumbnail">
			<div id="locate">

			<jsp:include page="searchLocation.jsp"/>
				<table class="table table-hover" style="width: 700px;text-align: center;margin-left: auto;margin-right: auto;">
					<c:forEach var="l" items="${list }">
					<tr>
						<td><a href="searchXY.do?district=${l.district }&dong=${l.dong}">${l.province } ${l.district } ${l.dong }</a></td>
					</tr>
					</c:forEach>
				</table>
				
				 
			<div id="locAndFas"> <!--웨더랑 패션을 감싸는 div-->
			
					<%
						if(session.getAttribute("dong") == null){
							%>
								<h3 id="loc">[지역명]<img src="images/location.png" width="30" height="30"></h3> 
							<%
						}else{
							%>
								<h3 id="loc">${dong }<img src="images/location.png" width="30" height="30"></h3>
							<%
						}
					%>
					<!-- <a href="change_fashion.do">날씨에맞는 옷 보기</a> -->
					<div class="main">
						<div class="div1">
						<h4 id="weather_title">- Weather -</h4>
							<div id="box1">
								<div id="temp" ><p id="p1">${dataValue_tmp }℃</p></div>
								<div id="rain"><p id="p1">${dataValue_pop }%</p></div>
								<div id="uv"><p id="p1">${today_uv }</p></div>
							</div>
						</div>
					</div>	
					
					
				
				<div class="main">
					<div id="container">
					<a href="change_fashion.do"><h4 id="fashion_title">- Fashion -</h4></a>
						<div class="div2">
							<div id="box2">								
								<div id="top"><img src="images/${top_type }" width="240px" height="220px" id="pic" ></div>
								<div id="bottom"><img src="images/${bottoms_type }" width="240px" height="220px" id="pic"></div>
								<div id="outer"><img src="images/${outer_type }" width="240px" height="220px" id="pic"></div>
								<div id="etc"><img src="images/${etc_type }" width="240px" height="220px" id="pic"></div>
							</div>
						</div>
					</div>
				</div>
					
			</div>
			</div>
		</div>
		<div id="footer">
		<jsp:include page="footer.jsp"/>
		</div>
	</div>
</body>
</html>
