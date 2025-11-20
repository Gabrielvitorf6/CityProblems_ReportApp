package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping
    public ResponseEntity<Optional<Post>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.postService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<Post>> deleteById (@PathVariable UUID id){
        this.postService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<Post>> updateById (@RequestBody Post post){
        return new ResponseEntity<>(this.postService.update(post), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Post> createPost (@RequestBody Post post){
        return new ResponseEntity<>(this.postService.create(post), HttpStatus.CREATED);
    }
}
