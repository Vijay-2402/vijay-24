package com.vijay;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@controller
public class AddController {
  @RequestMapping("/add")
  public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
  {
	 int i = Integer.parseInt(request.getParameter("t1"));
	 int j = Integer.parseInt(request.getParameter("t2"));
	 
	 AddService as = new AddService();
	 int k = as.add(i,j);
	 
	 ModelAndView mv = new ModelAndView();
	 mv.setViewName("display");
	 mv.addObject("result",k);
	 
	 return mv;

	 
    }
}
