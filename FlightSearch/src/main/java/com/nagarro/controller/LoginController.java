package com.nagarro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginSerivce;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkUser(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		System.out.println("hi");
		boolean userExists = loginSerivce.checkLogin(username, password);

		if (userExists) {
			System.out.println(1);
			mv.setViewName("userhome.jsp");
		} else {
			System.out.println(2);
			mv.setViewName("error.jsp");
		}

		return mv;
	}
}
