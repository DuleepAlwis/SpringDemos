package com.demo3.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.HttpResource;

@Controller
public class AddController {

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("Hello I'm here");
		
		int k = Integer.parseInt(request.getParameter("n1"))+
				Integer.parseInt(request.getParameter("n2"));
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("demo3_test");
		mv.addObject("result", k);
		return mv;
	}
}
