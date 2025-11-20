package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserPointsService {
    Optional<User_Points> getPointsById(UUID id);

    List<User_Points> getAllPoints();

    void deleteById(UUID id);

    User_Points create(User_Points userPoints);

    List<User_Points> findAllByUserProfile(UUID id);
}
