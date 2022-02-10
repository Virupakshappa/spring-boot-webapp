package com.janadri.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("home")    //calls this method whenever client hits /home endpoint
//	@ResponseBody              //used to return data in string format(treats "home.jsp" as a string)
	public String homeMethod() {
		System.out.println("Hey I am in home method");
		
		return "home";
	}
}
