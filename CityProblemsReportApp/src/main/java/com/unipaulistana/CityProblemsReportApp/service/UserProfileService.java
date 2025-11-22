package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface UserProfileService {
    Optional<User_profile> findById(UUID id);
    List<User_profile> findByNicknameLike(String nickname);
    List<User_profile> findByBioLike(String bio);
    List<User_profile> findByPostsGreaterThan(List<Post> postsIsGreaterThan);
    Optional<User_profile> findByUser(User user);
    List<User_profile> findByCommentsGreaterThan(List<Comment> commentsIsGreaterThan);
    List<User_profile> findByProfileTags(Set<Profile_tag> profileTags);
    List<User_profile> findByCreatedDateBefore(Instant createdDateBefore);
    List<User_profile> findByCreatedDateIsAfter(Instant createdDateAfter);
    List<User_profile> getAllProfiles();
    User_profile saveProfile(User_profile profile);
    void deleteById(UUID id);
    Optional<User_profile> update(User_profile userProfile);
}
