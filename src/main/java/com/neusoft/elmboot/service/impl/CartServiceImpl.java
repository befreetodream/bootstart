package com.neusoft.elmboot.service.impl;

import java.util.List;

import com.neusoft.elmboot.common.BaseContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.elmboot.mapper.CartMapper;
import com.neusoft.elmboot.po.Cart;
import com.neusoft.elmboot.service.CartService;
@Service
public class CartServiceImpl implements CartService {
	@Autowired
	CartMapper cartMapper;
	
	@Override
	public List<Cart> listCart(Cart c) {
		return cartMapper.listCart(c);
	}

	@Override
	@Transactional
	public int saveCart(Cart c) {
		// TODO Auto-generated method stub
		c.setUserId(BaseContext.threadLocal.get());
		return cartMapper.saveCart(c);
	}

	@Override
	@Transactional
	public int updateCart(Cart c) {
		// TODO Auto-generated method stub
		return cartMapper.updateCart(c);
	}

	@Override
	@Transactional
	public int deleteCart(Cart c) {
		// TODO Auto-generated method stub
		return cartMapper.deleteCart(c);
	}

}
