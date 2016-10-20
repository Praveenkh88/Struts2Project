package com.book.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NonFictionBook extends Book{

	
	String story;
	
	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}


}
