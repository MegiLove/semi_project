package com.sist.vo;

public class CustomerVO {
	private	String cust_id;
	private	String cust_name;	
	private	String cust_pwd;	
	private	String cust_addr;	
	private	String cust_phone;	
	private	String cust_email;	
	private	int gender_code;
	
	public CustomerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerVO(String cust_id, String cust_name, String cust_pwd, String cust_addr, String cust_phone,
			String cust_email, int gender_code) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_pwd = cust_pwd;
		this.cust_addr = cust_addr;
		this.cust_phone = cust_phone;
		this.cust_email = cust_email;
		this.gender_code = gender_code;
	}
	
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_pwd() {
		return cust_pwd;
	}
	public void setCust_pwd(String cust_pwd) {
		this.cust_pwd = cust_pwd;
	}
	public String getCust_addr() {
		return cust_addr;
	}
	public void setCust_addr(String cust_addr) {
		this.cust_addr = cust_addr;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public int getGender_code() {
		return gender_code;
	}
	public void setGender_code(int gender_code) {
		this.gender_code = gender_code;
	}
	
	
}
