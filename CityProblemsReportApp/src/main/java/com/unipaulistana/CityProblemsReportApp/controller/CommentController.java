package com.unipaulistana.CityProblemsReportApp.controller;


import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class CommentController {
    private final CommentService commentService;



    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public ResponseEntity<Optional<Comment>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.commentService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<Comment>> deleteById (@PathVariable UUID id){
        this.commentService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<Comment>> updateById (@RequestBody Comment comment){
        return new ResponseEntity<>(this.commentService.update(comment), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Comment> createComment (@RequestBody Comment comment){
        return new ResponseEntity<>(this.commentService.create(comment), HttpStatus.CREATED);
    }
}
