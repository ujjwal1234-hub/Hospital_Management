package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Branch;

public interface BranchDao 
{
	public Branch saveBranch(int hid,Branch branch);
	public Branch getBranchById(int branch_id);
	public boolean deleteBranchById(int branch_id);
	public Branch updateBranch(int branch_id,Branch branch);
	public List<Branch> getAllBranch();

}
