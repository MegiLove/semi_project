package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.sist.dao.CustomerDAO;
import com.sist.vo.CustomerVO;

public class Find_idOKAction implements SistAction {

	public CustomerDAO dao;
	public Find_idOKAction() {
		dao = new CustomerDAO();
	}
	
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String cust_name = request.getParameter("cust_name");
		String cust_phone = request.getParameter("cust_phone");
		String cust_email = request.getParameter("cust_email");
		String cust_id_p = dao.findId_p(cust_name, cust_phone);
		String cust_id_m = dao.findId_m(cust_name, cust_email);

		String viewPage = "";
		request.setAttribute("cust_id_p", cust_id_p);
		request.setAttribute("cust_id_m", cust_id_m);
		
		if(cust_id_p != "") {
			viewPage = "find_custid_p.jsp";
		}else if(cust_id_m != "") {
			viewPage = "find_custid_m.jsp";
		}else {
			viewPage = "error.jsp";
			request.setAttribute("msg", "찾는아이디가 없습니다.");
		}
		
		return viewPage ;
	}

}
