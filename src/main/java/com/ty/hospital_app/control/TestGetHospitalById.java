package com.ty.hospital_app.control;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestGetHospitalById 
{
	public static void main(String[] args) 
	{
		HospitalService service= new HospitalService();
		Hospital hospital=service.getHospitalByID(4);
		System.out.println(hospital.getHospital_id());
		System.out.println(hospital.getHospital_name());
		System.out.println(hospital.getHospital_website());
	}

}
