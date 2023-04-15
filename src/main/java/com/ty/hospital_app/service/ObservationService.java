package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ObservationDaoImp;
import com.ty.hospital_app.dto.Observation;

public class ObservationService 
{
	public void saveObservation(int eid,Observation observation)
	{
		ObservationDaoImp observimp = new ObservationDaoImp();
		Observation observation1=observimp.saveObservation(eid, observation);
		if(observation1 != null)
		{
			System.out.println("Observation Saved");
		}
		else
		{
			System.out.println("Unfortunatly Observation not Saved");
		}
		
	}
	
	public Observation getObservationById(int oid)
	{
		ObservationDaoImp observimp = new ObservationDaoImp();
		Observation observation=observimp.getObservationById(oid);
		if(observation != null)
		{
			return observation;
		}
		else
		{
			return null;
		}
		
	}
	public void deleteObseravtion(int oid)
	{
		ObservationDaoImp observimp = new ObservationDaoImp();
		boolean flag = observimp.deleteObseravtion(oid);
		if(flag)
		{
			System.out.println("Data Delete");
		}
		else
		{
			System.out.println(" Data not Deleted");
		}
	}
	public Observation updateObseravtion(int oid,Observation observation)
	{
		ObservationDaoImp observimp = new ObservationDaoImp();
		Observation observation1 = observimp.updateObseravtion(oid, observation);
		if(observation1 != null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
	public List<Observation> getAllObservation()
	{
		ObservationDaoImp observimp = new ObservationDaoImp();
		List<Observation> observation = observimp.getAllObservation();
		if(observation != null)
		{
			return observation;
		}
		else
		{
			return null;
		}
	}
	public List<Observation> getObservationByDoctorName(String name)
	{
		ObservationDaoImp observimp = new ObservationDaoImp();
		List<Observation> observation = observimp.getObservationByDoctorName(name);
		if(observation != null)
		{
			return observation;
		}
		else
		{
			return null;
		}
	}
	

}
