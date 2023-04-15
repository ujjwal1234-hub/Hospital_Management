package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.AddressDaoImp;
import com.ty.hospital_app.dao.imp.UserDaoImp;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.User;

public class UserService 
{
	public void saveUser(User user)
	{
		UserDaoImp userimp = new UserDaoImp();
		User user1=userimp.saveUser(user);
		if(user1 != null)
		{
			System.out.println("User Saved");
		}
		else
		{
			System.out.println("Unfortunatly User not Saved");
		}
	}
	public User getUserById(int uid)
	{
		UserDaoImp userimp = new UserDaoImp();
		User user=userimp.getUserById(uid);
		if(user != null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
	public void deleteUserById(int uid)
	{
		UserDaoImp userimp = new UserDaoImp();
		boolean flag = userimp.deleteUserById(uid);
		if(flag)
		{
			System.out.println("Data Delete");
		}
		else
		{
			System.out.println(" Data not Deleted");
		}
	}
	public User updateUser(int uid,User user)
	{
		UserDaoImp userimp = new UserDaoImp();
		User user1 = userimp.updateUser(uid, user);
		if(user1 != null)
		{
			return user1;
		}
		else
		{
			return null;
		}
	}
	public List<User> getAllUser()
	{
		UserDaoImp userimp = new UserDaoImp();
		List<User> user = userimp.getAllUser();
		if(user != null)
		{
			return user;
		}
		else
		{
			return null;
		}

	}
	public List<User> getUserByRole(String role)
	{
		UserDaoImp userimp = new UserDaoImp();
		List<User> user = userimp.getUserByRole(role);
		if(user != null)
		{
			return user;
		}
		else
		{
			return null;
		}

	}

}
