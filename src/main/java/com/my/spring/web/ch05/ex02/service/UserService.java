package com.my.spring.web.ch05.ex02.service;

import java.util.List;

import com.my.spring.web.ch05.domain.User;

public interface UserService {
	List<User> getUsers();
	int addUser(User user);
	int fixUser(User user);
	int delUser(int userId);
}
