package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Profile_tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class Profile_tagController {
    private final Profile_tagService profileTagService;

    @GetMapping
    public ResponseEntity<Optional<Profile_tag>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.profile_tagService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<Profile_tag>> deleteById (@PathVariable UUID id){
        this.profile_tagService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<Profile_tag>> updateById (@RequestBody Profile_tag profile_tag){
        return new ResponseEntity<>(this.profile_tagService.update(profile_tag), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Profile_tag> createProfile_tag (@RequestBody Profile_tag profile_tag){
        return new ResponseEntity<>(this.profile_tagService.create(profile_tag), HttpStatus.CREATED);
    }
}
