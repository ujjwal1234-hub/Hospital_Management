package com.ty.hospital_app.control;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestSaveHospital 
{
	public static void main(String[] args)
	{
		Hospital hospital=new Hospital();
		HospitalService service=new HospitalService();
	     hospital.setHospital_name("Appollo");
		hospital.setHospital_website("www.appollo.com");
		
		/*
		hospital.setHospital_name("Kims");
		hospital.setHospital_website("www.kims.com");
		
		hospital.setHospital_name("Narayana");
		hospital.setHospital_website("www.narayana.com");
		*/
		
		service.SaveHospital(hospital);
		
		
	}

}
