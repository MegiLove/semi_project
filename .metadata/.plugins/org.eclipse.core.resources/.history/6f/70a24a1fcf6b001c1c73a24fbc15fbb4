package com.sist.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sist.dao.LocationDAO;

public class ListDongAction implements SistAction {
	LocationDAO dao = new LocationDAO();
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String province = request.getParameter("province");
		String district = request.getParameter("district");
	
		ArrayList<String> list = dao.getDong2(province, district);
		request.setAttribute("list", list); 
		
		return "listDong.jsp";
	}

}
