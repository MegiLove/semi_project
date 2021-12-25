package com.sist.vo;

public class Clothes_topVO {
	private int top_no;	
	private String top_type;
	
	public Clothes_topVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Clothes_topVO(int top_no, String top_type) {
		super();
		this.top_no = top_no;
		this.top_type = top_type;
	}
	
	public int getTop_no() {
		return top_no;
	}
	public void setTop_no(int top_no) {
		this.top_no = top_no;
	}
	public String getTop_type() {
		return top_type;
	}
	public void setTop_type(String top_type) {
		this.top_type = top_type;
	}
	
}
