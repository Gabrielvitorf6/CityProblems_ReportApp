package com.unipaulistana.CityProblemsReportApp.domainmodel.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    List<User> findAll();

    User findById(UUID id);

    void deleteById(UUID id);

    Optional<User> create(User user);

    Optional<User> update(User user);

    Optional<User> partialUpdate(User user);

    User findByUsername(String username);

    User findByEmail(String email);

    User findByCPF(String CPF);
}
