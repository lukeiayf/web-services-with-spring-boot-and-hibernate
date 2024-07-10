package com.webservicesspring.application.repositories;

import com.webservicesspring.application.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
