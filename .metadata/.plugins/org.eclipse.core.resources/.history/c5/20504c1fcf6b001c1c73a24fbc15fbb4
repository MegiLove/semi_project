package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.QnADAO;
import com.sist.vo.QnAVO;

public class ShowContentAction implements SistAction {

	public QnADAO dao;
	public ShowContentAction() {
		dao = new QnADAO();
	}

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int qna_no = Integer.parseInt(request.getParameter("qna_no"));
		dao.updateHit(qna_no);
		QnAVO b= dao.getQnA(qna_no);
		request.setAttribute("b", b);
		return "showContent.jsp";
	}

}