package com.farmer.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.farmer.admin.entity.Users;

@Service
public interface FarmerService {
	List<Users> getUser();
}
