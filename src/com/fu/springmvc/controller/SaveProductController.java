/**
 * 
 */
package com.fu.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.fu.springmvc.form.ProductForm;

import vo.Product;

/**
 @author： fu    @time：2018年10月27日 下午1:12:40 
 @说明： 一份耕耘，一份收获
**/
public class SaveProductController implements Controller{

	private static final Log logger=LogFactory.getLog(SaveProductController.class);
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		logger.info("saveProductController .. called");
		ProductForm productForm=new ProductForm();
		productForm.setName(request.getParameter("name"));
		productForm.setDescription(request.getParameter("description"));
		productForm.setPrice(request.getParameter("price"));
		
		Product product=new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		product.setPrice(Float.parseFloat(productForm.getPrice()));
		return new ModelAndView("ProductDetail","product",product);
	}
	

}
