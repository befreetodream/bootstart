package com.neusoft.elmboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neusoft.elmboot.po.Food;

public interface FoodMapper {
	//查询某个商家下的所有商品
	@Select("select * from  food  where businessId=#{arg0}  order by  foodId asc")
	public  List<Food> listFoodByBusinessId(Integer  businessId);

	@Select("select * from  food  where foodId=#{foodId}")
	Food  getFoodById(Integer foodId);
}
