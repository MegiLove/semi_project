package com.sist.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.dao.Clothes_bottomsDAO;
import com.sist.dao.Clothes_etcDAO;
import com.sist.dao.Clothes_outerDAO;
import com.sist.dao.Clothes_topDAO;
import com.sist.dao.FashionDAO;
import com.sist.vo.Clothes_topVO;
import com.sist.vo.FashionVO;

public class Change_fashionAction implements SistAction {
	
	public FashionDAO dao;
	public Clothes_topDAO dao_top;
	public Clothes_bottomsDAO dao_bottoms;
	public Clothes_outerDAO dao_outer;
	public Clothes_etcDAO dao_etc;
	
	public Change_fashionAction() {
		dao = new FashionDAO();
		dao_top = new Clothes_topDAO();
		dao_bottoms = new Clothes_bottomsDAO();
		dao_outer = new Clothes_outerDAO();
		dao_etc = new Clothes_etcDAO();
	}	

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		
		int fashion_no = 0;
		int top_no = 0;
		int bottoms_no = 0;
		int outer_no = 0;
		int etc_no = 0;
		String top_type = "";
		String bottoms_type = "";
		String outer_type = "";
		String etc_type = "";
		
		String tmp = (String)session.getAttribute("dataValue_tmp");
		String pop = (String)session.getAttribute("dataValue_pop");		
		String uv = (String)session.getAttribute("today_uv");
		System.out.println("기온:"+tmp);		
		System.out.println("강수확률:"+pop);		
		System.out.println("자외선:"+uv);		
		
		
		if((Integer.parseInt(tmp)) <= 11 && (Integer.parseInt(tmp)) >=10) {
			if((Integer.parseInt(pop)) == 0 ) {
				if((Integer.parseInt(uv)) >= 7) {
					fashion_no=19;
				}else {
					fashion_no=20;
				}
			}else if((Integer.parseInt(pop)) > 0  && (Integer.parseInt(pop)) < 30){
				fashion_no=20;
			}else {
				fashion_no=21;
			}	
			
		}else if((Integer.parseInt(tmp)) <= 9 && (Integer.parseInt(tmp)) > 5) {
			if((Integer.parseInt(pop)) == 0 ) {
				if((Integer.parseInt(uv)) >= 7) {
					fashion_no=22;
				}else {
					fashion_no=23;
				}
			}else if((Integer.parseInt(pop)) > 0  && (Integer.parseInt(pop)) < 30){
				fashion_no=23;
			}else {
				fashion_no=24;
			}
		}else if((Integer.parseInt(tmp)) <= 5) {
			if((Integer.parseInt(pop)) == 0 ) {
				if((Integer.parseInt(uv)) >= 7) {
					fashion_no=25;
				}else {
					fashion_no=26;
				}
			}else if((Integer.parseInt(pop)) > 0  && (Integer.parseInt(pop)) < 30){
				fashion_no=26;
			}else {
				fashion_no=27;
			}
		}	
				
			System.out.println("패션번호:"+fashion_no);
				FashionVO list = dao.codi(fashion_no);
				top_no = list.getTop_no();
				bottoms_no = list.getBottoms_no();
				outer_no = list.getOuter_no();
				etc_no = list.getEtc_no();
				
				top_type = dao_top.searchTop(top_no);
				bottoms_type = dao_bottoms.searchBottoms(bottoms_no);
				outer_type = dao_outer.searchOuter(outer_no);
				etc_type = dao_etc.searchEtc(etc_no);
				 
				session.setAttribute("top_type", top_type);
				session.setAttribute("bottoms_type", bottoms_type);
				session.setAttribute("outer_type", outer_type);
				session.setAttribute("etc_type", etc_type);
				
					
		return "main.jsp";
	}

}
	
