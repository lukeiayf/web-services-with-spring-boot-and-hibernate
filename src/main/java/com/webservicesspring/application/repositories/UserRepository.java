package com.webservicesspring.application.repositories;

import com.webservicesspring.application.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
