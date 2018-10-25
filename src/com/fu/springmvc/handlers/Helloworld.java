/**
 * 
 */
package com.fu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 @author： fu    @time：2018年10月25日 下午4:13:02 
 @说明： 一份耕耘，一份收获
**/
@Controller
public class Helloworld {

	@RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "success";
}
            
}
