package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int person_id;
	private String person_name;
	private String person_address;
	private long person_phno;
	private int person_Age;
	private String person_gender;
	private String person_DOB;
	@OneToMany(mappedBy="person")
	private List<Encounter> encounter;
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_address() {
		return person_address;
	}
	public void setPerson_address(String person_address) {
		this.person_address = person_address;
	}
	public long getPerson_phno() {
		return person_phno;
	}
	public void setPerson_phno(long person_phno) {
		this.person_phno = person_phno;
	}
	public int getPerson_Age() {
		return person_Age;
	}
	public void setPerson_Age(int person_Age) {
		this.person_Age = person_Age;
	}
	public String getPerson_gender() {
		return person_gender;
	}
	public void setPerson_gender(String person_gender) {
		this.person_gender = person_gender;
	}
	public String getPerson_DOB() {
		return person_DOB;
	}
	public void setPerson_DOB(String person_DOB) {
		this.person_DOB = person_DOB;
	}
	public List<Encounter> getEncounter() {
		return encounter;
	}
	public void setEncounter(List<Encounter> encounter) {
		this.encounter = encounter;
	}
	
	
	
	

}
