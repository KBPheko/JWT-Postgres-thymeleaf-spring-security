package com.jwtpractice.jwttokenpractice.repositories;

import com.jwtpractice.jwttokenpractice.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Karabo Pheko
 *
 * */

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
