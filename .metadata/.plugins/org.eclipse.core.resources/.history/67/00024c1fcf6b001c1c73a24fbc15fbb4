package com.sist.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.LocationDAO;
import com.sist.vo.LocationVO;

public class SearchLocationOKAction implements SistAction {
	
	public LocationDAO dao;
	public SearchLocationOKAction() {
		dao = new LocationDAO();
	}

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String dong = request.getParameter("dong");
		ArrayList<LocationVO> list = dao.searchAll(dong);
		
		request.setAttribute("list", list);

		return "main.jsp";
	}

}
