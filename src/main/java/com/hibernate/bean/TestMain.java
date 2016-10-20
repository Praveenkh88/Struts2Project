package com.hibernate.bean;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.user.connection.HibernateUtil;

public class TestMain {

	public static void main(String[] args)
	{
		
		/**************** test for crud*/
		TestBean beanobj=new TestBean();
		TestBean beanobj1=new TestBean();
		HibernateUtil util=new HibernateUtil();
		/*beanobj.setTestdesc("descridsdption");
		beanobj.setTestname("tesdstname");
		beanobj.setTestvlue("5110");
		beanobj1.setTestdesc("descriptionnn");
		beanobj1.setTestname("twqqestnamee");
		beanobj1.setTestvlue("5000");
		/**************** test for crud*/
		Session session=util.createSession();
	//	util.saveSession(beanobj1, beanobj, session);
		//TestBean beanobj3=(TestBean)session.get(TestBean.class, 2);
		//System.out.println("beanobj"+beanobj3.getTestvlue());
		//beanobj3.setTestdesc("this is updated");
		//session.update(beanobj3);
		/*Query obect HQL
		String testid="5";
	//	Query query=session.createQuery("select testname from TestBean where testid>? and testvlue>?");
		Query query=session.getNamedQuery("TestBean.byId");
		query.setInteger(0, Integer.parseInt(testid));
		Query query1=session.getNamedQuery("TestBean.bytestvlue");
	    query1.setInteger(0, Integer.parseInt(testid));
		
		List<String> users=(List<String>)query.list();
		List<TestBean> users1=(List<TestBean>)query1.list();
		
			for(TestBean u:users1)
			System.out.println("users1 is"+u.testname);
		
		*/

		Criteria criteria=session.createCriteria(TestBean.class).addOrder(Order.desc("testid"));
		//criteria.add(Restrictions.eq("testid", 2));
		criteria.add(
				Restrictions.or(Restrictions.gt("testvlue"," 5000"), Restrictions.between("testid", 2, 5)));
		
		List<TestBean> users=(List<TestBean>)criteria.list();
		util.commitTransaction(session);
		for(TestBean u:users)
		{
			System.out.println("users is"+u.getTestdesc());
		}
	
		System.out.println("list size ="+users.size());
		
		
	}
}
