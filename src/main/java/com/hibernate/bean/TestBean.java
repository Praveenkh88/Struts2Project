package com.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
/*
@NamedQuery(name="TestBean.byId",query="select testname from TestBean where testid=?")
@NamedNativeQuery(name="TestBean.bytestvlue",query="select * from test_bean where testvlue>?",resultClass=TestBean.class)
*/@Table(name="Test_Bean")
public class TestBean {

	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	 int testid;
	
	String testname;
	 String testvlue;
	 String testdesc;
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public String getTestvlue() {
		return testvlue;
	}
	public void setTestvlue(String testvlue) {
		this.testvlue = testvlue;
	}
	public String getTestdesc() {
		return testdesc;
	}
	public void setTestdesc(String testdesc) {
		this.testdesc = testdesc;
	}
	
	 
	
}
