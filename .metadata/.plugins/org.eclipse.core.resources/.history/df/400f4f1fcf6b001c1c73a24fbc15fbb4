package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sist.db.ConnectionProvider;

public class Clothes_etcDAO {
	
	public String searchEtc(int etc_no){
		String etc_type = null;
		String sql = "select etc_type from clothes_etc where etc_no=?";
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, etc_no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				etc_type = rs.getString(1);
			}
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		return etc_type;
	}

}
