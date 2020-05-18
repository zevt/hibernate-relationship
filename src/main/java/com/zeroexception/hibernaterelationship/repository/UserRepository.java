package com.zeroexception.hibernaterelationship.repository;


import com.zeroexception.hibernaterelationship.model.userrole.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
  Optional<User> findById(Long id);
}
