package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.UserDao;
import com.ty.hospital_app.dto.User;

public class UserDaoImp  implements UserDao
{

	public User saveUser(User user) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(user);
		et.commit();
		return user;
	}

	public User getUserById(int uid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		User user=em.find(User.class,uid);
		return user;
	}

	public boolean deleteUserById(int uid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		User user=em.find(User.class,uid);
		if(user != null)
		{
			et.begin();
			em.remove(user);
			et.commit();
			return true;
		}
		else {
			return false;
		}	
	}

	public User updateUser(int uid, User user) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		User user1=em.find(User.class,uid);
		if(user != null)
		{
			user.setEmail(user1.getEmail());
			user.setPassword(user1.getPassword());
			et.begin();
			em.merge(user);
			et.commit();
			return user1;
		}
		else {
			return null;
		}
	}

	public List<User> getAllUser() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from User s");
		List<User> user=query.getResultList();
		return user;
	}

	public List<User> getUserByRole(String role) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from User s where role like role");
		List<User> user=query.getResultList();
		return user;
	}


}
