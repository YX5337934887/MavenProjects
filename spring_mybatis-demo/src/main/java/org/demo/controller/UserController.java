package org.demo.controller;

import java.util.List;

import org.demo.service.UserService;
import org.generator.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
		UserInfo userInfo = userService.getUserById(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos(){
		List<UserInfo> userInfos = userService.getUsers();
		return userInfos;
	}
	/*
	@RequestMapping("/showInfo/{userId}")
	public @ResponseBody UserInfo showUserInfo(@PathVariable int userId){
		UserInfo userInfo = userService.getUserById(userId);
		return userInfo;
	}
	*/
	/*
	@RequestMapping("/showInfos")
	public @ResponseBody List<UserInfo> showUserInfos(){
		List<UserInfo> userInfos = userService.getUsers();
		return userInfos;
	}
	*/
}