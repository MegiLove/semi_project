package com.sist.vo;

public class LocationVO {
	private	String	location_code;
	private	String province;	
	private	String district;
	private	String dong;	
	private	int X_coord;	
	private	int Y_coord;
	
	  
	
	
	public String getLocation_code() {
		return location_code;
	}

	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public int getX_coord() {
		return X_coord;
	}

	public void setX_coord(int x_coord) {
		X_coord = x_coord;
	}

	public int getY_coord() {
		return Y_coord;
	}

	public void setY_coord(int y_coord) {
		Y_coord = y_coord;
	}

	public LocationVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocationVO(String location_code, String province, String district, String dong, int x_coord, int y_coord) {
		super();
		this.location_code = location_code;
		this.province = province;
		this.district = district;
		this.dong = dong;
		X_coord = x_coord;
		Y_coord = y_coord;
	}

	public LocationVO(String province, String district, String dong) {
		super();
		this.province = province;
		this.district = district;
		this.dong = dong;
	}

	public LocationVO(int x_coord, int y_coord,String location_code) {
		super();
		
		X_coord = x_coord;
		Y_coord = y_coord;
		this.location_code = location_code;
	}
	
	
}
