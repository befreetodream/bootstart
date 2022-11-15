package com.neusoft.elmboot.service;

import java.util.List;

import com.neusoft.elmboot.po.Orders;

public interface OrderService {
	
	//新建订单
	int createOrders(Orders o);
	
	//在个人支付时,获取当前订单的信息
	Orders getOrderById(Integer orderId);
	
	//我的订单菜单用
	List<Orders> listOrdersByUserId(String userId);
}
