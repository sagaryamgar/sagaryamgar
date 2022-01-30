package com.farmer.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.farmer.admin.entity.Users;
import com.farmer.admin.service.FarmerService;

@RestController
public class FarmerAdminController {
	
	@Autowired
	FarmerService farmerService;

	@RequestMapping("/getUser")
	@ResponseBody
	public List<Users> getUsers() {
		return farmerService.getUser();
	}
	@RequestMapping("/userUpdate")
	@ResponseBody
	public Users userUpdate(@RequestParam Users user) {
		Long id = user.getId();
		return farmerService.userUpdate(user, id);
	}
	@RequestMapping("/addUser")
	@ResponseBody
	public void addUser(@RequestParam Users user) {
		farmerService.userAdd(user);
	}
}
