package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.dao.QnADAO;
import com.sist.vo.QnAVO;

public class ShowContent_mypageAction implements SistAction {
	
	public QnADAO dao;
	public ShowContent_mypageAction() {
		dao = new QnADAO();
	}

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = ((HttpServletRequest)request).getSession();
		String cust_id = request.getParameter("cust_id");
		
		int qna_no = Integer.parseInt(request.getParameter("qna_no"));
		dao.updateHit(qna_no);
		QnAVO b= dao.getQnA(qna_no);
		request.setAttribute("b", b);
		return "showContent_mypage.jsp";

	}

}