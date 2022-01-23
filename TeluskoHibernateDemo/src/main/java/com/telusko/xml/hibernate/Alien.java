package com.telusko.xml.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Alien {

	@Id
	private int id;
	private String aname;
	private String color;
	
	
	@Override
	public String toString() {
		return "Alien [id=" + id + ", aname=" + aname + ", color=" + color + "]";
	}
	public Alien() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
