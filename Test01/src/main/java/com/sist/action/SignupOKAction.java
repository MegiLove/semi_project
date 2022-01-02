package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.CustomerDAO;
import com.sist.vo.CustomerVO;

public class SignupOKAction implements SistAction {
	public CustomerDAO dao;
	public SignupOKAction() {
		dao = new CustomerDAO();
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		CustomerVO c = new CustomerVO();
		c.setCust_id(request.getParameter("cust_id"));
		c.setCust_pwd(request.getParameter("cust_pwd"));
		c.setCust_name(request.getParameter("cust_name"));
		c.setGender_code(Integer.parseInt(request.getParameter("gender_code")));
		c.setCust_phone(request.getParameter("cust_phone"));
		c.setCust_email(request.getParameter("cust_email"));
		c.setCust_addr(request.getParameter("cust_addr"));
		
		int re = dao.insertCustomer(c);
		String viewPage = "";
		if(re == 1) {
			request.setAttribute("cust_id", c.getCust_id());
			viewPage = "signupOK.jsp";
		}else {
			viewPage = "error.jsp";
			request.setAttribute("msg", "회원가입에 실패하였습니다");
		}
		
		return viewPage;
	}

}
