package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.PersonDaoImp;
import com.ty.hospital_app.dto.Person;

public class PersonService
{
	public void savePerson(int eid,Person person)
	{
		PersonDaoImp personimp = new PersonDaoImp();
		Person person1=personimp.savePerson(eid, person);
		if(person1 != null)
		{
			System.out.println("Person Saved");
		}
		else
		{
			System.out.println("Unfortunatly Person not Saved");
		}
	}
	public Person getPersonById(int person_id)
	{
		PersonDaoImp personimp = new PersonDaoImp();
		Person person=personimp.getPersonById(person_id);
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public void deletePerson(int person_id)
	{
		PersonDaoImp personimp = new PersonDaoImp();
		boolean flag = personimp.deletePerson(person_id);
		if(flag)
		{
			System.out.println("Data Delete");
		}
		else
		{
			System.out.println(" Data not Deleted");
		}
	}
	public Person updatePerson(int person_id,Person person)
	{
		PersonDaoImp personimp = new PersonDaoImp();
		Person person1 = personimp.updatePerson(person_id, person);
		if(person1 != null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getAllPerson()
	{
		PersonDaoImp personimp = new PersonDaoImp();
		List<Person> person = personimp.getAllPerson();
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getPersonByGender(String gender)
	{
		PersonDaoImp personimp = new PersonDaoImp();
		List<Person> person = personimp.getPersonByGender(gender);
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getPersonByAge(int age)
	{
		PersonDaoImp personimp = new PersonDaoImp();
		List<Person> person = personimp.getPersonByAge(age);
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getPersonByPhone(long phone)
	{
		PersonDaoImp personimp = new PersonDaoImp();
		List<Person> person = personimp.getPersonByPhone(phone);
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}


}
