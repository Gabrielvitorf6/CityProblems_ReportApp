package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserPointsService {
    Optional<User_Points> getPointsById(UUID id);
    List<UserPointsService> getAllPoints();
    User_Points savePoints(User_Points points);
    void deletePoints(UUID id);

    Optional<User_Points> findById(UUID id);

    void deleteById(UUID id);

    Optional<User_Points> update(User_Points userPoints);

    User_Points create(User_Points userPoints);
}
