package com.janadri.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home")    //calls this method whenever client hits /home endpoint
//	@ResponseBody       //used to return data in string format(treats "home.jsp" as a string)
	public String homeMethod(HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		String iname = req.getParameter("name");
		session.setAttribute("nid", iname);
		return "home";
	}
}
