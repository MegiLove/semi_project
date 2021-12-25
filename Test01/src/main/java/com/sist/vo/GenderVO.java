package com.sist.vo;

public class GenderVO {
	private int gender_code;	
	private int gender_type;
	
	public GenderVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GenderVO(int gender_code, int gender_type) {
		super();
		this.gender_code = gender_code;
		this.gender_type = gender_type;
	}
	
	public int getGender_code() {
		return gender_code;
	}
	public void setGender_code(int gender_code) {
		this.gender_code = gender_code;
	}
	public int getGender_type() {
		return gender_type;
	}
	public void setGender_type(int gender_type) {
		this.gender_type = gender_type;
	}
	
	
}
