package com.ty.hospital_app.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.HospitalDao;
import com.ty.hospital_app.dto.Hospital;

public class HospitalDaoImp implements HospitalDao
{
	public Hospital saveHospital(Hospital hospital)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(hospital);
		et.commit();
		return hospital;
	}
	public Hospital getHospitalById(int hid)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Hospital hospital=em.find(Hospital.class,hid);
		return hospital;
	}
	public boolean deleteHospitalById(int hid)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Hospital hospital=em.find(Hospital.class, hid);
		if(hospital != null)
		{
			et.begin();
			em.remove(hospital);
			et.commit();
			return true;
		}
		else {
			return false;
		}
	}
	public Hospital updateHospital(int hid, Hospital hospital) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Hospital hospital1=em.find(Hospital.class, hid);
		if(hospital1 != null)
		{
			hospital1.setHospital_name(hospital.getHospital_name());
			hospital1.setHospital_website(hospital.getHospital_website());
			et.begin();
			em.merge(hospital1);
			et.commit();
			return hospital1;
		}
		else {
			return null;
		}

	}
}
