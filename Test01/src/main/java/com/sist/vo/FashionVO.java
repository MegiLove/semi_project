package com.sist.vo;

public class FashionVO {
	private int fashion_no;	
	private int top_no;	
	private int bottoms_no;	
	private int outer_no;	
	private int etc_no;
	
	public FashionVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FashionVO(int fashion_no, int top_no, int bottoms_no, int outer_no, int etc_no) {
		super();
		this.fashion_no = fashion_no;
		this.top_no = top_no;
		this.bottoms_no = bottoms_no;
		this.outer_no = outer_no;
		this.etc_no = etc_no;
	}

	public int getFashion_no() {
		return fashion_no;
	}

	public void setFashion_no(int fashion_no) {
		this.fashion_no = fashion_no;
	}

	public int getTop_no() {
		return top_no;
	}

	public void setTop_no(int top_no) {
		this.top_no = top_no;
	}

	public int getBottoms_no() {
		return bottoms_no;
	}

	public void setBottoms_no(int bottoms_no) {
		this.bottoms_no = bottoms_no;
	}

	public int getOuter_no() {
		return outer_no;
	}

	public void setOuter_no(int outer_no) {
		this.outer_no = outer_no;
	}

	public int getEtc_no() {
		return etc_no;
	}

	public void setEtc_no(int etc_no) {
		this.etc_no = etc_no;
	}
	
	
	
	
}
