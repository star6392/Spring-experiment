package com.myapp.spring.repository.rest;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.spring.model.ERole;
import com.myapp.spring.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
