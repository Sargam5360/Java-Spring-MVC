package com.aa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//localhost:9090/SpringMvcDemo/rsa/home.do
@Controller
@RequestMapping(value="/rsa")
public class LoginController {
	
	//localhost:9090/SpringMvcDemo/rsa/home.do
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String welcome()
	{
		return "home";
	}
	
	//localhost:9090/SpringMvcDemo/rsa/login.do
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLogin()
	{
		return "Login";
	}
	
	//localhost:9090/SpringMvcDemo/rsa/authenticate.do
	@RequestMapping(value="/authenticate", method=RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam String userid, HttpServletResponse response)
	{
		ModelAndView mv = new ModelAndView();
		if(userid != null)
		{
			mv.setViewName("welcome");
			mv.addObject("logintime", userid + " :: " +System.currentTimeMillis());
		}
		else
		{
			mv.setViewName("Login");			
		}
		return mv;
	}

}
