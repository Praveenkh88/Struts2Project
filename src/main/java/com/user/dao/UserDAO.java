package com.user.dao;



import org.hibernate.Session;

import com.user.bean.User;
import com.user.connection.HibernateUtil;

public class UserDAO {

	HibernateUtil util=new HibernateUtil();
	
	public void insertUser(Object user,Object idcard,Session session)
	{
		util.saveSession(user,idcard,session);
	}
	public User getUserDetails()
	{
		User user=new User();
		user=util.getSession();
		return user;
	}
}
