package com.sist.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sist.dao.LocationDAO;

public class ListProvinceAction implements SistAction {
	LocationDAO dao = new LocationDAO();
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		ArrayList<String> list = dao.getProvince();
		request.setAttribute("list", list);
		
		return "listProvince.jsp";
	}

}


