package com.neusoft.elmboot.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.elmboot.mapper.CartMapper;
import com.neusoft.elmboot.mapper.OrderdetailetMapper;
import com.neusoft.elmboot.mapper.OrdersMapper;
import com.neusoft.elmboot.po.Cart;
import com.neusoft.elmboot.po.Orderdetailet;
import com.neusoft.elmboot.po.Orders;
import com.neusoft.elmboot.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	//注入多个
	@Autowired
	OrdersMapper ordersMapper;
	@Autowired
	OrderdetailetMapper  orderdetailetMapper;
	@Autowired
	CartMapper cartMapper;
	
	@Override
	@Transactional  //事务操作
	public int createOrders(Orders o) {
		//1. 先查询当前用户,在当前商家下,所有购物车中的商品集合
		Cart cart = new Cart();
		cart.setUserId(o.getUserId());
		cart.setBusinessId(o.getBusinessId());
		List<Cart> listCart = cartMapper.listCart(cart);
		
		//2 . 创建订单 ,返回新生成的订单编号
		//2.1 获取一个当前时间-> String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(Calendar.getInstance().getTime()); // new Date()
		o.setOrderDate(time);
		
		//2.2 获取最新的主键
		ordersMapper.saveOrders(o);
		Integer orderId = o.getOrderId();
		//3 . 批量添加订单明细
		List<Orderdetailet> list = new ArrayList<>();
		for (Cart c : listCart) {
			Orderdetailet od = new Orderdetailet();
			od.setOrderId(orderId);
			od.setFoodId(c.getFoodId());
			od.setQuantity(c.getQuantity());
			list.add(od);
		}
		System.out.println("-----------------------:"+list.size());
		orderdetailetMapper.saveOrderDetailetBatch(list);
		
		//4 . 将购物车中的该商家下的商品删除
		cartMapper.deleteCartByOrders(cart);
		
		return orderId;
	}

	@Override
	public Orders getOrderById(Integer orderId) {
		// TODO Auto-generated method stub
		return ordersMapper.getOrderById(orderId);
	}

	@Override
	public List<Orders> listOrdersByUserId(String userId) {
		// TODO Auto-generated method stub
		return ordersMapper.listOrdersByUserId(userId);
	}

}
