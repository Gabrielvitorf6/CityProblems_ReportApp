package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserPointsRepository extends JpaRepository<User_Points, UUID> {

    List<User_Points> findAllByUserProfile(User_profile userProfile);
    
}
