package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.db.ConnectionProvider;
import com.sist.vo.FashionVO;
import com.sist.vo.LocationVO;

public class FashionDAO {
	
	public FashionVO codi(int fashion_no) {
		FashionVO f = null;
		String sql = "select top_no, bottoms_no, outer_no, etc_no from fashion where fashion_no=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, fashion_no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				f = new FashionVO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
			}
			ConnectionProvider.close(conn, pstmt, rs);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return f;
	}
	
}
