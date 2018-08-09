package com.project.accounting.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.AppUser;
import com.project.accounting.repository.AppUserRepository;
import com.project.accounting.services.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService{
	
	@Autowired
	private AppUserRepository repository;

	public AppUserRepository getRepository() {
		return repository;
	}

	public void setRepository(AppUserRepository repository) {
		this.repository = repository;
	}

	@Override
	public AppUser saveUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppUser updateUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AppUser getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppUser> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppUser getUserByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}


}
