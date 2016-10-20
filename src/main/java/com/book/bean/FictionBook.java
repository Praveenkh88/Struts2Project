package com.book.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FictionBook extends Book {

	
	String realstory;
	
	public String getRealstory() {
		return realstory;
	}

	public void setRealstory(String realstory) {
		this.realstory = realstory;
	}

	
	
}
