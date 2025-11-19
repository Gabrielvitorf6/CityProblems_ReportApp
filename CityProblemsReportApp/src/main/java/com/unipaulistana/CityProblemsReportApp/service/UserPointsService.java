package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserPointsService {
    Optional<com.unipaulistana.CityProblemsReportApp.service.UserPointsService> getPointsById(UUID id);
    List<UserPointsService> getAllPoints();
    User_Points savePoints(User_Points points);
    void deletePoints(UUID id);
}
