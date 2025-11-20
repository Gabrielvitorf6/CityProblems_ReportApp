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
    public void deleteById(UUID id) { this.userProfileRepository.deleteById(id); }

    @Override
    public Optional<User_profile> update(User_profile user_Profile) { return Optional.ofNullable(this.userProfileRepository.save(user_Profile)); }

}