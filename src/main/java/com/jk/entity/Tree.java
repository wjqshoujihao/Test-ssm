package com.jk.entity;

import java.io.Serializable;

public class Tree implements Serializable {

	private static final long serialVersionUID = 356621288614880153L;

	private String  id;
	
	private int pid;
	
	private String name;

	private String url;
	
	private String icon;

	private String target;

	private Integer type;

	private String open = "true";

	private String isParent = "false";
	
	

	


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public Integer getPid() {
		return pid;
	}



	public void setPid(Integer pid) {
		this.pid = pid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getIcon() {
		return icon;
	}



	public void setIcon(String icon) {
		this.icon = icon;
	}



	public String getTarget() {
		return target;
	}



	public void setTarget(String target) {
		this.target = target;
	}



	public Integer getType() {
		return type;
	}



	public void setType(Integer type) {
		this.type = type;
	}



	public String getOpen() {
		return open;
	}



	public void setOpen(String open) {
		this.open = open;
	}



	public String getIsParent() {
		return isParent;
	}



	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}



	@Override
	public String toString() {
		return "Tree [id=" + id + ", pid=" + pid + ", name=" + name + ", url=" + url + ", icon=" + icon + ", target="
				+ target + ", type=" + type + ", open=" + open + ", isParent=" + isParent + "]";
	}


	

	
	
	

}
