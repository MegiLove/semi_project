package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Header2Action implements SistAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		
		String now_id = (String)session.getAttribute("now_id");
		System.out.println("now_id:"+now_id);
		
		return "main.jsp";
	}

}
