/** 
 * <pre>项目名称:ssi-easuui 
 * 文件名称:UserServiceImpl.java 
 * 包名:com.jk.service.impl 
 * 创建日期:2017年8月24日上午10:10:49 
 * Copyright (c) 2017,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.UserDao;
import com.jk.entity.User;
import com.jk.service.UserService;



@Service
public class UserServiceImpl implements UserService{
	
	
	
	@Autowired
	private UserDao userDao;

	

	@Override
	public List<User> toSelectUser(User user) throws Exception {
		return userDao.toSelectUser(user);

	}

	@Override
	public void insertUser(User user) throws Exception {
		user.setYx(1);
		user.setCreatedatetime(new Date());
		userDao.insertUser(user);
		
	}

	@Override
	public void deleteUser(String  ids) throws Exception {
		String[] idss = ids.split(",");
		userDao.deleteUser(idss);
	}

	@Override
	public User toupdateById(User user) throws Exception {
		
		return userDao.toupdateById(user);
	}

	@Override
	public void updateUser(User user) throws Exception {
		userDao.updateUser(user);
	}

	

}
