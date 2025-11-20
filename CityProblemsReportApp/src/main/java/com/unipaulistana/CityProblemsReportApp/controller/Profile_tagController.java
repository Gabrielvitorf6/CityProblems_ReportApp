package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Profile_tag;
import com.unipaulistana.CityProblemsReportApp.service.ProfileTagService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Optional<Profile_tag>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.profileTagService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<Profile_tag>> deleteById (@PathVariable UUID id){
        this.profileTagService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<Profile_tag>> updateById (@RequestBody Profile_tag profile_tag){
        return new ResponseEntity<>(this.profileTagService.update(profile_tag), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Profile_tag> createProfile_tag (@RequestBody Profile_tag profile_tag){
        return new ResponseEntity<>(this.profileTagService.create(profile_tag), HttpStatus.CREATED);
    }
}
