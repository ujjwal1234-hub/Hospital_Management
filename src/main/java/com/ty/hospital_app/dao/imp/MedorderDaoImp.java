package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.MedorderDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.MedOrder;

public class MedorderDaoImp implements MedorderDao
{

	public MedOrder saveMedorder(int eid, MedOrder medorder) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Encounter encounter=em.find(Encounter.class, eid);
		if(encounter != null)
		{
			et.begin();
			em.persist(medorder);
			et.commit();
			return medorder;
		}
		else
		{
			return null;
		}
	}

	public MedOrder getMedorderById(int mid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		MedOrder medorder=em.find(MedOrder.class, mid);
		return medorder;
	}

	public boolean deleteMedorder(int mid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		MedOrder medorder=em.find(MedOrder.class, mid);
		if(medorder != null)
		{
			et.begin();
			em.remove(medorder);
			et.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public MedOrder updateMedorder(int mid, MedOrder medorder) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		MedOrder medorder1=em.find(MedOrder.class, mid);
		if(medorder != null)
		{
			medorder.setOrderDate(medorder1.getOrderDate());
			medorder.setTotal(medorder1.getTotal());
			et.begin();
			em.merge(medorder);
			et.commit();
			return medorder1;
		}
		else
		{
			return null;
		}
	}

	public List<MedOrder> getAllMedorder() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from MedOrder s");
		List<MedOrder> medorder=query.getResultList();
		return medorder;
	}

	public List<MedOrder> getMedorderByDoctorName(String name) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from MedOrder s where dname like name ");
		List<MedOrder> medorder=query.getResultList();
		return medorder;
	}
	

}
