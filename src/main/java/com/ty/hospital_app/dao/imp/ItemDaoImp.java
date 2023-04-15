package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ItemDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public class ItemDaoImp implements ItemDao
{

	public Item saveItem(int mid, Item item) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		MedOrder medorder=em.find(MedOrder.class, mid);
		if(medorder != null)
		{
			et.begin();
			em.persist(item);
			et.commit();
			return item;
		}
		else
		{
			return null;
		}
	}

	public Item getItemById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Item item=em.find(Item.class, id);
		return item;
	}

	public boolean deleteItem(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Item item=em.find(Item.class, id);
		if(item != null)
		{
			et.begin();
			em.remove(item);
			et.commit();
			return true;
		}
		else
		{
			return false;
		}	
	}

	public Item updateItem(int id, Item item) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Item item1=em.find(Item.class, id);
		if(item != null)
		{
			item.setCost(item1.getCost());
			item.setQuantity(item1.getQuantity());
			et.begin();
			em.merge(item);
			et.commit();
			return item1;
		}
		else
		{
			return null;
		}
	}

	public List<Item> getAllItems() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select s from Item s");
		List<Item> item=query.getResultList();
		return item;
	}


}
