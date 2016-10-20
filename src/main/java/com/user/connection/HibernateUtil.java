package com.user.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.user.bean.User;

public class HibernateUtil {

	@SuppressWarnings("deprecation")
	SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
	
	
	public Session createSession()
	{
		
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		return session;
	}
	
	public Session saveSession(Object object,Object object1,Session session)
	{
	session.save(object);
	session.save(object1);
	return session;
	}
	
	public void commitTransaction(Session session)
	{
		session.getTransaction().commit();
		session.close();
	}
	
	public User getSession()
	{
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		return (User) session.get(User.class, "nazar");
		
	}
	
}
