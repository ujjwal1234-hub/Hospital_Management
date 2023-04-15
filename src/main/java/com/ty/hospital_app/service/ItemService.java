package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ItemDaoImp;
import com.ty.hospital_app.dto.Item;

public class ItemService 
{
	public void saveItem(int mid,Item item)
	{
		ItemDaoImp itemimp = new ItemDaoImp();
		Item item1=itemimp.saveItem(mid, item);
		if(item1 != null)
		{
			System.out.println("Item Saved");
		}
		else
		{
			System.out.println("Unfortunatly Item not Saved");
		}
	}
	public Item getItemById(int id)
	{
		ItemDaoImp itemimp = new ItemDaoImp();
		Item item=itemimp.getItemById(id);
		if(item != null)
		{
			return item;
		}
		else
		{
			return null;
		}
	}
	public void deleteItem(int id)
	{
		ItemDaoImp itemimp = new ItemDaoImp();
		boolean flag = itemimp.deleteItem(id);
		if(flag)
		{
			System.out.println("Data Delete");
		}
		else
		{
			System.out.println(" Data not Deleted");
		}

	}
	public Item updateItem(int id,Item item)
	{
		ItemDaoImp itemimp = new ItemDaoImp();
		Item item1 = itemimp.updateItem(id, item);
		if(item1 != null)
		{
			return item1;
		}
		else
		{
			return null;
		}
	}
	public List<Item> getAllItems()
	{
		ItemDaoImp itemimp = new ItemDaoImp();
		List<Item> item = itemimp.getAllItems();
		if(item != null)
		{
			return item;
		}
		else
		{
			return null;
		}
	}


}
