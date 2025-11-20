package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import com.unipaulistana.CityProblemsReportApp.repositores.UserPointsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserPointsServiceImpl implements UserPointsService {

    private final UserPointsRepository userPointsRepository;

    public UserPointsServiceImpl(UserPointsRepository userPointsRepository) {
        this.userPointsRepository = userPointsRepository;
    }

    @Override
    public Optional<User_Points> getPointsById(UUID id) {
        return this.userPointsRepository.findUser_PointsById(id);
    }

    @Override
    public List<User_Points> getAllPoints() {
        return this.userPointsRepository.findAll();
    }
    @Override
    public void deleteById(UUID id) {
 this.userPointsRepository.deleteById(id);
    }
    @Override
    public User_Points create(User_Points userPoints) {
        if (userPoints.getId() == null) {
            userPoints.setId(UUID.randomUUID());
        }
            return this.userPointsRepository.save(userPoints);

    }

    @Override
    public List<User_Points> findAllByUserProfile(UUID id) {
        return this.userPointsRepository.findAllByUserProfile_Id(id);
    }
}
