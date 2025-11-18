package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;

import java.util.Optional;
import java.util.UUID;

public interface CommentService {

    Optional<Comment> findById(UUID id);

    void deleteById(UUID id);

    Optional<Comment> update(Comment comment);

    Comment create(Comment comment);
}
