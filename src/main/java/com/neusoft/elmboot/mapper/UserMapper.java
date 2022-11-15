package com.neusoft.elmboot.mapper;

import org.apache.ibatis.annotations.Select;

import com.neusoft.elmboot.po.User;

/**
 * 
 * 这里定义了user表的所有sql操作 
 *  1.登录
 *  2.注册
 *  3.检查重复用户
 *  
 *  重点: 如何在springboot 框架中注册接口
 *  @MapperScan("com.neusoft.elmboot.mapper")
 *  将该注解添加到springboot启动类上  .这样在启动时, 所有mapper包的接口都能注册到spring框架中
 */
public interface UserMapper {
	//登录的操作
	//有2种实现方式  , 1.使用注解   2. 使用xml文件
	@Select("select *  from user where userId=#{userId} and  password =#{password}")
	public User  getUserByIdByPass(User  u);
}
