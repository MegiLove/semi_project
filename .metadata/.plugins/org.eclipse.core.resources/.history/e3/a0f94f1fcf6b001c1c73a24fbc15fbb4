package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.db.ConnectionProvider;
import com.sist.vo.LocationVO;

public class LocationDAO {  
	public ArrayList<LocationVO> searchAll(String dong) {
		ArrayList<LocationVO> list = new ArrayList<LocationVO>();
		String sql = "select province,district,dong from location where dong like '%' ||?|| '%'";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dong);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new LocationVO(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			ConnectionProvider.close(conn, pstmt, rs);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return list;
	}
	
	public LocationVO searchXY(String district,String dong) {
		System.out.println("구 :"+ district);
		System.out.println("동 :"+ dong);
		
		LocationVO l = null;
		String sql = "select x_coord,y_coord,location_code from location where district=? and dong=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, district);
			pstmt.setString(2, dong);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("OK");
				l = new LocationVO(rs.getInt(1), rs.getInt(2), rs.getString(3));
				System.out.println("검색된객체:"+l);
			}
			ConnectionProvider.close(conn, pstmt, rs);
		} catch (Exception e) { 
			System.out.println("예외발생:"+e.getMessage());
		}
		return l;
	}
	
	public ArrayList<LocationVO> listAll(){
		String sql = "select province, district, dong"
				+ " from location"
				+ " group by province, district, dong"
				+ " order by province, district, dong";
		ArrayList<LocationVO> list = new ArrayList<LocationVO>();
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new LocationVO(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			ConnectionProvider.close(conn, stmt, rs);
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
		return list;
	}
	
	public ArrayList<String> getProvince(){
		String sql = "select province"
				+ " from location"
				+ " group by province"
				+ " order by province";
		ArrayList<String> list = new ArrayList<String>();
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString(1));
			}
			ConnectionProvider.close(conn, stmt, rs);
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
		return list;
	}
	public ArrayList<String> getDistrict(String province){
		String sql = "select district"
				+ " from location"
				+ " where province = '" + province + "'"
				+ " group by district"
				+ " order by district";
		ArrayList<String> list = new ArrayList<String>();
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString(1));
			}
			ConnectionProvider.close(conn, stmt, rs);
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
		return list;
	}

	public ArrayList<String> getDong(String district){
		String sql = "select dong"
				+ " from location"
				+ " where district = '" + district + "'"
				+ " group by dong"
				+ " order by dong";
		ArrayList<String> list = new ArrayList<String>();
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString(1));
			}
			ConnectionProvider.close(conn, stmt, rs);
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
		return list;
	}
	
	public ArrayList<String> getDong2(String province, String district){
		String sql = "select dong"
				+ " from location"
				+ " where province = '"+province+"' and district = '" + district + "'"
				+ " group by dong"
				+ " order by dong";
		ArrayList<String> list = new ArrayList<String>();
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString(1));
			}
			ConnectionProvider.close(conn, stmt, rs);
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
		return list;
	}
	
}
