package com.user.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Friend {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int friend_id;
	String friendname;
	String friendstars;
	@ManyToOne
	User user;
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getFriend_id() {
		return friend_id;
	}
	public void setFriend_id(int friend_id) {
		this.friend_id = friend_id;
	}
	public String getFriendname() {
		return friendname;
	}
	public void setFriendname(String friendname) {
		this.friendname = friendname;
	}
	public String getFriendstars() {
		return friendstars;
	}
	public void setFriendstars(String friendstars) {
		this.friendstars = friendstars;
	}
	
	
	
}

