package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostService {
    Optional<Post> getPostById(UUID id);
    List<Post> getAllPosts();
    Post savePost(Post post);
    void deletePost(UUID id);

    Optional<Post> findById(UUID id);

    void deleteById(UUID id);

    Optional<Post> update(Post post);

    Post create(Post post);
}
