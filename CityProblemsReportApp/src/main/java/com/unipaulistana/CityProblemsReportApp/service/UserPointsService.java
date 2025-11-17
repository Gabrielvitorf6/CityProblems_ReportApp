package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.repositores.UserPointsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPointsService {

    private final UserPointsRepository pointsRepo;

    public UserPointsService(UserPointsRepository pointsRepo) {
        this.pointsRepo = pointsRepo;
    }

    public void addPoints(User_profile userProfile, int points) {
        List<User_Points> list = pointsRepo.findAllByUserProfile(userProfile);
        User_Points up;
        if (list.isEmpty()) {
            up = new User_Points();
            up.setUserProfile(userProfile);
            up.setTotal(points);
        } else {
            up = list.get(0);
            up.setTotal(up.getTotal() + points);
        }
        pointsRepo.save(up);
    }

    public int getTotalPoints(User_profile userProfile) {
        return pointsRepo.findAllByUserProfile(userProfile)
                .stream()
                .mapToInt(User_Points::getTotal)
                .sum();
    }
}
