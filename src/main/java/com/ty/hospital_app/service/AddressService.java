package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.AddressDaoImp;
import com.ty.hospital_app.dto.Address;

public class AddressService
{
	public void saveAddress(int branch_id, Address address)
	{
		AddressDaoImp addressimp = new AddressDaoImp();
		Address address1=addressimp.saveAddress(branch_id, address);
		if(address1 != null)
		{
			System.out.println("Branch Saved");
		}
		else
		{
			System.out.println("Unfortunatly Branch not Saved");
		}
	}
	public Address getAddressById(int aid) 
	{
		AddressDaoImp addressimp = new AddressDaoImp();
		Address address=addressimp.getAddressById(aid);
		if(address != null)
		{
			return address;
		}
		else
		{
			return null;
		}
	}

	public void deleteAddressById(int aid)
	{
		AddressDaoImp addressimp = new AddressDaoImp();
		boolean flag = addressimp.deleteAddressById(aid);
		if(flag)
		{
			System.out.println("Data Delete");
		}
		else
		{
			System.out.println(" Data not Deleted");
		}
	}
	
	public Address updateAddress(int aid, Address address)
	{
		AddressDaoImp addressimp = new AddressDaoImp();
		Address address1 = addressimp.updateAddress(aid, address);
		if(address1 != null)
		{
			return address1;
		}
		else
		{
			return null;
		}
	}
	public List<Address> getAddressAll()
	{
		AddressDaoImp addressimp = new AddressDaoImp();
		List<Address> address = addressimp.getAddressAll();
		if(address != null)
		{
			return address;
		}
		else
		{
			return null;
		}
	}
	
}
