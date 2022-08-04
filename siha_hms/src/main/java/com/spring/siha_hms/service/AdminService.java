package com.spring.siha_hms.service;

import java.util.List;

import com.spring.siha_hms.entity.Admin;
import com.spring.siha_hms.entity.User;

public interface AdminService {


	public List<Admin> findByRole(String user);

	public Admin findByEmail(String user);
	
	public List<Admin> findAll();

	public void save(Admin admin);
	
}
