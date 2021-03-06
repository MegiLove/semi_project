package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.db.ConnectionProvider;
import com.sist.vo.QnAVO;

public class QnADAO {
	public static int pageSIZE = 10;	
	public static int totalRecord;		
	public static int totalPage;		
	
	
	
	public int getTotalRecord(String searchColum, String keyword) {
		int n = 0;
		String sql = "select count(*) from QnA ";
		if(keyword != null) {
			sql += " where " + searchColum + " like '%"+keyword+"%'";
		}
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				n = rs.getInt(1);
			}
			ConnectionProvider.close(conn, stmt, rs);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}
		return n;
	}
	
	public void updateHit(int qna_no) {
		String sql = "update QnA set qna_hits = qna_hits + 1 where qna_no=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, qna_no);
			pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public int getNextNo() {
		int qna_no = 0;
		String sql = "select nvl(max(qna_no),0)+1 from QnA";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				qna_no = rs.getInt(1);
			}
			ConnectionProvider.close(conn, pstmt, rs);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}
		return qna_no;
	}
	
	public int insertQnA(QnAVO b) {
		int re = -1;
		String sql = "insert into QnA values(?,?,sysdate,0,?,?)";
//		int qna_no = getNextNo();
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b.getQna_no());
			pstmt.setString(2, b.getQna_title());
			pstmt.setString(3, b.getQna_content());
			pstmt.setString(4, b.getCust_id());
			System.out.println(b.getQna_no()+","+b.getQna_title()+","+b.getQna_content()+","+b.getCust_id());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt);
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}
		return re;
	}
	
	public ArrayList<QnAVO> listQnA(int pageNUM, String searchColum, String keyword){
		totalRecord = getTotalRecord(searchColum, keyword);
		totalPage = (int)Math.ceil(totalRecord/(double)pageSIZE);
		System.out.println("전체레코드 수 : "+totalRecord);
		System.out.println("전체페이지 수 : "+totalPage);
		
		int start  = (pageNUM-1)* QnADAO.pageSIZE + 1;
		int end = start + QnADAO.pageSIZE - 1; 
		
		System.out.println("start:"+start);
		System.out.println("end:"+end);
		
		
		ArrayList<QnAVO> list = new ArrayList<QnAVO>();
		try {
			Connection conn = ConnectionProvider.getConnection();
			
			String sql2 = "select * from QnA";
			if(keyword != null) {
				sql2 += " where " + searchColum + " like '%"+keyword+"%'";
			}
			
			String sql = "select qna_no, qna_title, qna_date, qna_hits, cust_id from("
					+ "select rownum n,qna_no, qna_title, qna_date, qna_hits, cust_id "
					+ "from ("+sql2+" order by qna_no))"
					+ "where n between ? and ?";
			System.out.println("sql: "+sql);
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new QnAVO(
						rs.getInt(1), 		
						rs.getString(2), 
						rs.getDate(3),
						rs.getInt(4), 	
						rs.getString(5) 	
						));				
			}
			ConnectionProvider.close(conn, pstmt, rs);
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
	public QnAVO getQnA(int qna_no) {
		QnAVO b = null;
		try {
			Connection conn = ConnectionProvider.getConnection();
			String sql = "select * from QnA where qna_no=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, qna_no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				b = new QnAVO(
						rs.getInt(1), 		
						rs.getString(2), 
						rs.getDate(3),
						rs.getInt(4), 	
						rs.getString(5), 	
						rs.getString(6));			
						
			}
			ConnectionProvider.close(conn, pstmt, rs);
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}
		return b;
	}

	
	public ArrayList<QnAVO> listQnA_mypage(int pageNUM,/* String orderColum,*/ String searchColum, String keyword, String cust_id){
		totalRecord = getTotalRecord(searchColum, keyword);
		totalPage = (int)Math.ceil(totalRecord/(double)pageSIZE);
		System.out.println("전체레코드 수 : "+totalRecord);
		System.out.println("전체페이지 수 : "+totalPage);
		
		int start  = (pageNUM-1)* QnADAO.pageSIZE + 1;
		int end = start + QnADAO.pageSIZE - 1; 
		
		System.out.println("start:"+start);
		System.out.println("end:"+end);
		
		
		ArrayList<QnAVO> list = new ArrayList<QnAVO>();
		try {
			Connection conn = ConnectionProvider.getConnection();
			
			String sql = "select qna_no, qna_title, qna_date, qna_hits, cust_id from("
					+ "select rownum n,qna_no, qna_title, qna_date, qna_hits, cust_id "
					+ "from (select * from QnA where cust_id=?))"
					+ "where n between ? and ? order by qna_no";
			
			if(keyword != null) {
				sql = "select qna_no, qna_title, qna_date, qna_hits, cust_id from("
						+ "select rownum n,qna_no, qna_title, qna_date, qna_hits, cust_id "
						+ "from (select * from QnA where cust_id=? and " + searchColum + " like '%"+keyword+"%'))"
						+ "where n between ? and ? order by qna_no";
			}
			
			System.out.println("sql: "+sql);
				
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cust_id);
			pstmt.setInt(2, start);
			pstmt.setInt(3, end);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new QnAVO(
						rs.getInt(1), 		
						rs.getString(2), 
						rs.getDate(3),
						rs.getInt(4), 	
						rs.getString(5) 	
						));				
			}
			ConnectionProvider.close(conn, pstmt, rs);
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
	
	public int updateQnA(QnAVO b) {
		int re = -1;
		String sql = "update QnA set cust_id=?, qna_title=?, qna_content=? where qna_no=? ";
		try {
						
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getCust_id());
			pstmt.setString(2, b.getQna_title());
			pstmt.setString(3, b.getQna_content());
			pstmt.setInt(4, b.getQna_no());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt);
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}
		return re;
	}
	
	public int deleteQnA(int qna_no) {
		int re = -1;
		try {
			Connection conn = ConnectionProvider.getConnection();
			String sql = "delete QnA where qna_no=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, qna_no);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return re;
		
	}
	
}