package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {

    Optional<Post> findPostById(UUID id);

    List<Post> findPostsByTitleLike(String title);

    List<Post> findAllByUserProfile(User_profile userProfile);

    Optional<Post> findPostByPointOfReport(PointOfReport pointOfReport);

    List<Post> findPostsByCreatedDateAfter(Instant createdDate);

    List<Post> findPostsByCreatedDateBefore(Instant createdDateBefore);

    Optional<Post> findById(UUID id);

    List<Post> findAll();

    Post save(Post post);

    void deleteById(UUID id);
}
