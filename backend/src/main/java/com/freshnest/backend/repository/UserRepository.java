package com.freshnest.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freshnest.backend.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Define custom query methods if needed
    Optional<User> findFirstByEmail(String email);

}
