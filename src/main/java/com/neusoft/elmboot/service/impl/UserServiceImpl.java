package com.neusoft.elmboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.elmboot.mapper.UserMapper;
import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.UserService;
/**
 * 
 * 1.声明当前实现类是spring中的一个组件  @Service
 * 2.使用 @Autowired  注入另一个mapper组件
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired   //依赖注入
	UserMapper  userMapper;
	
	@Override
	public User getUserByIdByPass(User u) {
		User user = userMapper.getUserByIdByPass(u);
		return user;
	}

}

//客人->服务员  ->  厨师

//客户端 -> controller  ->  service    ->  mapper

