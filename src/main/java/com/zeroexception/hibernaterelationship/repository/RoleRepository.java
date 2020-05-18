package com.zeroexception.hibernaterelationship.repository;


import com.zeroexception.hibernaterelationship.model.userrole.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {

}
