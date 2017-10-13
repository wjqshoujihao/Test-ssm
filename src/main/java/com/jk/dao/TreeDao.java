/** 
 * <pre>项目名称:ssi-easuui 
 * 文件名称:TreeDao.java 
 * 包名:com.jk.dao 
 * 创建日期:2017年8月24日下午2:26:42 
 * Copyright (c) 2017,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.dao;

import java.util.List;

import com.jk.entity.Tree;


/** 
 * <pre>项目名称：ssi-easuui    
 * 类名称：TreeDao    
 * 类描述：    
 * 创建人：朱义龙    
 * 创建时间：2017年8月24日 下午2:26:42    
 * 修改人：朱义龙    
 * 修改时间：2017年8月24日 下午2:26:42    
 * 修改备注：       
 * @version </pre>    
 */
public interface TreeDao {

	
	List<Tree> queryTreeList(Tree tree) throws Exception;

	
	List<Tree> asyncTreeList(Tree tree)throws Exception;



}
