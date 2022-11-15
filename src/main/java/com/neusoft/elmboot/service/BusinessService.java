package com.neusoft.elmboot.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.po.Food;

public interface BusinessService {
	//通过点餐分类类型 , 查询商家 ,返回商家集合
	public List<Business> listBusinessByOrderTypeId(Integer  typeid);
	
	//通过商家编号 查询商家信息
	public Business  getBusinessById(Integer  businessId);
	
	//查询某个商家下的所有商品
	public  List<Food> listFoodByBusinessId(Integer  businessId);
}
