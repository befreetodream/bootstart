package com.neusoft.elmboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import com.neusoft.elmboot.po.Cart;

public interface CartMapper {
	//xml中写
	public List<Cart>  listCart(Cart  c);
	
	@Insert("insert into cart values(null ,#{foodId} ,#{businessId},#{userId},1)")
	public int saveCart(Cart c);
	
	//点击-时,向购物车中减少商品个数
	@Update("update cart set quantity=#{quantity} where foodId=#{foodId} and userId=#{userId}")
	int updateCart(Cart c);
	
	//点击- , 由1->0时,执行删除
	@Delete("delete from  cart where userId=#{userId} and foodId=#{foodId}")
	int  deleteCart(Cart c);
	@Delete("delete from  cart where userId=#{userId} and businessId=#{businessId}")
	int deleteCartByOrders(Cart cart);
}
