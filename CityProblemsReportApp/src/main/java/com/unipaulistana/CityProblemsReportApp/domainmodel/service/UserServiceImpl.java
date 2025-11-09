package com.unipaulistana.CityProblemsReportApp.domainmodel.service;


import com.unipaulistana.CityProblemsReportApp.domainmodel.repositores.UserRepository;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository  repository;

    @Override
    public List<User> findAll() {
        return this.repository.findAll();
    }

    @Override
    public User findById(UUID id) {
        return (User) this.repository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(UUID id) { this.repository.deleteById(id);   
    }

    @Override
    public Optional<User> create(User user) {
        return this.repository.save(user);
    }

    @Override
    public Optional<User> update(User user) {
        return this.repository.save(user);
    }

    @Override
    public Optional<User> partialUpdate(User user) {
        return this.repository.save(user); 
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findByCPF(String CPF) {
        return null;
    }
}
