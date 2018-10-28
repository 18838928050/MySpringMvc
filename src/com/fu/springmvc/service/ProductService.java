/**
 * 
 */
package com.fu.springmvc.service;

import vo.Product;

/**
 @author： fu    @time：2018年10月27日 下午11:23:44 
 @说明： 一份耕耘，一份收获
**/
public interface ProductService {

	/*
	 * 添加产品
	 */
	Product add(Product product);
	
	/*
	 * 获取Id
	 */
	Product get(long id);
}
