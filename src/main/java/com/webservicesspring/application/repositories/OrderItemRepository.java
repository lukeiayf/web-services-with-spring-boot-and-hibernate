package com.webservicesspring.application.repositories;

import com.webservicesspring.application.entities.OrderItem;
import com.webservicesspring.application.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
