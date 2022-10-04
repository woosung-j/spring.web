package com.my.spring.web.ch05.ex02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.spring.web.ch05.domain.User;
import com.my.spring.web.ch05.ex02.dao.UserDao;

@Service("ch05.ex02")
public class UserServiceImpl implements UserService {
	@Autowired private UserDao userDao;

	@Override
	public List<User> getUsers() {
		return userDao.selectUsers();
	}

	@Override
	public int addUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public int fixUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public int delUser(int userId) {
		return userDao.deleteUser(userId);
	}
}

