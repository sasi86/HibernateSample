package com.sasi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vechicle")
public class Vehicle {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="vechicle_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="u_id")
	private UserDetails user;
	
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
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	
	

}
