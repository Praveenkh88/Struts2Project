package com.user.action;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.user.bean.Address;
import com.user.bean.Friend;
import com.user.bean.Hobby;
import com.user.bean.IdCard;
import com.user.bean.User;
import com.user.connection.HibernateUtil;
import com.user.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	User user=new User();
	Address addr=new Address();
	Hobby hobby1 =new Hobby();
	Hobby hobby2 =new Hobby();
	IdCard idcard=new IdCard();
	String cardtype;
	Friend friend1=new Friend();
	Friend friend2=new Friend();
	HibernateUtil util=new HibernateUtil();
	
	public Friend getFriend1() {
		return friend1;
	}


	public void setFriend1(Friend friend1) {
		this.friend1 = friend1;
	}


	public Friend getFriend2() {
		return friend2;
	}


	public void setFriend2(Friend friend2) {
		this.friend2 = friend2;
	}


	public String getCardtype() {
		return cardtype;
	}


	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}


	public IdCard getIdcard() {
		return idcard;
	}


	public void setIdcard(IdCard idcard) {
		this.idcard = idcard;
	}


	@Override
	public String toString() {
		return "UserAction [user=" + user + ", addr=" + addr + ", hobby1="
				+ hobby1 + ", hobby2=" + hobby2 + ", idcard=" + idcard
				+ ", uservice=" + uservice + "]";
	}


	public UserService getUservice() {
		return uservice;
	}

	public void setUservice(UserService uservice) {
		this.uservice = uservice;
	}

	public Hobby getHobby1() {
		return hobby1;
	}

	public void setHobby1(Hobby hobby1) {
		this.hobby1 = hobby1;
	}

	public Hobby getHobby2() {
		return hobby2;
	}

	public void setHobby2(Hobby hobby2) {
		this.hobby2 = hobby2;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	UserService uservice=new UserService();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private static final long serialVersionUID = 1L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

/*	public void validate()
	{
		if(StringUtils.isEmpty(user.getUsername()))
		{
			addFieldError("username", "username can not be left blank");
		}
		if(StringUtils.isEmpty(user.getPassword()))
		{
			addFieldError("password", "password can not be left blank");
		}
	}*/


	public String execute()
	{
		uservice.setIsvalue(user);
		return "executed";
	}
	public String createUser()
	{
		System.out.println(user.getUsername());
		System.out.println(addr.getCity());
		System.out.println(hobby1.getHobbyname());
		System.out.println(hobby2.getHobbyname());
		System.out.println("friend 1"+friend1.getFriendname());
		System.out.println("friend 2"+friend2.getFriendname());
		System.out.println(getCardtype());
		idcard.setCardtype(cardtype);
		user.setIdcard(idcard);
		user.setAddress(addr);
		user.getHobby().add(hobby1);
		user.getHobby().add(hobby2);
		user.getFriend().add(friend1);
		user.getFriend().add(friend2);
		Session session=util.createSession();
		uservice.insertUser(user,idcard,session);
		friend1.setUser(user);
		friend2.setUser(user);
		uservice.insertUser(friend1, friend2,session);
		util.commitTransaction(session);
		return "userdetails";
	}
	public String getUserDetails()
	{
		user=null;
		user=uservice.getUserDetails();
		System.out.println("user name"+user.getUsername());
		System.out.println("user name"+user.getPassword());
		System.out.println("user name"+user.getIsEqual());
		return "userpage";
	}

	@Override
	public User getModel() {
		return user;
	}
	
}