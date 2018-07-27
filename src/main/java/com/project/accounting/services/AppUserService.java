package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.AppUser;

public interface AppUserService {
	
	AppUser saveUser(AppUser user);
	
	AppUser updateUser(AppUser user);
	
	void deleteUser(AppUser user);
	
	AppUser getUserById(int id);
	
	List<AppUser> getAllUser();
	
	AppUser getUserByUserName(String name);

}
