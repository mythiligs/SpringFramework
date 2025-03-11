package com.test;

import java.util.List;

public class Meeting {
	private int id;
	private String name;
	private int number;
	private List<String>skills;
	private Address aobj;
	public Meeting()
	{
		
	}
	public Meeting(int id, String name, int number, List<String> skills,Address aobj) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.skills = skills;
		this.aobj= aobj;
	}
	public Address getAobj() {
		return aobj;
	}
	public void setAobj(Address aobj) {
		this.aobj = aobj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Meeting [id=" + id + ", name=" + name + ", number=" + number + ", skills=" + skills +", skills=" + aobj + "]";
	}
	
}
