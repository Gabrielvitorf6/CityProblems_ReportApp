package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface UserProfileRepository extends JpaRepository<User_profile, UUID> {

    Optional<User_profile> findUser_profileById(UUID id);

    List<User_profile> findUser_profilesByNicknameLike(String nickname);

    List<User_profile> findUser_profilesByBioLike(String bio);

    List<User_profile> findUser_profilesByPostsGreaterThan(List<Post> postsIsGreaterThan);

    List<User_profile> findUser_profilesByUserPointsGreaterThan(List<User_Points> userPointsIsGreaterThan);

    Optional<User_profile> findUser_profileByUser(User user);

    List<User_profile> findUser_profilesByCommentsGreaterThan(List<Comment> commentsIsGreaterThan);

    List<User_profile> findUser_profilesByProfileTags(Set<Profile_tag> profileTags);

    List<User_profile> findUser_profilesByCreatedDateBefore(Instant createdDateBefore);

    List<User_profile> findUser_profileByCreatedDateIsAfter(Instant createdDateAfter);

    Optional<User_profile> findById(UUID id);

    List<User_profile> findAll();

    User_profile save(User_profile profile);

    void deleteById(UUID id);
}
