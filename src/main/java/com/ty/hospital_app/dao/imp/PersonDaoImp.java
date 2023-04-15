package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public class PersonDaoImp implements PersonDao 
{

	public Person savePerson(int eid, Person person) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Encounter encounter=em.find(Encounter.class, eid);
		if(encounter != null)
		{
			et.begin();
			em.persist(person);
			et.commit();
			return person;
		}
		else
		{
			return null;
		}
	}

	public Person getPersonById(int person_id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Person person=em.find(Person.class, person_id);
		return person;
	}

	public boolean deletePerson(int person_id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person person=em.find(Person.class, person_id);
		if(person != null)
		{
			et.begin();
			em.remove(person);
			et.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Person updatePerson(int person_id, Person person) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person person1=em.find(Person.class, person_id);
		if(person != null)
		{
			person.setPerson_name(person1.getPerson_name());
			person.setPerson_address(person1.getPerson_address());
			et.begin();
			em.merge(person);
			et.commit();
			return person1;
		}
		else
		{
			return null;
		}
	}

	public List<Person> getAllPerson() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from Person s");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonByGender(String gender) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from Person s where person_gender like gender");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonByAge(int age) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from Person s where person_Age like age");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonByPhone(long phone) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from Person s where person_phno like phone");
		List<Person> person=query.getResultList();
		return person;
	}
	
	

}
