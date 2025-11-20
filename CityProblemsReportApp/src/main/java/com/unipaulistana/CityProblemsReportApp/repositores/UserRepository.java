package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.support.Querydsl;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import com.querydsl.core.types.OrderSpecifier;
import org.springframework.stereotype.Repository;

import java.lang.ScopedValue;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends
        JpaRepository<User,UUID>{

    Optional<User> findUserById(UUID id);

    List<User> findUserByUsernameLike(String username);

    List<User> findUsersByBirthdateAfter(Date birthdateAfter);

    List<User> findUsersByBirthdateBefore(Date birthdateBefore);

    Optional<User> findUserByEmail(String email);

    Optional<User> findByUsernameAndEmail(String username, String email);

    Optional<User> findByPhone(String phone);

    Optional<User> findUserByCpf(String cpf);

    List<User> findUsersByAdressLike(String adress);

    //find user by adress and adress number

    List<User> findUsersByCity(String city);

    List<User> findUsersByState(String state);

    List<User> findUsersByCountry(String country);

    List<User> findUsersByCEP(String cep);

    Optional<User> findUserByUserProfile(User_profile userProfile);

    List<User> findUsersByCreatedDateBefore(Instant createdDateBefore);

    List<User> findUsersByCreatedDateIsAfter(Instant createdDateAfter);

    void deleteUserById(UUID id);
}