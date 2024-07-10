package com.webservicesspring.application.repositories;

import com.webservicesspring.application.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
