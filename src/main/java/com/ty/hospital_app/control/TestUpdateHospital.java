package com.ty.hospital_app.control;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestUpdateHospital 
{
	public static void main(String[] args) 
	{
		Hospital hospital=new Hospital();
		HospitalService service=new HospitalService();
		hospital.setHospital_name("Aster");
		hospital.setHospital_website("www.aster.com");
		
		service.updatHospital(6, hospital);
		
	}

}
