package com.farmer.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	@RequestMapping(value = "/userUpdate",method = RequestMethod.POST)
	@ResponseBody
	public Users userUpdate(@RequestBody Users user) {
		Long id = user.getId();
		return farmerService.userUpdate(user, id);
	}
	@RequestMapping(value = "/addUser",method =RequestMethod.PUT)
	@ResponseBody
	public void addUser(@RequestBody Users user) {
		farmerService.userAdd(user);
	}
	
	@RequestMapping(value = "/updateUser",method =RequestMethod.POST)
	@ResponseBody
	public Users updateUser(@RequestBody Users user,@RequestParam Long id) {
		return farmerService.userUpdate(user, id);
	}
	
	@RequestMapping(value = "/deleteUser",method =RequestMethod.DELETE)
	@ResponseBody
	public Users deleteUser(@RequestParam Long id) {
		return farmerService.userDelete(id);
	}
	
}
