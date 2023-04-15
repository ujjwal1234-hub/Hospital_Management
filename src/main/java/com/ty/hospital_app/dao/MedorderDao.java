package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedorderDao 
{
	public MedOrder saveMedorder(int eid,MedOrder medorder);
	public MedOrder getMedorderById(int mid);
	public boolean deleteMedorder(int mid);
	public MedOrder updateMedorder(int mid,MedOrder medorder);
	public List<MedOrder> getAllMedorder();
	public List<MedOrder> getMedorderByDoctorName(String name);
	// public List<MedOrder> getMedorderByDate(String date);
	
}
