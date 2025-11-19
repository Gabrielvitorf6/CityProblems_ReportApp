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
        return userPointsRepository.findUser_PointsById(id);
    }

    @Override
    public List<UserPointsService> getAllPoints() {
        return userPointsRepository.findAll();
    }

    @Override
    public User_Points savePoints(User_Points points) {
        return userPointsRepository.save(points);
    }

    @Override
    public void deletePoints(UUID id) {
        userPointsRepository.deleteById(id);
    }

    @Override
    public Optional<User_Points> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public Optional<User_Points> update(User_Points userPoints) {
        return Optional.empty();
    }

    @Override
    public User_Points create(User_Points userPoints) {
        return null;
    }
}
