package com.sist.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.db.ConnectionProvider;
import com.sist.vo.LocationVO;

public class LocationDAO {
	
	public LocationVO searchXY(String dong) {
		LocationVO loc= null;
		
		return loc;
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
			System.out.println("오류처리: "+e.getMessage());
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
			System.out.println("오류처리: "+e.getMessage());
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
			System.out.println("오류처리: "+e.getMessage());
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
			System.out.println("오류처리: "+e.getMessage());
		}
		return list;
	}
}