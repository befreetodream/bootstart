package com.neusoft.elmboot.service;

import java.util.List;

import com.neusoft.elmboot.po.Cart;

public interface CartService {
	public List<Cart> listCart(Cart c);
	
	//点击+时,向购物车中加入新的food
	int saveCart(Cart c);
	
	//点击-时,向购物车中减少商品个数
	int updateCart(Cart c);
	
	//点击- , 由1->0时,执行删除
	int  deleteCart(Cart c);
}
