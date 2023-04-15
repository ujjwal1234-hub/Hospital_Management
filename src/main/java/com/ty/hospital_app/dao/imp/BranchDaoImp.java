package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.BranchDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class BranchDaoImp implements BranchDao{

	public Branch saveBranch(int hid, Branch branch) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Hospital hospital=em.find(Hospital.class, hid);
		if(hospital != null)
		{
			et.begin();
			em.persist(branch);
			et.commit();
			return branch;
		}
		else
		{
			return null;
		}
	}

	public Branch getBranchById(int branch_id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Branch branch=em.find(Branch.class, branch_id);
		return branch;
	}

	public boolean deleteBranchById(int branch_id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Branch branch=em.find(Branch.class, branch_id);
		if(branch != null)
		{
			et.begin();
			em.remove(branch);
			et.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Branch updateBranch(int branch_id, Branch branch) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Branch branch1=em.find(Branch.class, branch_id);
		if(branch != null)
		{
			branch.setBranch_name(branch1.getBranch_name());
			branch.setEmail(branch1.getEmail());
			et.begin();
			em.merge(branch);
			et.commit();
			return branch1;
		}
		else
		{
			return null;
		}
	}

	public List<Branch> getAllBranch() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from Branch s");
		List<Branch> branch=query.getResultList();
		return branch;
	}

}
