package com.maybank.smartweb.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepo extends JpaRepository<Role, Long> {
    List<Role> findByUsers(User user);
}
