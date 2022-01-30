package com.farmer.admin.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.farmer.admin.entity.Users;

@Repository
public interface FarmerAdminDao {

	
	public List<Users> getUser();

	public void addUser(Users user);

	public Users userUpdate(Users user, Long id);
}
