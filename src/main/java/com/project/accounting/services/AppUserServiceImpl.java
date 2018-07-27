package com.project.accounting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.AppUser;
import com.project.accounting.repository.AppUserRepository;

@Service
public class AppUserServiceImpl implements AppUserService {
	
	@Autowired
	private AppUserRepository repository;

	public AppUserRepository getRepository() {
		return repository;
	}

	public void setRepository(AppUserRepository repository) {
		this.repository = repository;
	}

	@Override
	public AppUser saveUser(AppUser user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public AppUser updateUser(AppUser user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public void deleteUser(AppUser user) {
		repository.delete(user);
	}

	@Override
	public AppUser getUserById(int id) {
		// TODO Auto-generated method stub
		return repository.getOne(id);
	}

	@Override
	public List<AppUser> getAllUser() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public AppUser getUserByUserName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
