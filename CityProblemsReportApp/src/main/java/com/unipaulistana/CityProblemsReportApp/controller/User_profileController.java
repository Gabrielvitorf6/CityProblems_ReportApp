package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.*;
import com.unipaulistana.CityProblemsReportApp.service.UserProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/api/usersprofiles")
public class User_profileController {
    private final UserProfileService userProfileService;

    public User_profileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }
@GetMapping
public ResponseEntity<List<User_profile>> findAll() {
        return ResponseEntity.ok(this.userProfileService.getAllProfiles());
}

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User_profile>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.userProfileService.findById(id));
    }

    @GetMapping("/{nickname}")
    public ResponseEntity<List<User_profile>> findByNicknameLike (@PathVariable String nickname) {
        return ResponseEntity.ok(this.userProfileService.findByNicknameLike(nickname));
    }
    @GetMapping("/{bio}")
    public ResponseEntity<List<User_profile>> findByBioLike (@PathVariable String bio) {
        return ResponseEntity.ok(this.userProfileService.findByBioLike(bio));
    }
    @GetMapping("/{postsIsGreaterThan}")
    public ResponseEntity<List<User_profile>> findByPostsGreaterThan (@PathVariable List<Post> postsIsGreaterThan) {
        return ResponseEntity.ok(this.userProfileService.findByPostsGreaterThan(postsIsGreaterThan));
    }
    @GetMapping("/{user}")
    public ResponseEntity<Optional<User_profile>> findByUser (@PathVariable User user) {
        return ResponseEntity.ok(this.userProfileService.findByUser(user));
    }

    @GetMapping("/{profileTags}")
    public ResponseEntity<List<User_profile>> findByProfileTags (@PathVariable Set<Profile_tag> profileTags) {
        return ResponseEntity.ok(this.userProfileService.findByProfileTags(profileTags));
    }

    @GetMapping("/createdbefore/{createdDateBefore}")
    public ResponseEntity<List<User_profile>> findByCreatedDateBefore (@PathVariable Instant createdDateBefore) {
        return ResponseEntity.ok(this.userProfileService.findByCreatedDateBefore(createdDateBefore));
    }

    @GetMapping("/createdafter/{createdDateAfter}")
    public ResponseEntity<List<User_profile>> findByCreatedDateIsAfter (@PathVariable Instant createdDateAfter) {
        return ResponseEntity.ok(this.userProfileService.findByCreatedDateIsAfter(createdDateAfter));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Optional<User_profile>> deleteById (@PathVariable UUID id){
        this.userProfileService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<User_profile> update (@RequestBody User_profile user_profile){
        return new ResponseEntity<>(this.userProfileService.saveProfile(user_profile), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<User_profile> createUser_profile (@RequestBody User_profile user_profile){
        return new ResponseEntity<>(this.userProfileService.saveProfile(user_profile), HttpStatus.CREATED);
    }
}
