package com.payroll.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payroll.app.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
