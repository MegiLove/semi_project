package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupAction implements SistAction {
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email="";
		String gender="male";
		if(request.getParameter("email")!=null) {
			email=request.getParameter("email");
			gender=request.getParameter("gender");
		}
		
		request.setAttribute("email", email);
		request.setAttribute("gender", gender);
		
		return "signup.jsp";
	}

}
