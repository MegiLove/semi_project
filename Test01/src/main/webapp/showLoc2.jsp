<%@page import="com.sist.vo.LocationVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.LocationDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	String []province_arr = (String[])request.getAttribute("province_arr");
	String []province_id = (String[])request.getAttribute("province_id");
	String []province_db = (String[])request.getAttribute("province_db");
	String []province_show = (String[])request.getAttribute("province_show");
	LocationDAO dao = new LocationDAO();

	ArrayList<LocationVO> list = dao.listAll();
%>


	<h2 class="skip">- 관심 지역 관리 -</h2>

<% for(int i=0; i<=16; i++){
		%>
			<fieldset>
				<div type="button" onClick="<%=province_show[i] %>"><%=province_arr[i] %></div>
				<div style="display:none" id="<%=province_id[i]%>">
					<ul id="district" class="listDistrict">
						<%
							for(LocationVO l : list){
								String province = l.getProvince();
								if(province.equals(province_db[i])){
								%>
									<tr>
										<td><%=l.getDistrict() %> </td>
									</tr>
								<%
								}
							}
						%>	
					</ul>
				</div>
			</fieldset>
 		<% 
	}
%> 
	
	<script>
<% for(int i=0; i<=16; i++){
	%> 
	function <%=province_show[i] %>{
		if(document.getElementById("<%=province_id[i]%>").style.display == "block"){
			document.getElementById("<%=province_id[i]%>").style.display="none";
		}
		else{
			document.getElementById("<%=province_id[i]%>").style.display="block"
		}
	}
	<%
	}
%> 	
	</script>
</body>
</html>