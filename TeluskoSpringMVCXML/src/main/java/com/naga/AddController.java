package com.naga;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.naga.service.AddService;

@Controller
public class AddController {
//each time we have to come and checnge here in future we can change to any view 
//@RequestMapping("/add")
//public String add() {
//	return "display.jsp";
//}

//Running using this 
//http://localhost:9080/SpringMVCDemo/
@RequestMapping("/add")
public ModelAndView add(HttpServletRequest req,HttpServletResponse res) {
  int i = Integer.parseInt(req.getParameter("t1"));
  int j = Integer.parseInt(req.getParameter("t2"));
  AddService as = new AddService();
  int k = as.add(i, j);
  ModelAndView mv = new ModelAndView();
  mv.addObject("result",k);
  //mv.setViewName("display.jsp");  use view resolver in future it may be any view 
  mv.setViewName("display");

	return mv ;
}
}
