/**
 * 
 */
package com.fu.springmvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.Employee;

/**
 @author： fu    @time：2018年11月8日 上午8:13:45 
 @说明： 一份耕耘，一份收获
**/
@Controller
public class EmployeeController {
	
	private static final Log logger=LogFactory.getLog(ProductController.class);

	@RequestMapping("/toEmployee_input")
	public String toEmployee(Model model) {
		model.addAttribute(new Employee());
		return "EmployeeForm";
	}
	//SpingMVC中利用BindingResult将错误信息返回到页面中。 
	@RequestMapping(value="employee_save")
	public String saveEmployee(@ModelAttribute Employee employee,BindingResult bindingResult,Model model) {
		if (bindingResult.hasErrors()) {
			FieldError fieldError=bindingResult.getFieldError();
			logger.info("Code:"+fieldError.getCode()+",field:"+fieldError.getCode());
			return "EmployeeForm";
		}
		model.addAttribute("employee", employee);
		
		return "EmployeeDetails";
		
	
	}
	
	
}
