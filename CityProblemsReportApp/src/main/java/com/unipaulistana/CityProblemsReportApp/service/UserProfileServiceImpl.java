package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.repositores.UserProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository userProfileRepository;

    public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public Optional<User_profile> getProfileById(UUID id) {
        return userProfileRepository.findById(id);
    }

    @Override
    public List<User_profile> getAllProfiles() {
        return userProfileRepository.findAll();
    }

    @Override
    public User_profile saveProfile(User_profile profile) {
        return userProfileRepository.save(profile);
    }

    @Override
    public void deleteProfile(UUID id) {
        userProfileRepository.deleteById(id);
    }

    @Override
    public Optional<User_profile> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public Optional<User_profile> update(User_profile userProfile) {
        return Optional.empty();
    }

    @Override
    public User_profile create(User_profile userProfile) {
        return null;
    }
}
