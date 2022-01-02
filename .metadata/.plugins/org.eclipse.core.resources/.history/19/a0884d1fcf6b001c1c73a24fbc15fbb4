package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.dao.CustomerDAO;
import com.sist.vo.CustomerVO;

public class Update_custAction implements SistAction {
	
	public CustomerDAO dao;
	public Update_custAction() {
		dao = new CustomerDAO();
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		
		String cust_id = request.getParameter("cust_id");
		String cust_pwd = request.getParameter("cust_pwd");
			
		int re = dao.mypage_login(cust_id, cust_pwd);
		
		String viewPage="";
		if(re == 1) {
			CustomerVO c= dao.getCustomer(cust_id);
			session.setAttribute("now_id", cust_id);
			request.setAttribute("c", c);
			viewPage = "update_cust.jsp";
		}else {
			viewPage = "error.jsp";
			request.setAttribute("msg", "비밀번호가 일치하지않습니다.");
		}
		
	return viewPage;
	}
}


