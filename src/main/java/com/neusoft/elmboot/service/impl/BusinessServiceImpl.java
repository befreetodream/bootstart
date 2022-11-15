package com.neusoft.elmboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.elmboot.mapper.BusinessMapper;
import com.neusoft.elmboot.mapper.FoodMapper;
import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.po.Food;
import com.neusoft.elmboot.service.BusinessService;
/**
 * 1 .注册到spring框架  @Service
 * 2 .使用依赖注入 , 注入 mapper
 * @author Administrator
 *
 */
@Service
public class BusinessServiceImpl implements BusinessService {
	@Autowired  //注入 
	BusinessMapper  busMapper;
	@Autowired
	FoodMapper  foodMapper;
	
	@Override
	public List<Business> listBusinessByOrderTypeId(Integer typeid) {
		return busMapper.listBusinessByOrderTypeId(typeid);
	}

	@Override
	public Business getBusinessById(Integer businessId) {
		return busMapper.getBusinessById(businessId);
	}

	@Override
	public List<Food> listFoodByBusinessId(Integer businessId) {
		return foodMapper.listFoodByBusinessId(businessId);
	}

	
}
