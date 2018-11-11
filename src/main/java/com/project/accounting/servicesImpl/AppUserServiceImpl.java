package com.project.accounting.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.accounting.model.AppUser;
import com.project.accounting.repository.AppUserRepository;
import com.project.accounting.services.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService{
	
	@Autowired
	private AppUserRepository appUserRepository;

	@Override
	public AppUser saveUser(AppUser appUser) {

		return appUserRepository.save(appUser);
	}

	@Override
	public AppUser findByUserName(String userName) {
		return appUserRepository.findByUserName(userName);
	}

	@Override
	public AppUser findByEmail(String email) {
		return appUserRepository.findByEmail(email);
	}

	@Override
	public List<AppUser> showActiveUserBycompany(int company) {
		return appUserRepository.showActiveUserBycompany(company);
	}

	@Override
	public List<AppUser> showAllUserBycompany(int company) {
		return appUserRepository.findByCompany(company);
	}

	@Override
	public List<AppUser> showUserByIdNameOrUserNameByCompany(String searchValue, int company) {
		return appUserRepository.showUserByIdNameOrUserNameByCompany(searchValue, company);
	}


	@Override
		public void deleteUser(Long id, int company) {

			appUserRepository.deleteUser(id, company);
		}

	@Override
	public Optional<AppUser> getUserById(Long id) {

			return appUserRepository.findById(id);
		}


	@Override
	public boolean isUserExists(String username, String email) {
		AppUser userName = appUserRepository.findByUserName(username);
		AppUser userEmail = appUserRepository.findByEmail(email);

			if (userName != null || userEmail!= null){
				return true;
			}
		return false;
	}


}
