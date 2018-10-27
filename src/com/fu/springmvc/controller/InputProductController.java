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

/**
 @author： fu    @time：2018年10月27日 下午1:02:43 
 @说明： 一份耕耘，一份收获
**/
public class InputProductController  implements Controller{

	private static final Log logger=LogFactory.getLog(InputProductController.class);
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1)
			throws Exception {
		
		logger.info("InputProductController called");
		return new ModelAndView("/WEB-INF/jsp/ProductForm.jsp");
	}

}
