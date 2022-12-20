package com.abdur.products;

//DO NOT CONSIDER THIS CLASS. ONLY THE Items.java, ProductsModel.java and ShowOptions.java
//are the main classes

public class TempModel {
	
	private Integer Id;
	private String bookName;
	private Integer rate;
	private Integer quantity;
	
	public TempModel(Integer id, String bookName, Integer rate, Integer quantity) {
		this.Id = id;
		this.bookName = bookName;
		this.rate = rate;
		this.quantity = quantity;
	}

	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
