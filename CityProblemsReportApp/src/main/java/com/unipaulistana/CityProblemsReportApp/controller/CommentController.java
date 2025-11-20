package com.unipaulistana.CityProblemsReportApp.controller;


import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }
@GetMapping
public ResponseEntity<List<Comment>> findAll(Post post){
        return ResponseEntity.ok((this.commentService.getAllComments()));
}

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Comment>> findCommentById(@PathVariable UUID id){
        return ResponseEntity.ok(this.commentService.findById(id));
    }
    @GetMapping("/{string}")
    public ResponseEntity<List<Comment>> findCommentsLike(@PathVariable String string){
        return ResponseEntity.ok(this.commentService.getCommentsByCommentContaining(string));
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<Comment>> findCommentsByUserProfile(@PathVariable UUID id){
        return ResponseEntity.ok(this.commentService.getCommentsByUserProfile(id));
    }
    @GetMapping("{post}")
    public ResponseEntity<List<Comment>> findCommentsByPost(@PathVariable Post post){
        return ResponseEntity.ok(this.commentService.getAllByPost(post));
    }
    @GetMapping("/{instant}")
public ResponseEntity<List<Comment>> findCommentsByCreatedDateAfter(@PathVariable Instant instant){
        return ResponseEntity.ok(this.commentService.getCommentsByCreatedDateAfter(instant));
    }
    @GetMapping("/{instant}")
public ResponseEntity<List<Comment>> findCommentsByCreatedDateBefore(@PathVariable Instant instant){
        return ResponseEntity.ok(this.commentService.getCommentsByCreatedDateBefore(instant));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Comment>> deleteById (@PathVariable UUID id){
        this.commentService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Comment> update(@RequestBody Comment comment){
        return new ResponseEntity<>(this.commentService.createComment(comment), HttpStatus.CREATED);
    }
    @PostMapping
    public ResponseEntity<Comment> createComment (@RequestBody Comment comment){
        return new ResponseEntity<>(this.commentService.createComment(comment), HttpStatus.CREATED);
    }

}
