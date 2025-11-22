package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.*;
import com.unipaulistana.CityProblemsReportApp.repositores.UserProfileRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository userProfileRepository;

    public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public Optional<User_profile> findById(UUID id) {
        return userProfileRepository.findUser_profileById(id);
    }

    @Override
    public List<User_profile> findByNicknameLike(String nickname) { return this.userProfileRepository.findUser_profilesByNicknameLike(nickname); }

    @Override
    public List<User_profile> findByBioLike(String bio) { return this.userProfileRepository.findUser_profilesByBioLike(bio); }

    @Override
    public List<User_profile> findByPostsGreaterThan(List<Post> postsIsGreaterThan) { return this.userProfileRepository.findUser_profilesByPostsGreaterThan(postsIsGreaterThan); }

    @Override
    public Optional<User_profile> findByUser(User user) { return this.userProfileRepository.findUser_profileByUser(user); }

    @Override
    public List<User_profile> findByProfileTags(Set<Profile_tag> profileTags) { return this.userProfileRepository.findUser_profilesByProfileTags(profileTags); }

    @Override
    public List<User_profile> findByCreatedDateBefore(Instant createdDateBefore) { return this.userProfileRepository.findUser_profilesByCreatedDateBefore(createdDateBefore); }

    @Override
    public List<User_profile> findByCreatedDateIsAfter(Instant createdDateAfter) { return this.userProfileRepository.findUser_profileByCreatedDateIsAfter(createdDateAfter); }

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