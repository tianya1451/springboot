package com.ljy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ljy.dao.UserDao;
import com.ljy.entity.User;
import com.ljy.service.UserService;

@RestController
public class Test {
	@Autowired
	private UserService userService;
	@RequestMapping("/test")
	public PageInfo<User> test() {
		 /*  
         * 第一个参数是第几页；第二个参数是每页显示条数。  
         */  
        PageHelper.startPage(1,1);  
        List<User> list=userService.getUsers();
        PageInfo<User> pageInfo=new PageInfo<User>(list);
        return pageInfo; 

	}
}
