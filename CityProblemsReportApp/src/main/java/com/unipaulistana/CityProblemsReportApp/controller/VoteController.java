package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Vote;
import com.unipaulistana.CityProblemsReportApp.service.VoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/votes")
public class VoteController {
    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Vote>> getVoteById (@PathVariable UUID id){
        return ResponseEntity.ok(this.voteService.getVoteById(id));
    }
    @GetMapping
    public ResponseEntity<List<Vote>> getAllVotes() {
        return ResponseEntity.ok(this.voteService.getAllVotes());
    }
    @GetMapping("/post/{id}")
    public ResponseEntity<List<Vote>> getAllVotesByPostId(@PathVariable UUID id) {
        return ResponseEntity.ok(this.voteService.findAllByPost_Id(id));
    }
    @GetMapping("/comment/{id}")
    public ResponseEntity<List<Vote>> getAllVotesByComment(@PathVariable UUID id) {
        return ResponseEntity.ok(this.voteService.findAllByComment_Id(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Vote>> deleteVote (@PathVariable UUID id){
        this.voteService.deleteVote(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Vote> updateVote(@RequestBody Vote vote){
        return new ResponseEntity<>(this.voteService.update(vote), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Vote> saveVote (@RequestBody Vote vote){
        return new ResponseEntity<>(this.voteService.saveVote(vote), HttpStatus.CREATED);
    }
}
