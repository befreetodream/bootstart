package com.neusoft.elmboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neusoft.elmboot.po.Business;

/**
 * 商家表中所有相关sql操作 都有在该类中声明
 * @author Administrator
 *
 */
public interface BusinessMapper {
	
	//通过点餐分类类型 , 查询商家 ,返回商家集合
	@Select("select *  from  business  where ordertypeid=#{arg0} order by  businessid asc")
	public List<Business>  listBusinessByOrderTypeId(Integer  typeid);
	
	@Select("select * from  business  where  businessId=#{org0}")
	public Business  getBusinessById(Integer  businessId);
}
