package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.QnADAO;
import com.sist.vo.QnAVO;

public class DeleteQnAAction implements SistAction {
	public QnADAO dao;
	public DeleteQnAAction() {
		dao = new QnADAO();
	}
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int qna_no = Integer.parseInt(request.getParameter("qna_no"));
		int re = dao.deleteQnA(qna_no);
		
		String viewPage = "";
		if(re == 1) {
			viewPage = "deleteQnAOK.jsp";
		}else {
			viewPage = "error.jsp";
			request.setAttribute("msg", "문의내역 삭제에 실패하였습니다.");
		}
		
		return viewPage;
		
	}

}
