package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.dao.QnADAO;
import com.sist.vo.CustomerVO;
import com.sist.vo.QnAVO;

public class UpdateQnAOKAction implements SistAction {
	public QnADAO dao;
	public UpdateQnAOKAction() {
		dao = new QnADAO();
	}
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("update액션 OK실행");
	
		
		QnAVO b = new QnAVO();
		b.setQna_title(request.getParameter("qna_title"));
		b.setCust_id(request.getParameter("cust_id"));
		b.setQna_content(request.getParameter("qna_content"));
		b.setQna_no(Integer.parseInt(request.getParameter("qna_no")));
	
		int re = dao.updateQnA(b);
		
		String viewPage = "";
		if(re == 1) {
			viewPage = "updateQnAOK.jsp";
		}else {
			viewPage = "error.jsp";
			request.setAttribute("msg", "문의 수정에 실패하였습니다.");
		}
		
		return viewPage;
		
		
	}

}
