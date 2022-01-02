package com.sist.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.action.SistAction;

/**
 * Servlet implementation class SistController
 */
@WebServlet("*.do")
public class SistController extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	HashMap<String, SistAction> map;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SistController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//super.init(config);
		map = new HashMap<String, SistAction>();
		try {
			String path = config.getServletContext().getRealPath("WEB-INF");
			FileReader fr = new FileReader(path + "/" + "sist.properties");
			Properties prop = new Properties();
			prop.load(fr);

			//key목록을 set으로 반환, iterator가 필요
			Iterator keyList = prop.keySet().iterator(); 

			while(keyList.hasNext()) {
				String key = (String)keyList.next();	//object로 반환이 되기 때문에 String으로 형변환이 필요
				String clsName = prop.getProperty(key);
				SistAction obj = (SistAction)Class.forName(clsName).newInstance();
				map.put(key, obj);
				
				
			}
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		proRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		proRequest(request, response);
	}
	
	public void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		/*
			/day1222/listBoard.do
		*/
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		SistAction action = map.get(cmd); //map.get(cmd) => key //new ListBoardAction()의 객체
		String viewPage = action.proRequest(request, response);//listBoard.jsp
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}

