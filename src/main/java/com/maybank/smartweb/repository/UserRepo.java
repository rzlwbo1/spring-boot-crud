package com.maybank.smartweb.repository;

import com.maybank.smartweb.entity.Role;
import com.maybank.smartweb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
