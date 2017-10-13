/** 
 * <pre>项目名称:ssi-easuui 
 * 文件名称:TreeServiceImpl.java 
 * 包名:com.jk.service.impl 
 * 创建日期:2017年8月24日下午2:25:27 
 * Copyright (c) 2017,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.TreeDao;
import com.jk.entity.Tree;
import com.jk.service.TreeService;

/** 
 * <pre>项目名称：ssi-easuui    
 * 类名称：TreeServiceImpl    
 * 类描述：    
 * 创建人：朱义龙    
 * 创建时间：2017年8月24日 下午2:25:27    
 * 修改人：朱义龙    
 * 修改时间：2017年8月24日 下午2:25:27    
 * 修改备注：       
 * @version </pre>    
 */
@Service("treeService")
public class TreeServiceImpl implements TreeService {

	@Autowired
	private TreeDao treeDao;

	
	public boolean isHaveChild(Tree tree) throws Exception{
		boolean flag = false;
		//查询当前节点是否有子节点
		List<Tree> list =treeDao.queryTreeList(tree);
		if(list.size()>0 && list!=null){
			flag=true;
		}
		return flag;
	}

	public List<Tree> asyncTreeList(Tree tree)throws Exception {
		List<Tree> asyncTreeList = new ArrayList<Tree>();
		//判断传递tree中的id是否为空
		if(tree.getId()!=null && tree!=null){
			asyncTreeList=treeDao.queryTreeList(tree);
		}else{
			asyncTreeList = treeDao.asyncTreeList(tree);
		}
		List<Tree> list =new ArrayList<Tree>();
		for (Tree tree2 : asyncTreeList) {
			if(isHaveChild(tree2)){
				tree2.setIsParent("true");
			}
			list.add(tree2);
		}
		
		return list;
	}


	
}
