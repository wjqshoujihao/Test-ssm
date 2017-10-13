/** 
 * <pre>项目名称:ssi-easuui 
 * 文件名称:User.java 
 * 包名:com.jk.model 
 * 创建日期:2017年8月24日上午9:49:38 
 * Copyright (c) 2017,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.entity;

import java.util.Date;




public class User{
	

	private String id;
	
	private Date createdatetime;
	
	private String  dh;
	
	private String sjh;
	
	private String name;
	
	private Integer sex;
	
	private Integer yx;
	
	private String ms;
	private String yxiang;
	private String bh;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreatedatetime() {
		return createdatetime;
	}
	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}
	public String getDh() {
		return dh;
	}
	public void setDh(String dh) {
		this.dh = dh;
	}
	public String getSjh() {
		return sjh;
	}
	public void setSjh(String sjh) {
		this.sjh = sjh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getYx() {
		return yx;
	}
	public void setYx(Integer yx) {
		this.yx = yx;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getYxiang() {
		return yxiang;
	}
	public void setYxiang(String yxiang) {
		this.yxiang = yxiang;
	}
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", createdatetime=" + createdatetime + ", dh=" + dh + ", sjh=" + sjh + ", name="
				+ name + ", sex=" + sex + ", yx=" + yx + ", ms=" + ms + ", yxiang=" + yxiang + ", bh=" + bh + "]";
	}
	




	
}
