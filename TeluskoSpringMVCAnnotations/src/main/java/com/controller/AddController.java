package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1")int i,@RequestParam("t1") int j,  HttpServletRequest request,HttpServletResponse response) {
		
		//instead of getting it manually use @RequestParam
		//int i = Integer.parseInt(request.getParameter("t1"));
		//int j=  Integer.parseInt(request.getParameter("t2"));
		AddService as= new AddService();
		int k = as.add(i, j);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",k);
		//mv.setViewName("display.jsp");
		mv.setViewName("display");
		return mv;
	}
}
