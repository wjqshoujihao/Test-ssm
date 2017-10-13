/** 
 * <pre>项目名称:ssi-easuui 
 * 文件名称:UserDao.java 
 * 包名:com.jk.dao 
 * 创建日期:2017年8月24日上午10:11:47 
 * Copyright (c) 2017,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.dao;

import java.util.List;
import java.util.Map;

import com.jk.entity.User;



public interface UserDao {


	public List<User> toSelectUser(User user) throws Exception;

	public void insertUser(User user) throws Exception;

	public void deleteUser(String[] idss) throws Exception;

	public User toupdateById(User user) throws Exception;

	public void updateUser(User user) throws Exception;



	public List<Map<String, Object>> getResourcesList(User user)throws Exception;

	public void deleteUserRoleRelation(String userid)throws Exception;

	public void addUserRoleRelation(List<Map<String, Object>> list)throws Exception;

}
