package com.example.petpeers.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pet")
public class Pet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3787223654181296174L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String petname;
	private String place;
	private String action;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petName) {
		this.petname = petName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	} 
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", petName=" + petname + ", place=" + place + ", action=" + action + "]";
	}
}
