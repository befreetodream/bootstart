package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.common.BaseContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.service.UserService;

/**
 * 
 * 1. 将该类注册到spring框架 ,形成一个组件 @RestController
 * 2. 将对应的service注入到这个文件中  . @AutoWired
 * ------------------
 * 3. 跨域@CrossOrigin
 * 4. @RequestMapping
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/UserController")
public class UserController {
	@Autowired     //  依赖注入
	UserService  userService;
	
	//http://localhost:8080/elm/UserController/getUserByIdByPass
	/*
	 * 请求类型 
	 * patch  - 通常查询   , 隐藏传值 ,返回一条/多条记录
	 * get- 通常查询  , 明码传值
	 * put- 通常添加,隐藏传值 ,
	 * post- 通常  添加/修改 ,隐藏传值 ,
	 * delete  -通常删除 ,  明码传值
	 * 
	 * @PutMapping   	@PostMapping   @DeleteMapping   @PatchMapping  @GetMapping
	 */
	@PatchMapping("/getUserByIdByPass")
	//@RequestMapping(value="/getUserByIdByPass",method=RequestMethod.PATCH)
	public User getUserByIdByPass(@RequestBody User u) throws Exception{
		String userId = u.getUserId();
		BaseContext.threadLocal.set(userId);
		User user = userService.getUserByIdByPass(u);
		return  user;
	}
}
