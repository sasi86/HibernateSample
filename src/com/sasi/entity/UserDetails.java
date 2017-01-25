package com.sasi.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="user_name")
	private String name;
	
	@OneToMany(mappedBy="user")
	//@JoinColumn(name="v_id")
	//@JoinTable(name="user_vehicle", joinColumns=@JoinColumn(name="u_id"), inverseJoinColumns=@JoinColumn(name="v_id"))
	private Collection<Vehicle> vechicle = new ArrayList<>();
	
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
	public Collection<Vehicle> getVechicle() {
		return vechicle;
	}
	public void setVechicle(Collection<Vehicle> vechicle) {
		this.vechicle = vechicle;
	}
	
	
	
}
