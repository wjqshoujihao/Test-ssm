/** 
 * <pre>项目名称:ssi-easuui 
 * 文件名称:UserController.java 
 * 包名:com.jk.controller 
 * 创建日期:2017年8月24日上午10:06:46 
 * Copyright (c) 2017,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.jk.entity.User;
import com.jk.service.UserService;
import com.jk.util.BaseController;
import com.jk.util.TestPOI;


@Controller
@RequestMapping("userController")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="toSelectUser")
	public void toSelectUser(User user,HttpServletResponse hr) throws Exception{
		List<User> list = new ArrayList<User>();
		try {
			list=userService.toSelectUser(user);
			String json = JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
			hr.setCharacterEncoding("UTF-8");
			PrintWriter writer;
			writer = hr.getWriter();
			writer.write(json);
			writer.flush();
			writer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	@RequestMapping(value="insertUser")
	public void insertUser(User user,HttpServletResponse hr) throws Exception{
		userService.insertUser(user);
		try {
			hr.setCharacterEncoding("UTF-8");
			PrintWriter writer = hr.getWriter();
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value="deleteUser")
	public void deleteUser(String  ids,HttpServletResponse hr) throws Exception{
		userService.deleteUser(ids);
		PrintWriter writer = hr.getWriter();
		writer.flush();
		writer.close();
	}
	@RequestMapping(value="toupdateById")
	public String toupdateById(User user,HttpServletRequest request) throws Exception{
		user=userService.toupdateById(user);
		request.setAttribute("u", user);
		return "updateUser";
	}
	@RequestMapping(value="testpoi")
	public void testpoi(User user, HttpServletResponse response){
		System.out.println(user);
		SimpleDateFormat simp =new SimpleDateFormat("yyyy-MM-dd"); 
		String title="员工表";
		String rowName[] ={"id","编号","姓名","性别","生日","手机号","电话","邮箱","有效","描述"};
		List<User> list = new ArrayList<User>();
		 List<Object[]>  dataList =null;
		  try {
			  dataList = new ArrayList<Object[]>();
			  list=userService.toSelectUser(user);
			  SimpleDateFormat sim =new SimpleDateFormat("yyyy-MM-dd");
			for (User obj : list) {
				Object[] ob=new Object[rowName.length];
				ob[0]=obj.getId().toString();
				ob[1]=obj.getBh();
				ob[2]=obj.getName();
				ob[3]=obj.getSex().toString();
				if (obj.getCreatedatetime()!=null) {
					ob[4]=sim.format(obj.getCreatedatetime());
				}else{
					ob[4]="";
				}
				ob[5]=obj.getSjh();
				ob[6]=obj.getDh();
				ob[7]=obj.getYxiang();
				if (obj.getYx()==1) {
					ob[8]="有效";
				}else{
					ob[8]="无效";
				}
				ob[9]=obj.getMs();
				System.err.println(ob);
				dataList.add(ob);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		TestPOI testpoi =new TestPOI(title, rowName, dataList, response);
		try {
			testpoi.export();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value="updateUser")
	public void updateUser(User user,HttpServletResponse hr) throws Exception{
		userService.updateUser(user);
	    try {
			PrintWriter writer = hr.getWriter();
			writer.flush();
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
