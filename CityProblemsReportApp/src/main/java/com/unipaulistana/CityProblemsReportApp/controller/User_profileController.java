package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class User_profileController {
    private final User_profileService userProfileService;

    @GetMapping
    public ResponseEntity<Optional<User_profile>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.user_profileService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<User_profile>> deleteById (@PathVariable UUID id){
        this.user_profileService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<User_profile>> updateById (@RequestBody User_profile user_profile){
        return new ResponseEntity<>(this.user_profileService.update(user_profile), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<User_profile> createUser_profile (@RequestBody User_profile user_profile){
        return new ResponseEntity<>(this.user_profileService.create(user_profile), HttpStatus.CREATED);
    }
}
