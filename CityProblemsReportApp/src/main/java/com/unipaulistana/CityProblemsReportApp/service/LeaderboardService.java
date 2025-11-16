package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import com.unipaulistana.CityProblemsReportApp.repositores.UserPointsRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeaderboardService {

    private final UserPointsRepository pointsRepo;

    public LeaderboardService(UserPointsRepository pointsRepo) {
        this.pointsRepo = pointsRepo;
    }

    public List<User_profile> topUsers(int limit) {
        return pointsRepo.findAll().stream()
                .sorted(Comparator.comparingInt(User_Points::getTotal).reversed())
                .map(User_Points::getUserProfile)
                .limit(limit)
                .collect(Collectors.toList());
    }
}
