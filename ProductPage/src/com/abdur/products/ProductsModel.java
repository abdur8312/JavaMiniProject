package com.abdur.products;


public class ProductsModel {
	private String bName;
	private Integer bId;
	private Integer bRate;
	private Integer bQuantity;
	
	public ProductsModel(String bName, Integer bId, Integer bRate, Integer bQuantity) {
		
		this.bName = bName;
		this.bId = bId;
		this.bRate = bRate;
		this.bQuantity = bQuantity;
	}
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	
	public Integer getbRate() {
		return bRate;
	}
	public void setbRate(Integer bRate) {
		this.bRate = bRate;
	}
	
	public Integer getbQuantity() {
		return bQuantity;
	}
	public void setbQuantity(Integer bQuantity) {
		this.bQuantity = bQuantity;
	}
	
}
