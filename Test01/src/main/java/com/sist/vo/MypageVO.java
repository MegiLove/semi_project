package com.sist.vo;

public class MypageVO {
	private String cust_id;	
	private String interest_location1;	
	private String interest_location2;	
	private String interest_location3;
	
	public MypageVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MypageVO(String cust_id, String interest_location1, String interest_location2, String interest_location3) {
		super();
		this.cust_id = cust_id;
		this.interest_location1 = interest_location1;
		this.interest_location2 = interest_location2;
		this.interest_location3 = interest_location3;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getInterest_location1() {
		return interest_location1;
	}

	public void setInterest_location1(String interest_location1) {
		this.interest_location1 = interest_location1;
	}

	public String getInterest_location2() {
		return interest_location2;
	}

	public void setInterest_location2(String interest_location2) {
		this.interest_location2 = interest_location2;
	}

	public String getInterest_location3() {
		return interest_location3;
	}

	public void setInterest_location3(String interest_location3) {
		this.interest_location3 = interest_location3;
	}
	
	
}

