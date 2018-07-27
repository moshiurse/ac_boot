package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.project.accounting.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

}
