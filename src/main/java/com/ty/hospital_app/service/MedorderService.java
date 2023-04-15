package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.MedorderDaoImp;
import com.ty.hospital_app.dto.MedOrder;

public class MedorderService 
{
	public void saveMedorder(int eid,MedOrder medorder)
	{
		MedorderDaoImp medorderimp = new MedorderDaoImp();
		MedOrder medorder1=medorderimp.saveMedorder(eid, medorder);
		if(medorder1 != null)
		{
			System.out.println("Medorder Saved");
		}
		else
		{
			System.out.println("Unfortunatly Medorder not Saved");
		}
	}
	public MedOrder getMedorderById(int mid)
	{
		MedorderDaoImp medorderimp = new MedorderDaoImp();
		MedOrder medorder=medorderimp.getMedorderById(mid);
		if(medorder != null)
		{
			return medorder;
		}
		else
		{
			return null;
		}
	}
	public void deleteMedorder(int mid)
	{
		MedorderDaoImp medorderimp = new MedorderDaoImp();
		boolean flag = medorderimp.deleteMedorder(mid);
		if(flag)
		{
			System.out.println("Data Delete");
		}
		else
		{
			System.out.println(" Data not Deleted");
		}
	}
	public MedOrder updateMedorder(int mid,MedOrder medorder)
	{
		MedorderDaoImp medorderimp = new MedorderDaoImp();
		MedOrder medorder1 = medorderimp.updateMedorder(mid, medorder);
		if(medorder1 != null)
		{
			return medorder1;
		}
		else
		{
			return null;
		}
	}
	public List<MedOrder> getAllMedorder()
	{
		MedorderDaoImp medorderimp = new MedorderDaoImp();
		List<MedOrder> medorder = medorderimp.getAllMedorder();
		if(medorder != null)
		{
			return medorder;
		}
		else
		{
			return null;
		}
	}
	public List<MedOrder> getMedorderByDoctorName(String name)
	{
		MedorderDaoImp medorderimp = new MedorderDaoImp();
		List<MedOrder> medorder = medorderimp.getMedorderByDoctorName(name);
		if(medorder != null)
		{
			return medorder;
		}
		else
		{
			return null;
		}
	}

}
