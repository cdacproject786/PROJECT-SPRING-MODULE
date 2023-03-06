package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.AdminPrimary;

public interface AdminPrimaryRepository extends JpaRepository<AdminPrimary, Integer> {

	public AdminPrimary findByEmailAndPwd(String email, String pwd);
}
