package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Vote;
import com.unipaulistana.CityProblemsReportApp.repositores.CommentRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Optional<Comment> findById(UUID id) {
        return commentRepository.findCommentById(id);
    }

    @Override
    public List<Comment> getCommentsByCommentContaining(String comment) {
        return commentRepository.findCommentsByCommentContaining(comment);
    }

    @Override
    public List<Comment> getCommentsByUserProfile(UUID id) {
        return commentRepository.findCommentsByUserProfile_Id(id);
    }

    @Override
    public List<Comment> getAllByPost(Post post) {
        return commentRepository.findAllByPost(post);
    }

    @Override
    public List<Comment> getCommentsByVotesGreaterThan(List<Vote> votesIsGreaterThan) {
        return commentRepository.findCommentsByVotesGreaterThan(votesIsGreaterThan);
    }

    @Override
    public List<Comment> getCommentsByCreatedDateAfter(Instant createdDateAfter) {
        return commentRepository.findCommentsByCreatedDateAfter(createdDateAfter);
    }

    @Override
    public List<Comment> getCommentsByCreatedDateBefore(Instant createdDateBefore) {
        return commentRepository.findCommentsByCreatedDateBefore(createdDateBefore);
    }

    @Override
    public List<Comment> getAllByUserProfile(User_profile userProfile) {
        return commentRepository.findAllByUserProfile(userProfile);
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteById(UUID id) {
        this.commentRepository.deleteById(id);
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
}
