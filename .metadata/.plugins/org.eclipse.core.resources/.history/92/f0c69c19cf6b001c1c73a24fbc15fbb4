<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관심 지역 관리</title>
<link rel="stylesheet" href="css/mypage_loc.css" type="text/css">
<style type="text/css">
	#district{	
		display: none;
	}
	#dong{	
		display: none;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		var province;
		var district;
		$.ajax({url:"listProvince.do",success:function(data){
			$.each(data, function(index,item){
				var a = $("<option></option>").html(item)
				$("#province").append(a);
			});
		}});
		
		$("#province").change(function(){
		 province = $(this).val();
			$("#district").css("display","inline")
			$.ajax({
				url:"listDistrict.do?province="+province,
						success:function(data){
							$.each(data, function(index,item){
								var a = $("<option></option>").html(item)
								$("#district").append(a);
				});
			}});
			
		});
	
		
		$("#district").change(function(){
			district = $(this).val();
			$("#dong").css("display","inline")
			$.ajax({
				url:"listDong.do?province="+province+"&district="+district,
						success:function(data){
							$.each(data, function(index,item){
								var a = $("<option></option>").html(item)
								$("#dong").append(a);
					});
				}
			})
		});
	
	});
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
				<input id="my_menu" type="hidden" name="cust_id" value="${now_id }">
				<input id="my_menu" class="menu_button1" id="1" type="submit" value="회원정보 관리">
			</form>
			<form action="listQnA_mypage.do" method="post">
				<input id="my_menu" type="hidden" name="cust_id" value="${now_id }">
				<input id="my_menu" class="menu_button2" type="submit" value="나의게시물 관리">
			</form>
			<form action="showLoc.jsp" method="post">
				<input id="my_menu1" class="menu_button3" type="submit" value="관심지역 관리">
			</form>
		</div>
		
		<div class="loc_mypage">
			<form id="loc2" name="showLocForm" method="POST" action="showLocOK.do">      
				<h3 style="margin-right:0px;">관심지역 관리</h3>
				<hr>
		        <select name="province" id="province">
		        </select>
		        <select name="district" id="district"> 
		        </select>
		        <select name="dong" id="dong">
		        </select>
		        <input type="submit" value="선택">
		    </form>
		</div>    
	</div>
	
	<div id="footer">
		<jsp:include page="footer.jsp"/>
	</div>
	
</body>
</html>

