package com.jwtpractice.jwttokenpractice.repositories;

import com.jwtpractice.jwttokenpractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 *
 * @author Karabo Pheko
 *
 * */

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
