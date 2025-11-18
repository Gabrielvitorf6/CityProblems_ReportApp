package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Vote;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class VoteController {
    private final VoteService voteService;

    @GetMapping
    public ResponseEntity<Optional<Vote>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.voteService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<Vote>> deleteById (@PathVariable UUID id){
        this.voteService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<Vote>> updateById (@RequestBody Vote vote){
        return new ResponseEntity<>(this.voteService.update(vote), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Vote> createVote (@RequestBody Vote vote){
        return new ResponseEntity<>(this.voteService.create(vote), HttpStatus.CREATED);
    }
}
