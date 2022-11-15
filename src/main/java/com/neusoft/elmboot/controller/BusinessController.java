package com.neusoft.elmboot.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.elmboot.po.Business;
import com.neusoft.elmboot.po.Food;
import com.neusoft.elmboot.service.BusinessService;

/**
 * 1. 自身注册   2. 跨域配置  3. 自身命名  4 .依赖service
 * @author Administrator
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/BusinessController")
@Api("商家控制器")
public class BusinessController {
	@Autowired
	BusinessService  busService;
	
	@PatchMapping("/listBusinessByOrderTypeId")
	@ApiOperation(value = "通过订单id返回商家列表", tags = "通过订单id查找商家列表")
	public List<Business> listBusinessByOrderTypeId(@RequestBody Business  b){
		
		return busService.listBusinessByOrderTypeId(b.getOrderTypeId());
	}
	
	@PatchMapping("/getBusinessById")
	public Business getBusinessById(@RequestBody Business b) {
		return  busService.getBusinessById(b.getBusinessId());
	}
	
	@PatchMapping("/listFoodByBusinessId")
	public List<Food> listFoodByBusinessId(@RequestBody Business b) {
		return  busService.listFoodByBusinessId(b.getBusinessId());
	}
}
