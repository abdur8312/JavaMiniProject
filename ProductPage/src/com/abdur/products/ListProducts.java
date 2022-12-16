package com.abdur.products;

public class ListProducts {
	private String bk1;
	private String bk2;
	private int rt_bk1;
	private int rt_bk2;
	private int qty_bk1;
	private int qty_bk2;
	
	public String getBk1() {
		return bk1;
	}
	public void setBk1(String bk1) {
		this.bk1 = bk1;
	}
	public String getBk2() {
		return bk2;
	}
	public void setBk2(String bk2) {
		this.bk2 = bk2;
	}
	public int getRt_bk1() {
		return rt_bk1;
	}
	public void setRt_bk1(int rt_bk1) {
		this.rt_bk1 = rt_bk1;
	}
	public int getRt_bk2() {
		return rt_bk2;
	}
	public void setRt_bk2(int rt_bk2) {
		this.rt_bk2 = rt_bk2;
	}
	public int getQty_bk1() {
		return qty_bk1;
	}
	public void setQty_bk1(int qty_bk1) {
		this.qty_bk1 = qty_bk1;
	}
	public int getQty_bk2() {
		return qty_bk2;
	}
	public void setQty_bk2(int qty_bk2) {
		this.qty_bk2 = qty_bk2;
	}
	
	
	
	public void show() {
		System.out.println("SI.No  Bookname Rate Quantity");
		System.out.println("  1\t" + bk1 + "\t" + rt_bk1 + "\t" + qty_bk1);
		System.out.println("  2\t" + bk2 + "\t" + rt_bk2 + "\t" + qty_bk2);
	}
	
	
	
	
}
