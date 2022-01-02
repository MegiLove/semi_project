package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sist.db.ConnectionProvider;

public class Clothes_bottomsDAO {

	public String searchBottoms(int bottoms_no){
		String bottoms_type = null;
		String sql = "select bottoms_type from clothes_bottoms where bottoms_no=?";
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bottoms_no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				bottoms_type = rs.getString(1);
			}
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		return bottoms_type;
	}
}
