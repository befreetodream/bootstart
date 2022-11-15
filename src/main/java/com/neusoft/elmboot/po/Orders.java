package com.neusoft.elmboot.po;

import java.math.BigDecimal;
import java.util.List;

public class Orders {
    private Integer orderId;

    private String userId;

    private Integer businessId;

    private String orderDate;

    private BigDecimal orderTotal;

    private Integer daId;

    private Integer orderState;

    //一对一
    private Business business;
    //一对多
    private List<Orderdetailet> list;
    
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public BigDecimal getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}
	public Integer getDaId() {
		return daId;
	}
	public void setDaId(Integer daId) {
		this.daId = daId;
	}
	public Integer getOrderState() {
		return orderState;
	}
	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	public List<Orderdetailet> getList() {
		return list;
	}
	public void setList(List<Orderdetailet> list) {
		this.list = list;
	}
    
    
}