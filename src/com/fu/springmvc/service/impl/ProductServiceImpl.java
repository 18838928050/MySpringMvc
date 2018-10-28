/**
 * 
 */
package com.fu.springmvc.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.fu.springmvc.service.ProductService;

import vo.Product;

/**
 @author： fu    @time：2018年10月27日 下午11:29:40 
 @说明： 一份耕耘，一份收获
**/
@Service
public class ProductServiceImpl implements ProductService {
	
/*
 * AtomicLong支持基础long类型变量上的原子操作。 它具有获取和设置方法，如在volatile变量上的读取和写入。
 */
	private Map<Long, Product> products=new HashMap<>();
	private AtomicLong generator=new AtomicLong();
	
	/**
	 * 
	 */
	public ProductServiceImpl() {
		Product product=new Product();
		product.setName("fuhuifang");
		product.setDescription("des");
		product.setPrice(129.00F);
		add(product);
	}
	
	/* (non-Javadoc)
	 * @see com.fu.springmvc.service.ProductService#add(vo.Product)
	 */
	@Override
	public Product add(Product product) {
		long newId=generator.incrementAndGet();
		product.setId(newId);
		products.put(newId, product);
		return product;
	}

	/* (non-Javadoc)
	 * @see com.fu.springmvc.service.ProductService#get(long)
	 */
	@Override
	public Product get(long id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}
	
	

}
