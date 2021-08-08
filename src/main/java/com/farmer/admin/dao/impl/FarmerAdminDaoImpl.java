package com.farmer.admin.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.farmer.admin.dao.FarmerAdminDao;
import com.farmer.admin.entity.Users;

@Component
public class FarmerAdminDaoImpl implements FarmerAdminDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Users> getUser(){
		List<Users> users = null ;
		Session session = sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		users = session.createQuery("from users").list();
		return users;
	}
}
