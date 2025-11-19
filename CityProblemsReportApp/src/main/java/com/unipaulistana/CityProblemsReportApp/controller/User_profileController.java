package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.service.UserProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class User_profileController {
    private final UserProfileService userProfileService;

    public User_profileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping
    public ResponseEntity<Optional<User_profile>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.userProfileService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<User_profile>> deleteById (@PathVariable UUID id){
        this.userProfileService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<User_profile>> updateById (@RequestBody User_profile user_profile){
        return new ResponseEntity<>(this.userProfileService.update(user_profile), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<User_profile> createUser_profile (@RequestBody User_profile user_profile){
        return new ResponseEntity<>(this.userProfileService.create(user_profile), HttpStatus.CREATED);
    }
}
