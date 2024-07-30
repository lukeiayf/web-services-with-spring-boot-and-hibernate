package com.webservicesspring.application.services;

import com.webservicesspring.application.entities.User;
import com.webservicesspring.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = repository.findById(id);
        return user.orElse(null);
    }

    public User insert(User obj) {
        repository.save(obj);
        return obj;
    }
}
