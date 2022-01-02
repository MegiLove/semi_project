package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sist.db.ConnectionProvider;
import com.sist.vo.FashionVO;

public class Clothes_topDAO {
	
	public String searchTop(int top_no) {
		String top_type = null;
		String sql = "select top_type from clothes_top where top_no=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, top_no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				top_type = rs.getString(1);  
			}
			ConnectionProvider.close(conn, pstmt, rs);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return top_type;
	}
}
