package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.repositores.PostRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @Override
    public Optional<Post> getPostById(UUID id) {
        return postRepository.findPostById(id);
    }
    @Override
    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    }

    @Override
    public void deleteById(UUID id) {
        this.postRepository.deleteById(id);
    }
    @Override
    public Post create(Post post) {
        if(post.getId() == null){
            post.setId(UUID.randomUUID());
        }
        return this.postRepository.save(post);
    }
    @Override
    public List<Post> findByTitleLike(String title) {
        return this.postRepository.findPostsByTitleLike(title);
    }
    @Override
    public List<Post> findByUserProfileId(UUID id) {
        return this.postRepository.findAllByUserProfile_Id(id);
    }

    @Override
    public Optional<Post> findByPointOfReportId(UUID pointOfReportId) {
        return this.postRepository.findPostByPointOfReport_Id(pointOfReportId);
    }

    @Override
    public List<Post> findByCreationDateAfter(Instant createdDate) {
        return this.postRepository.findPostsByCreatedDateAfter(createdDate);
    }
    @Override
    public List<Post> findByCreationDateBefore(Instant createdDate) {
        return this.postRepository.findPostsByCreatedDateBefore(createdDate);
    }
}
