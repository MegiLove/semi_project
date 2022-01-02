package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.dao.CustomerDAO;

public class LoginOKAction implements SistAction {
	public CustomerDAO dao;
	public LoginOKAction() {
		dao = new CustomerDAO();
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		
		String cust_id = request.getParameter("cust_id");
		String cust_pwd = request.getParameter("cust_pwd");
		
		int result = dao.checkCustomer(cust_id, cust_pwd);
		String viewPage = "";
		if(result == 1) {
			session.setAttribute("now_id", cust_id);
			viewPage = "header2.do";
		}else {
			viewPage = "error.jsp";
			request.setAttribute("msg", "로그인에 실패하였습니다");
		}
		
		return viewPage;
	}

}
