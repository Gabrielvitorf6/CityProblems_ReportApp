package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {

    Optional<Comment> findCommentById(UUID id);

    List<Comment> findCommentsByCommentContaining(String comment);

    List<Comment> findCommentsByUserProfile_Id(UUID userProfileId);

    List<Comment> findAllByPost(Post post);

    List<Comment> findCommentsByCreatedDateAfter(Instant createdDateAfter);

    List<Comment> findCommentsByCreatedDateBefore(Instant createdDateBefore);

    List<Comment> findAllByUserProfile(User_profile userProfile);

    Comment save(Comment comment);

    void deleteById(UUID id);

    List<Comment> findAll();
}
