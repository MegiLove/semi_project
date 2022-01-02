package com.sist.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.dao.QnADAO;
import com.sist.vo.QnAVO;

public class ListQnAAction implements SistAction {

	public QnADAO dao;
	public ListQnAAction() {
		
		dao = new QnADAO();
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		request.setCharacterEncoding("utf-8");
		
		String searchColum = request.getParameter("searchColum");
		System.out.println("검색컬럼:" + searchColum);
		if(searchColum==null) {
			searchColum = "qna_title";
			System.out.println("searchColum is null set qna_title");
		}
		
		String keyword = request.getParameter("keyword");
		System.out.println("검색어:"+keyword);
		
		int pageNUM = 1;
		if(request.getParameter("pageNUM") != null) {
			pageNUM = Integer.parseInt(request.getParameter("pageNUM"));
		}
		System.out.println("pageNUM:"+pageNUM);
		
		ArrayList<QnAVO> list  = dao.listQnA(pageNUM,searchColum, keyword);
		request.setAttribute("totalPage", QnADAO.totalPage);
		request.setAttribute("list", list);
		
		if(keyword != null) {
			session.setAttribute("keyword", keyword);
			session.setAttribute("searchColum", searchColum);
		}
				
		return "listQnA.jsp";
	}
}
