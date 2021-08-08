package com.farmer.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
}
