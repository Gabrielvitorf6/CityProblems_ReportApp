package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Profile_tag;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.service.ProfileTagService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/profiletags")
public class Profile_tagController {
    private final ProfileTagService profileTagService;

    public Profile_tagController(ProfileTagService profileTagService) {
        this.profileTagService = profileTagService;
    }

    @GetMapping
    public ResponseEntity<List<Profile_tag>> getAllTags() {
        return ResponseEntity.ok(profileTagService.getAllTags());
    }
        @GetMapping("/{id}")
    public ResponseEntity<Optional<Profile_tag>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.profileTagService.getTagById(id));
    }
    @GetMapping("/{title}")
    public ResponseEntity<List<Profile_tag>> findByTitleLike(@PathVariable String title){
        return ResponseEntity.ok(this.profileTagService.findByTitleLike(title));
    }
    @GetMapping("/{description}")
    public ResponseEntity<List<Profile_tag>> findByDescriptionLike(@PathVariable String description){
        return ResponseEntity.ok(this.profileTagService.findByDescriptionLike(description));
    }
    @GetMapping("/userprofile/{id}")
    public ResponseEntity<List<Profile_tag>> findByUserProfileId(@PathVariable UUID id){
        return ResponseEntity.ok(this.profileTagService.findByUserProfileId(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Optional<Profile_tag>> deleteById (@PathVariable UUID id){
        this.profileTagService.deleteById(id);
        return ResponseEntity.notFound().build();
    }
    @PutMapping
    public ResponseEntity<Profile_tag> updateProfileTag(@RequestBody Profile_tag profile_tag){
        return new ResponseEntity<>(this.profileTagService.create(profile_tag), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Profile_tag> createProfile_tag (@RequestBody Profile_tag profile_tag){
        return new ResponseEntity<>(this.profileTagService.create(profile_tag), HttpStatus.CREATED);
    }
}
