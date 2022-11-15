package com.neusoft.elmboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.elmboot.po.Orderdetailet;

@Mapper
public interface OrderdetailetMapper {

	//获取某个订单的明细
	List<Orderdetailet> listOrderDetailetByOrderId(Integer orderId);
	
	//一次性保存订单明细记录
	int  saveOrderDetailetBatch(List<Orderdetailet> list);
}
