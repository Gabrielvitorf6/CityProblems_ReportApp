package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> findAll();

    User findById(UUID id);

    User findByUsername(String username);

    User findByEmail(String email);

    User findByCPF(String CPF);

    void deleteById(UUID id);
}
