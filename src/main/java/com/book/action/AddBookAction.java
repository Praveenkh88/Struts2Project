package com.book.action;
import org.hibernate.Session;

import com.book.bean.Book;
import com.book.bean.FictionBook;
import com.book.bean.NonFictionBook;
import com.hibernate.bean.TestBean;
import com.opensymphony.xwork2.ActionSupport;
import com.user.bean.Address;
import com.user.bean.User;
import com.user.connection.HibernateUtil;

public class AddBookAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HibernateUtil uti=new HibernateUtil();
	User user=new User();
	User user2=new User();
	Address addr=new Address();
	Book book=new Book();
	Book fiction=new FictionBook();
	Book nonfiction=new NonFictionBook();
	
	

	
	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}


	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setFiction(Book fiction) {
		this.fiction = fiction;
	}

	public void setNonfiction(Book nonfiction) {
		this.nonfiction = nonfiction;
	}

	public HibernateUtil getUti() {
		return uti;
	}

	public void setUti(HibernateUtil uti) {
		this.uti = uti;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Book getFiction() {
		return fiction;
	}


	public Book getNonfiction() {
		return nonfiction;
	}


	public String execute()
	{
		
		Session session=uti.createSession();
		
		/**************** test for crud*/
		TestBean beanobj=new TestBean();
		TestBean beanobj1=new TestBean();
		beanobj.setTestdesc("description");
		beanobj.setTestname("testname");
		beanobj.setTestvlue("50");
		beanobj1.setTestdesc("descriptionnn");
		beanobj1.setTestname("testnamee");
		beanobj1.setTestvlue("500");
		/**************** test for crud*/
		
		
		
		
		user.setAddress(addr);
		System.out.println("fiction"+fiction.getBook_id());
		System.out.println("nonfiction"+nonfiction.getBook_id());
		uti.saveSession(user, book, session);
		uti.saveSession(fiction, nonfiction, session);
		uti.saveSession(beanobj, beanobj1, session);
		uti.commitTransaction(session);
		
		return "bookdetails";
	}
	
	
}
