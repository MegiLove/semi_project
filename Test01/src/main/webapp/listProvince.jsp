<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<String> list =(ArrayList<String>) request.getAttribute("list");
	Gson gson = new Gson();
	String str = gson.toJson(list);
%>
<%= str %>