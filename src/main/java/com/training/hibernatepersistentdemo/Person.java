package com.training.hibernatepersistentdemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
	private String technology;
	private String hobbies;
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}

}
