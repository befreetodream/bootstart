package com.neusoft.elmboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.elmboot.po.Cart;
import com.neusoft.elmboot.service.CartService;

@RestController
@CrossOrigin
@RequestMapping("/CartController")
public class CartController {

	@Autowired
	CartService cartService;
	
	@PatchMapping("/listCart")
	public List<Cart> listCart(@RequestBody Cart  c){
		return  cartService.listCart(c);
	}
	
	@PutMapping("/saveCart")
	public int saveCart(@RequestBody Cart c) {
		return cartService.saveCart(c);
	}
	
	@PostMapping("/updateCart")
	public int updateCart(@RequestBody Cart c) throws Exception{
		return cartService.updateCart(c);
	}
	
	/*
	 * RequestMethod.DELETE 是通过url传递参数的方式,不能使用RequestBody
	 */
	@DeleteMapping("/removeCart/{p1}/{p2}")
	public int removeCart(@PathVariable String p1, @PathVariable Integer p2 ) throws Exception{
		Cart c = new Cart();
		c.setUserId(p1);
		c.setFoodId(p2);
		return cartService.deleteCart(c);
	}
}
