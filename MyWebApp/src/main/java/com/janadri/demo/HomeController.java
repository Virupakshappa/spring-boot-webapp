package com.janadri.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")    //calls this method whenever client hits /home endpoint
//	@ResponseBody       //used to return data in string format(treats "home.jsp" as a string)
	public ModelAndView homeMethod(Alien alien) {  //http://localhost:8080/home/?myName=Veeru
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
	}
}
