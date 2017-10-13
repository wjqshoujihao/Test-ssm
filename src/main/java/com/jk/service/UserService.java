/** 
 * <pre>项目名称:ssi-easuui 
 * 文件名称:UserService.java 
 * 包名:com.jk.service 
 * 创建日期:2017年8月24日上午10:09:35 
 * Copyright (c) 2017,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.jk.entity.User;



public interface UserService {



	public List<User> toSelectUser(User user) throws Exception;

	public void insertUser(User user) throws Exception;

	public void deleteUser(String  ids) throws Exception;

	public User toupdateById(User user) throws Exception;

	public void updateUser(User user) throws Exception;


}
