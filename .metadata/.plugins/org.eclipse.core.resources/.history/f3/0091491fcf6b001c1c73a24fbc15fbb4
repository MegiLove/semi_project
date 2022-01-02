package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.CustomerDAO;

public class Find_pwdOKAction implements SistAction {
	public CustomerDAO dao;
	public Find_pwdOKAction() {
		dao = new CustomerDAO();
	}
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String cust_id = request.getParameter("cust_id");
		String cust_phone = request.getParameter("cust_phone");
		String cust_email = request.getParameter("cust_email");
		String cust_pwd_p = dao.findPwd_p(cust_id, cust_phone);
		String cust_pwd_m = dao.findPwd_m(cust_id, cust_email);

		String viewPage = "";
		request.setAttribute("cust_pwd_p", cust_pwd_p);
		request.setAttribute("cust_pwd_m", cust_pwd_m);
		
		if(cust_pwd_p != "") {
			viewPage = "find_custpwd_p.jsp";
		}else if(cust_pwd_m != "") {
			viewPage = "find_custpwd_m.jsp";
		}else {
			viewPage = "error.jsp";
			request.setAttribute("msg", "잘못입력하셨습니다.");
		}
		
		return viewPage ;
	}

}
