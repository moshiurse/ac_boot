package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.AppUser;

public interface AppUserService {

	AppUser saveUser(AppUser appUser);
	
	AppUser updateUser(AppUser appUser);
	
	void deleteUser();
	
	AppUser getUserById(int id);
	
	List<AppUser> getAllUser();
	
	AppUser getUserByUserName(String username);
	
}
