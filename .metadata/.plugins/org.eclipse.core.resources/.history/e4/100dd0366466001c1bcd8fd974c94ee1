package com.sist.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.dao.QnADAO;
import com.sist.vo.QnAVO;

public class listQnAAction implements SistAction {
	public QnADAO dao;
	public listQnAAction() {
		dao = new QnADAO();
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		request.setCharacterEncoding("utf-8");
		String orderColum = request.getParameter("orderColum");
		System.out.println("정렬칼럼 : " + orderColum);
		
		String searchColum = request.getParameter("searchColum");
		System.out.println("검색컬럼:" + searchColum);
		
		String keyword = request.getParameter("keyword");
		System.out.println("검색어:"+keyword);
		
		//새로운 검색어가 없고, 그대신에 아까 검색한게 있다면
		if(keyword == null && session.getAttribute("keyword")!=null) {
			searchColum = (String)session.getAttribute("searchColum");
			keyword = (String)session.getAttribute("keyword");
		}
		
		//새로운 정렬컬럼이 없고 그대신에 아까 정렬한게 있다면
		if(orderColum == null && session.getAttribute("orderColum") != null) {
			orderColum = (String)session.getAttribute("orderColum");
		}
		
		int pageNUM = 1;
		if(request.getParameter("pageNUM") != null) {
			pageNUM = Integer.parseInt(request.getParameter("pageNUM"));
		}
		System.out.println("pageNUM:"+pageNUM);
		
		ArrayList<QnAVO> list  = dao.listBoard(pageNUM,orderColum,searchColum, keyword);
		request.setAttribute("totalPage", QnADAO.totalPage);
		request.setAttribute("list", list);
		
		if(keyword != null) {
			session.setAttribute("keyword", keyword);
			session.setAttribute("searchColum", searchColum);
		}
		
		if(orderColum != null) {
			session.setAttribute("orderColum", orderColum);
		}
		
		return "listQnA.jsp";
	}
}




