package com.user.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="user_details")
public class User {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int user_id;
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public String username;
	public String password;
	public String isEqual;
	@OneToOne
	@JoinColumn(name="user_id_card")
	public IdCard idcard;;
	
	@OneToMany
	@JoinTable(name="user_friend",joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="friend_id"))
	Collection<Friend> friend=new ArrayList<Friend>();
/*@OneToMany(mappedBy="user")
	
	
	 * creating a new table use this where both of the primary key will be attached*/
	public Collection<Friend> getFriend() {
		return friend;
	}
	public void setFriend(Collection<Friend> friend) {
		this.friend = friend;
	}
	public IdCard getIdcard() {
		return idcard;
	}
	public void setIdcard(IdCard idcard) {
		this.idcard = idcard;
	}
	@Embedded
	public Address address;
	
	@ElementCollection
	@JoinTable(name="USER_HOBBY",joinColumns=@JoinColumn(name="user_id"))
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns = { @Column(name="hobby_id") }, generator = "hilo-gen", type = @Type(type = "long"))
	public Collection<Hobby> hobby=new ArrayList<Hobby>();
	

	public Collection<Hobby> getHobby() {
		return hobby;
	}
	public void setHobby(Collection<Hobby> hobby) {
		this.hobby = hobby;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username
				+ ", password=" + password + ", isEqual=" + isEqual + "]";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIsEqual() {
		return isEqual;
	}
	public void setIsEqual(String isEqual) {
		this.isEqual = isEqual;
	}
	
	
}
