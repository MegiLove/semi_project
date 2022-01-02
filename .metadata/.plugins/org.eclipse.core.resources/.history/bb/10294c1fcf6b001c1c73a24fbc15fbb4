package com.sist.action;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.dao.LocationDAO;
import com.sist.util.Weather;
import com.sist.vo.LocationVO;

public class SearchXYAction implements SistAction {
	public LocationDAO dao;
	public SearchXYAction() {
		dao = new LocationDAO();
	}
	  
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = ((HttpServletRequest)request).getSession();
		
		request.setCharacterEncoding("utf-8");
		
		String district = request.getParameter("district");
		String dong = request.getParameter("dong");
		session.setAttribute("dong", dong);
		
		LocationVO l = dao.searchXY(district, dong);
		int x_coord = l.getX_coord();
		int y_coord = l.getY_coord();
		String location_code = l.getLocation_code();
		
		
		session.setAttribute("x_coord", x_coord);
		session.setAttribute("y_coord", y_coord);
		session.setAttribute("location_code", location_code);
		
		System.out.println("searchXYaction 동작함=========================================================");
		System.out.println("x_coord:"+x_coord);
		System.out.println("y_coord:"+y_coord);
		System.out.println("location_code:"+location_code);
		
		Weather w = new Weather();
		HashMap<String, String> map = w.getInfo(x_coord, y_coord, location_code);
		
		session.setAttribute("map", map);
		System.out.println("map:"+map);
		
		
		session.setAttribute("dataValue_tmp", map.get("dataValue_tmp"));
		session.setAttribute("dataValue_pop", map.get("dataValue_pop"));
		session.setAttribute("today_uv", map.get("today_uv"));
		
		return "main.jsp";
	}

}
