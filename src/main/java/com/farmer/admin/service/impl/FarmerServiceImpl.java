package com.farmer.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.farmer.admin.dao.FarmerAdminDao;
import com.farmer.admin.entity.Users;
import com.farmer.admin.service.FarmerService;

@Component
public class FarmerServiceImpl implements FarmerService{
	
	@Autowired
	FarmerAdminDao farmerAdminDao;

	@Override
	public List<Users> getUser() {
		// TODO Auto-generated method stub
		return farmerAdminDao.getUser();
	}
	
}
