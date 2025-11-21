package com.unipaulistana.CityProblemsReportApp.service;


import com.unipaulistana.CityProblemsReportApp.repositores.UserRepository;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
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
    public List<User> findByUsernameLike(String username) {
        return this.repository.findUserByUsernameLike(username);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return this.repository.findUserByEmail(email);
    }

    @Override
    public Optional<User> findByCPF(String CPF) {
        return this.repository.findUserByCpf(CPF);
    }

    public void deleteUserById(UUID id) {
        this.repository.deleteUserById(id);
    }

    @Override
    public User create(User user) {
        return this.repository.save(user);
    }

    @Override
    public Optional<User> findById(UUID id) {
        return this.repository.findUserById(id);
    }

    @Override
    public List<User> findByBirthdateAfter(Date birthdateAfter) {
        return this.repository.findUsersByBirthdateAfter(birthdateAfter);
    }

    @Override
    public List<User> findByBirthedateBefore(Date birthdateBefore) {
        return this.repository.findUsersByBirthdateBefore(birthdateBefore);
    }

    @Override
    public Optional<User> findByPhone(String phone) {
        return this.repository.findByPhone(phone);
    }

    @Override
    public List<User> findByCity(String city) {
        return this.repository.findUsersByCity(city);
    }

    @Override
    public List<User> findByAdressLike(String adress) {
        return this.repository.findUsersByAdressLike(adress);
    }

    @Override
    public List<User> findByState(String state) {
        return this.repository.findUsersByState(state);
    }

    @Override
    public List<User> findByCountry(String country) {
        return this.repository.findUsersByCountry(country);
    }

    @Override
    public List<User> findByCep(String cep) {
        return this.repository.findUsersByCEP(cep);
    }

    @Override
    public Optional<User> findByUserProfileId(UUID userProfileId) {
        return this.repository.findUserByUserProfile_Id(userProfileId);
    }

    @Override
    public List<User> findByCreatedDateBefore(Instant createdDate) {
        return this.repository.findUsersByCreatedDateBefore(createdDate);
    }

    @Override
    public List<User> findByCreatedDateAfter(Instant createdDate) {
        return this.repository.findUsersByCreatedDateIsAfter(createdDate);
    }

}
