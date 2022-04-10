package com.farmer.admin.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
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
		session.close();
		return users;
	}

	@Override
	public void addUser(Users user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}

	@Override
	public Users userUpdate(Users user, Long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Users users = session.load(Users.class, id);
        users=user;
        session.update(users);
        tx.commit();
        session.close();
		return users;
	}

	@Override
	public Users userDelete(Long id) {
		Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Criteria crit = session.createCriteria(Users.class);
        crit.add(Restrictions.eq("id",id));
        List<Users> uList = crit.list();
        Users users = session.load(Users.class, id);
        session.delete(users);
        tx.commit();
        session.close();
		return users;
	}
}
