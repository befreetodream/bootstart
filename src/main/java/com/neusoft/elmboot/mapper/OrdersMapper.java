package com.neusoft.elmboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.neusoft.elmboot.po.Orders;
@Mapper
public interface OrdersMapper {
	
	//自动获取生成的订单主键
	@Insert("insert into orders values(null,#{userId},#{businessId},#{orderDate},#{orderTotal},#{daId},0)")
	@Options(useGeneratedKeys = true,keyProperty = "orderId",keyColumn = "orderId")
	int saveOrders(Orders o);
	
	//在个人支付时,获取当前订单的信息
	Orders getOrderById(Integer orderId);
	
	
	//我的订单菜单用
	List<Orders> listOrdersByUserId(String userId);
	
}
