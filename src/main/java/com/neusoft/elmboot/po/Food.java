package com.neusoft.elmboot.po;

import java.math.BigDecimal;

public class Food {
	private Integer  foodId;
	private String foodName;
	private String foodExplain;
	private BigDecimal  foodPrice;
	private Integer businessId;
	private String  remarks;
	private String  foodImg;
	public Integer getFoodId() {
		return foodId;
	}
	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodExplain() {
		return foodExplain;
	}
	public void setFoodExplain(String foodExplain) {
		this.foodExplain = foodExplain;
	}
	public BigDecimal getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(BigDecimal foodPrice) {
		this.foodPrice = foodPrice;
	}
	public Integer getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getFoodImg() {
		return foodImg;
	}
	public void setFoodImg(String foodImg) {
		this.foodImg = foodImg;
	}

	
}
