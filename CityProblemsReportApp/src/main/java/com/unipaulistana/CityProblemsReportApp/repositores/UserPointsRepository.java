package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.service.UserPointsService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserPointsRepository extends JpaRepository<User_Points, UUID> {

    List<User_Points> findAllByUserProfile_Id(UUID userProfileId);

    Optional<User_Points> findUser_PointsById(UUID id);

    void deleteById(UUID id);
}
