package com.ljy.service;

import java.util.List;
import com.ljy.entity.User;

public interface UserService {
	public User getUser(int id);
	public List<User> getUsers();
}
