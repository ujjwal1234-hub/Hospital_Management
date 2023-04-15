package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonDao
{
	public Person savePerson(int eid,Person person);
	public Person getPersonById(int person_id);
	public boolean deletePerson(int person_id);
	public Person updatePerson(int person_id,Person person);
	public List<Person> getAllPerson();
	public List<Person> getPersonByGender(String gender);
	public List<Person> getPersonByAge(int age);
	public List<Person> getPersonByPhone(long phone);
	
	

}
