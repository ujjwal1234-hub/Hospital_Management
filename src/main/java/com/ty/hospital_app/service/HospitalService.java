package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService
{
	public void SaveHospital(Hospital hospital)
	{
		HospitalDaoImp daoimp=new HospitalDaoImp();
		Hospital hospital1= daoimp.saveHospital(hospital);
		if(hospital1 != null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately data not saved");
		}
	}

	public Hospital getHospitalByID(int hid)
	{
		HospitalDaoImp daoimp=new HospitalDaoImp();
		Hospital hospital = daoimp.getHospitalById(hid);
		if(hospital != null)
		{
			return hospital;
		}
		else
		{
			return null;
		}
	}

	public void deleteHospitalById(int hid)
	{
		HospitalDaoImp daoimp=new HospitalDaoImp();
		boolean flag = daoimp.deleteHospitalById(hid);
		if(flag)
		{
			System.out.println("Data Delete");
		}
		else
		{
			System.out.println(" Data not Deleted");
		}
	}

	public Hospital updatHospital(int hid,Hospital hospital)
	{
		HospitalDaoImp daoimp=new HospitalDaoImp();
		Hospital hospital1 = daoimp.updateHospital(hid,hospital);
		if(hospital1 != null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
	}
}
