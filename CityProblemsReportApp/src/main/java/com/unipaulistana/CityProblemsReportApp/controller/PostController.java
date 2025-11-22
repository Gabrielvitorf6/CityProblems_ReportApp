package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Post>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.postService.getPostById(id));
    }
    @GetMapping
    public ResponseEntity<List<Post>> findAll(){
        return ResponseEntity.ok(this.postService.getAllPosts());
    }
    @GetMapping("/{title}")
    public ResponseEntity<List<Post>> findByTitleLike(@PathVariable String title){
        return ResponseEntity.ok(this.postService.findByTitleLike(title));
    }
    @GetMapping("/userprofile/{userProfileId}")
    public ResponseEntity<List<Post>> findByUserProfile(@PathVariable UUID userProfileId){
        return ResponseEntity.ok(this.postService.findByUserProfileId(userProfileId));
    }
    @GetMapping("/pointofreport/{id}")
    public ResponseEntity<Optional<Post>> findByPointOfReportId(@PathVariable UUID pointOfReportId){
        return ResponseEntity.ok(this.postService.findByPointOfReportId(pointOfReportId));
    }
    @GetMapping("/{createdDate}")
    public ResponseEntity<List<Post>> findByCreatedDateAfter(@PathVariable Instant createdDate){
        return ResponseEntity.ok(this.postService.findByCreationDateAfter(createdDate));
    }
    @GetMapping("/{createdDate}")
    public ResponseEntity<List<Post>> findByCreatedDateBefore(@PathVariable Instant createdDate){
        return ResponseEntity.ok(this.postService.findByCreationDateBefore(createdDate));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Optional<Post>> deleteById (@PathVariable UUID id){
        this.postService.deleteById(id);
        return ResponseEntity.notFound().build();
    }
    @PutMapping
    public ResponseEntity<Post> updatePost (@RequestBody Post post){
        return new ResponseEntity<>(this.postService.create(post), HttpStatus.CREATED);
    }
    @PostMapping
    public ResponseEntity<Post> createPost (@RequestBody Post post){
        return new ResponseEntity<>(this.postService.create(post), HttpStatus.CREATED);
    }
}
