package com.user.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Hobby {

	public String hobbyname;
	public String hobbytime;
	public String hobbylove;
	public String getHobbyname() {
		return hobbyname;
	}
	public void setHobbyname(String hobbyname) {
		this.hobbyname = hobbyname;
	}
	public String getHobbytime() {
		return hobbytime;
	}
	public void setHobbytime(String hobbytime) {
		this.hobbytime = hobbytime;
	}
	public String getHobbylove() {
		return hobbylove;
	}
	public void setHobbylove(String hobbylove) {
		this.hobbylove = hobbylove;
	}
	
	
	
}
