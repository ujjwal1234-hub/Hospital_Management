package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.AddressDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;

public class AddressDaoImp implements AddressDao
{

	public Address saveAddress(int branch_id, Address address) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Branch branch=em.find(Branch.class, branch_id);
		if(branch != null)
		{
			et.begin();
			em.persist(address);
			et.commit();
			return address;
		}
		else
		{
			return null;
		}
	}

	public Address getAddressById(int aid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Address address=em.find(Address.class, aid);
		return address;
	}

	public boolean deleteAddressById(int aid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Address address=em.find(Address.class, aid);
		if(address != null)
		{
			et.begin();
			em.remove(address);
			et.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Address updateAddress(int aid, Address address) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Address address1=em.find(Address.class, aid);
		if(address != null)
		{
			address.setState(address1.getState());
			address.setPin(address1.getPin());
			et.begin();
			em.merge(address);
			et.commit();
			return address1;
		}
		else
		{
			return null;
		}
	}

	public List<Address> getAddressAll() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from Address s");
		List<Address> address=query.getResultList();
		return address;
	}
	

}
