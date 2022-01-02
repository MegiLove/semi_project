package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.QnADAO;
import com.sist.vo.QnAVO;

public class UpdateQnAAction implements SistAction {
	public QnADAO dao;
	public UpdateQnAAction() {
		dao = new QnADAO();
	}
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int qna_no = Integer.parseInt(request.getParameter("qna_no"));
		QnAVO b = dao.getQnA(qna_no);
		request.setAttribute("b", b);
		return "updateQnA.jsp";
		
		
	}

}
