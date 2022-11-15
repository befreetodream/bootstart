package com.neusoft.elmboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.elmboot.po.Orders;
import com.neusoft.elmboot.service.OrderService;

@RestController
@CrossOrigin
@RequestMapping("/OrdersController")
public class OrdersController {

	@Autowired
	OrderService orderService;
	
	//新建订单
	@RequestMapping(value="/createOrders",method=RequestMethod.PUT)
	int createOrders(@RequestBody Orders o) throws Exception{
		return orderService.createOrders(o);
	}
	
	//在个人支付时,获取当前订单的信息
	@RequestMapping(value="/getOrderById",method=RequestMethod.PATCH)	
	Orders getOrderById(@RequestBody Orders o) throws Exception{
		return orderService.getOrderById(o.getOrderId());
	}
	
	//我的订单菜单用
	@RequestMapping(value="/listOrdersByUserId",method=RequestMethod.PATCH)
	List<Orders> listOrdersByUserId(@RequestBody Orders o) throws Exception{
		return orderService.listOrdersByUserId(o.getUserId());
	}
}
