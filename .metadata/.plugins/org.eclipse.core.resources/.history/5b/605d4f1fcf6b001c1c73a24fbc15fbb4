package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sist.db.ConnectionProvider;

public class Clothes_outerDAO {

	public String searchOuter(int outer_no){
		String outer_type = null;
		String sql = "select outer_type from clothes_outer where outer_no=?";
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, outer_no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				outer_type = rs.getString(1);
			}
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		return outer_type;
	}
}
