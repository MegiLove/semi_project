package com.sist.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Weather {
	public HashMap<String, String> getInfo(int nx, int ny, String location_code){
		HashMap<String, String> map = new HashMap<String, String>();
		String dataValue_tmp = "";
	    String dataValue_pop = "";
	    
	    Date now = new Date();
	    SimpleDateFormat today = new SimpleDateFormat("yyyyMMdd");
	    SimpleDateFormat today_h = new SimpleDateFormat("HH");
	    
	try{
		
		System.out.println("getinfo 동작함=========================================================");
		System.out.println("nx:"+nx);
		System.out.println("ny:"+ny);

		String baseDate = today.format(now);
		String baseTime = "0200"; 
		String serviceKey = "1UlV037okXGyhYGOoV4oRwalkxHMesBlS74QzjZXoOS23BwW1Q62QOLfVllVd6Bm4w1EhYLz6YZFFMfVZstoJw%3D%3D";
		String urlStr = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst?" + "serviceKey=" + serviceKey + "&pageNo=1" + "&numOfRows=4000" + "&dataType=JSON" + "&base_date=" + baseDate + "&base_time=" + baseTime + "&nx=" + nx + "&ny=" + ny; 
		System.out.println(urlStr);
		
		URL url = new URL(urlStr);  
		BufferedReader bf; 
		String line = ""; 
		String result="";
		 
		bf = new BufferedReader(new InputStreamReader(url.openStream())); 
		
		while((line=bf.readLine())!=null){ 
			result=result.concat(line); 
			System.out.println(result);
		}  
	
		JSONParser parsar = new JSONParser();
        JSONObject obj = (JSONObject) parsar.parse(result);
        JSONObject response1 = (JSONObject) obj.get("response");
        JSONObject body = (JSONObject)response1.get("body");
        JSONObject items = (JSONObject)body.get("items");
        JSONArray item = (JSONArray)items.get("item"); 

		String category; 
		JSONObject WeatherData; 
        String date = "";
        String time = "";
        String info = "";
        String fdate = "";
        String ftime = "";
		
		for(int i = 0 ; i < item.size(); i++) 
		{ 
			 WeatherData = (JSONObject) item.get(i);
             
            dataValue_pop = WeatherData.get("fcstValue").toString();
            dataValue_tmp = WeatherData.get("fcstValue").toString();
            info = WeatherData.get("category").toString();
            ftime = WeatherData.get("fcstTime").toString();
            fdate = WeatherData.get("fcstDate").toString();
           
            
            if(fdate.equals(today.format(now)) && ftime.equals(today_h.format(now)+"00")) {
            	if(info.equals("POP")) {
            		info = "강수확률 : ";
                	System.out.print("배열의 "+i+"번째 요소 ==> "); 
                	System.out.print(info);
                	System.out.println(dataValue_pop);  
                	//session.setAttribute("dataValue_pop",dataValue_pop);
                	map.put("dataValue_pop", dataValue_pop);
            	}
            	if(info.equals("TMP")){
            		info = "기온 : ";
 	                System.out.print("배열의 "+i+"번째 요소 ==> "); 
 	                System.out.print(info);
 	                System.out.println(dataValue_tmp);
 	                //session.setAttribute("dataValue_tmp",dataValue_tmp);
 	                map.put("dataValue_tmp", dataValue_tmp);
            	}           	                	
            }
		}	
		bf.close();
		
		//====================================================================
		map.put("today_uv", getUV(location_code));
//		${dataValue_tmp }
//		${dataValue_pop }
//		${today_uv }
//		
	}catch(Exception e){ 
		System.out.println(e.getMessage()); 
	} 
		return map;
	}
	
	public String getUV(String location_code) {
		String r = "";
		Date now = new Date();
	    SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
		
		try {
			//int code = (Integer)session.getAttribute("location_code");
			//System.out.println("changeweatheruvaction 동작함=========================================================");
			//System.out.println("code:"+code);
			
			String time = date.format(now)+"06";
			String serviceKey = "9KPOwuHGN9mDYQCNXjsox%2FbYItYoKOhHwviXZAdo%2Bxq%2FXd24V5X83ktPunJ8Yds7jTaAZxz4EhVFX%2FJoNPAqMg%3D%3D";
			String urlStr = "http://apis.data.go.kr/1360000/LivingWthrIdxServiceV2/getUVIdxV2?" + "serviceKey=" + serviceKey + "&pageNo=1" + "&numOfRows=1000" + "&dataType=JSON" + "&areaNo="+location_code+"&time="+time;
			
			URL url = new URL(urlStr);  
			BufferedReader bf; 
			String line = ""; 
			String result="";
			 
			bf = new BufferedReader(new InputStreamReader(url.openStream())); 
			
			while((line=bf.readLine())!=null){ 
				result=result.concat(line); 
				System.out.println(result);
			}
			JSONParser parsar = new JSONParser();
	        JSONObject obj = (JSONObject) parsar.parse(result);
	        JSONObject response1 = (JSONObject) obj.get("response");
	        JSONObject body = (JSONObject)response1.get("body");
	        JSONObject items = (JSONObject)body.get("items");
	        JSONArray item = (JSONArray)items.get("item"); 
	
			//String category; 
			JSONObject UVData;
			//String VALUE = "";
	        //String date = "";
	        //String time = "";
			String today_uv = "";
	        String tomorrow_uv ;
	        String dayaftertomorrow_uv ;
	        String twodaysaftertomorrow_uv ;
	        //String info = "";
			
			for(int i = 0 ; i < item.size(); i++) 
			{ 
				UVData = (JSONObject) item.get(i);
                //date = UVData.get("baseDate").toString();
                //time = UVData.get("baseTime").toString();
                today_uv = UVData.get("today").toString();
                tomorrow_uv = UVData.get("tomorrow").toString();
                dayaftertomorrow_uv = UVData.get("dayaftertomorrow").toString();
                twodaysaftertomorrow_uv = UVData.get("twodaysaftertomorrow").toString();
                //info = UVData.get("category").toString(); 
                 
	           //VALUE += today_uv + "," + tomorrow_uv + "," + dayaftertomorrow_uv + ","+twodaysaftertomorrow_uv+"\n";
	           System.out.println("today:"+today_uv+"tomorrow_uv:"+tomorrow_uv+"dayaftertomorrow:"+dayaftertomorrow_uv+"twodaysaftertomorrow:"+twodaysaftertomorrow_uv);
	           //session.setAttribute("today_uv", today_uv);
	           r = today_uv;
			}				
			bf.close(); 
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage()); 
		}
		return r;
	}
}
