package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.EncounterDaoImp;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService
{
	 public void saveEncounter(int branch_id,Encounter encounter)
	 {
		 EncounterDaoImp encounterimp = new EncounterDaoImp();
			Encounter encounter1=encounterimp.saveEncounter(branch_id, encounter);
			if(encounter1 != null)
			{
				System.out.println("Encounter Saved");
			}
			else
			{
				System.out.println("Unfortunatly Encounter not Saved");
			}
	 }
		public Encounter getEncounterById(int eid)
		{
			EncounterDaoImp encounterimp = new EncounterDaoImp();
			Encounter encounter=encounterimp.getEncounterById(eid);
			if(encounter != null)
			{
				return encounter;
			}
			else
			{
				return null;
			}
		}
		public void deleteEncounterById(int eid)
		{
			EncounterDaoImp encounterimp = new EncounterDaoImp();
			boolean flag = encounterimp.deleteEncounterById(eid);
			if(flag)
			{
				System.out.println("Data Delete");
			}
			else
			{
				System.out.println(" Data not Deleted");
			}
		}
		public Encounter updateEncounter(int eid,Encounter encounter)
		{
			EncounterDaoImp encounterimp = new EncounterDaoImp();
			Encounter encounter1 = encounterimp.updateEncounter(eid, encounter);
			if(encounter1 != null)
			{
				return encounter1;
			}
			else
			{
				return null;
			}
		}
		public List<Encounter> getAllEncounter()
		{
			EncounterDaoImp encounterimp = new EncounterDaoImp();
			List<Encounter> encounter = encounterimp.getAllEncounter();
			if(encounter != null)
			{
				return encounter;
			}
			else
			{
				return null;
			}
		}


}
