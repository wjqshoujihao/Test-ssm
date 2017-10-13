/** 
 * <pre>项目名称:ssi-easuui 
 * 文件名称:TreeController.java 
 * 包名:com.jk.controller 
 * 创建日期:2017年8月24日下午2:23:44 
 * Copyright (c) 2017,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jk.entity.Tree;
import com.jk.service.TreeService;
import com.jk.util.BaseController;

/** 
 * <pre>项目名称：ssi-easuui    
 * 类名称：TreeController    
 * 类描述：    
 * 创建人：朱义龙    
 * 创建时间：2017年8月24日 下午2:23:44    
 * 修改人：朱义龙    
 * 修改时间：2017年8月24日 下午2:23:44    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("treeController")
public class TreeController extends BaseController {

	@Autowired
	private TreeService treeService;
	
	
	
	
	@RequestMapping("asyncTreeList")
	public void asyncTreeList(Tree tree,HttpServletResponse response){
       List<Tree> list =new ArrayList<Tree>();
		try {
			list=treeService.asyncTreeList(tree);
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.writeJson(list, response);
	}
	
}
