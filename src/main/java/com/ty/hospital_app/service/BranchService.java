package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dto.Branch;

public class BranchService 
{
	public void SaveBranch(Branch branch,int hid)
	{
		BranchDaoImp branchDaoImp = new BranchDaoImp();
		Branch branch1=branchDaoImp.saveBranch(hid, branch);
		if(branch1 != null)
		{
			System.out.println("Branch Saved");
		}
		else
		{
			System.out.println("Unfortunatly Branch not Saved");
		}
		
	}
	public Branch getBranchById(int branch_id) 
	{
		BranchDaoImp branchimp=new BranchDaoImp();
		Branch branch = branchimp.getBranchById(branch_id);
		if(branch != null)
		{
			return branch;
		}
		else
		{
			return null;
		}
	}

	public void deleteBranchById(int branch_id)
	{
		BranchDaoImp branchimp=new BranchDaoImp();
		boolean flag = branchimp.deleteBranchById(branch_id);
		if(flag)
		{
			System.out.println("Data Delete");
		}
		else
		{
			System.out.println(" Data not Deleted");
		}
	}
	
	public Branch updateBranch(int branch_id, Branch branch)
	{
		BranchDaoImp branchimp=new BranchDaoImp();
		Branch branch1 = branchimp.updateBranch(branch_id,branch);
		if(branch1 != null)
		{
			return branch1;
		}
		else
		{
			return null;
		}
	}
	
	public List<Branch> getAllBranch()
	{
		BranchDaoImp branchimp=new BranchDaoImp();
		List<Branch> branch = branchimp.getAllBranch();
		if(branch != null)
		{
			return branch;
		}
		else
		{
			return null;
		}
		
	}
}
