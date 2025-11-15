package com.unipaulistana.CityProblemsReportApp.service;


import com.unipaulistana.CityProblemsReportApp.repositores.UserRepository;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public void deleteById(UUID id) {
        this.repository.deleteUserById(id);
    }
}
