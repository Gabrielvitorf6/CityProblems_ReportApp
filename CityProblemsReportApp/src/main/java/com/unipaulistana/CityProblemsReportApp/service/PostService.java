package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import org.springframework.http.ResponseEntity;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostService {
    Optional<Post> getPostById(UUID id);

    List<Post> getAllPosts();

    void deleteById(UUID id);
    
    Post create(Post post);

    List<Post> findByTitleLike(String title);

    List<Post> findByUserProfileId(UUID id);

    Optional<Post> findByPointOfReportId(UUID pointOfReportId);

    List<Post> findByCreationDateAfter(Instant createdDate);

    List<Post> findByCreationDateBefore(Instant createdDate);
}
