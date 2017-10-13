/** 
 * <pre>项目名称:ssi-easuui 
 * 文件名称:TreeService.java 
 * 包名:com.jk.service 
 * 创建日期:2017年8月24日下午2:24:47 
 * Copyright (c) 2017,yangpei310@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;

import com.jk.entity.Tree;


/** 
 * <pre>项目名称：ssi-easuui    
 * 类名称：TreeService    
 * 类描述：    
 * 创建人：朱义龙    
 * 创建时间：2017年8月24日 下午2:24:47    
 * 修改人：朱义龙    
 * 修改时间：2017年8月24日 下午2:24:47    
 * 修改备注：       
 * @version </pre>    
 */
public interface TreeService {

	public List<Tree> asyncTreeList(Tree tree) throws Exception;




}
