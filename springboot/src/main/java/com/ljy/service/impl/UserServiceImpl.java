package com.ljy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ljy.dao.UserDao;
import com.ljy.entity.User;
import com.ljy.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	public User getUser(int id) {
		return userDao.selectByPrimaryKey(id);
	}
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
	}
}
