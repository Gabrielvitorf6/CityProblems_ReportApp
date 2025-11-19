package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.service.UserPointsService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserPointsRepository extends JpaRepository<User_Points, UUID> {

    List<User_Points> findAllByUserProfile(User_profile userProfile);

    Optional<User_Points> findUser_PointsById(UUID id);

    default List<UserPointsService> findAll() {
        return null;
    }

    User_Points save(User_Points points);

    void deleteById(UUID id);
}
