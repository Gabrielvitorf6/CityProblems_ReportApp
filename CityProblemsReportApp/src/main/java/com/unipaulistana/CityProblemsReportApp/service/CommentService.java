
package com.unipaulistana.CityProblemsReportApp.service;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Vote;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CommentService {

    Optional<Comment> findById(UUID id);

    List<Comment> getCommentsByCommentContaining(String comment);

    List<Comment> getCommentsByUserProfile(UUID id);

    List<Comment> getAllByPost(Post post);

    List<Comment> getCommentsByCreatedDateAfter(Instant createdDateAfter);

    List<Comment> getCommentsByCreatedDateBefore(Instant createdDateBefore);

    List<Comment> getAllByUserProfile(User_profile userProfile);

    Comment createComment(Comment comment);

    void deleteById(UUID id);

    List<Comment> getAllComments();


}
