package com.lvg.spmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lvg.spmvc.beans.User;
import com.lvg.spmvc.dao.UserDAO;

@Controller
public class LogInController {
	
	@Autowired
	UserDAO userDAO;
	
	@GetMapping("/login")
	public String getLogInPage() {
		return "Login";
	}
	
	@PostMapping("/validateUser")
	public String doValidateUser(@RequestParam("uname")String username,@RequestParam("pwd") String password,Model model,HttpServletResponse response) {
		User user = new User(username,password);
		
		//UserDAO userDAO = new UserDAO(); we want to inject
		if(userDAO.searchUser(user)) {
			response.addCookie(new Cookie("username", username));
		return "Services";
		}
		String message = "Invalid Username/Password";
		model.addAttribute("userMessage",message);
		return "Display";
	}
	/*
	public ModelAndView doValidateUser(@RequestParam("uname")String username,@RequestParam("pwd") String password) {
		String message = "Invalid Username/Password";
		if(username.equals("uname") && password.equals("1234"))
			message = "Hello "+username+",welcome to spring mvc world";
		return new ModelAndView("Display","userMessage",message);
	}
	*/

	
}
