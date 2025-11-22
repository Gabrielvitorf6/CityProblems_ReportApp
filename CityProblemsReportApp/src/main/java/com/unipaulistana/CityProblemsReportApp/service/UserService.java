package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService extends UserDetailsService {

    List<User> findAll();

    List<User> findByUsernameLike(String username);

    Optional<User> findByEmail(String email);

    Optional<User> findByCPF(String CPF);

    void deleteUserById(UUID id);

    User create(User user);

    Optional<User> findById(UUID id);

    List<User> findByBirthdateAfter(Date birthdateAfter);

    List<User> findByBirthedateBefore(Date birthdateBefore);

    Optional<User> findByPhone(String phone);

    List<User> findByCity(String city);

    List<User> findByAdressLike(String adress);

    List<User> findByState(String state);

    List<User> findByCountry(String country);

    List<User> findByCep(String cep);

    Optional<User> findByUserProfileId(UUID userProfileId);

    List<User> findByCreatedDateBefore(Instant createdDate);

    List<User> findByCreatedDateAfter(Instant createdDate);
}
