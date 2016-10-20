package com.user.service;

import org.hibernate.Session;

import com.user.bean.IdCard;
import com.user.bean.User;
import com.user.dao.UserDAO;

public class UserService {

	UserDAO udao=new UserDAO();
	public void setIsvalue(User user)
	{
		if(user.getUsername().equals(user.getPassword()))
		{
			user.setIsEqual("true hai");
		}
	
		else
			{
				user.setIsEqual("False hai");
			}
	}
	
	public void insertUser(Object user,Object idcard,Session session)
	{
		udao.insertUser(user,idcard,session);
	}
	public User getUserDetails()
	{
		return udao.getUserDetails();
	}
}
