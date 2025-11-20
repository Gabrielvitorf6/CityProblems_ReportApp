package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserProfileService {
    Optional<User_profile> getProfileById(UUID id);
    List<User_profile> getAllProfiles();
    User_profile saveProfile(User_profile profile);
    void deleteById(UUID id);
    Optional<User_profile> update(User_profile userProfile);
}
