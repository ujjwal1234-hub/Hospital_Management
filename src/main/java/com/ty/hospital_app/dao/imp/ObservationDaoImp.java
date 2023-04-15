package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ObservationDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Observation;

public class ObservationDaoImp implements ObservationDao
{

	public Observation saveObservation(int eid, Observation observation) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Encounter encounter=em.find(Encounter.class, eid);
		if(encounter != null)
		{
			et.begin();
			em.persist(observation);
			et.commit();
			return observation;
		}
		else
		{
			return null;
		}
	}

	public Observation getObservationById(int oid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Observation observation=em.find(Observation.class, oid);
		return observation;	
		}

	public boolean deleteObseravtion(int oid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Observation observation=em.find(Observation.class, oid);
		if(observation != null)
		{
			et.begin();
			em.remove(observation);
			et.commit();
			return true;
		}
		else
		{
			return false;
		}

	}

	public Observation updateObseravtion(int oid, Observation observation) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Observation observation1=em.find(Observation.class, oid);
		if(observation != null)
		{
			observation.setRobservation(observation1.getRobservation());
			observation.setDname(observation1.getDname());
			et.begin();
			em.merge(observation);
			et.commit();
			return observation1;
		}
		else
		{
			return null;
		}
	}

	public List<Observation> getAllObservation() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from Observation s");
		List<Observation> observation=query.getResultList();
		return observation;
	}

	public List<Observation> getObservationByDoctorName(String name) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from Observation s where dname like name");
		List<Observation> observation=query.getResultList();
		return observation;
	}
	
	

}
