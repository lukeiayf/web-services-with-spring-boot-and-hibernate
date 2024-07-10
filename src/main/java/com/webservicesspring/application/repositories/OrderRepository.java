package com.webservicesspring.application.repositories;

import com.webservicesspring.application.entities.Order;
import com.webservicesspring.application.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
