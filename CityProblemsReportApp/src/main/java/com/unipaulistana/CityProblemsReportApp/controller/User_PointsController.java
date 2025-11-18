package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_Points;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class User_PointsController {
    private final User_PointsControllerService User_ProfileControllerService;

    @GetMapping
    public ResponseEntity<Optional<User_Points>> findById (@PathVariable UUID id){
        return ResponseEntity.ok(this.user_PointsControllerService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<User_Points>> deleteById (@PathVariable UUID id){
        this.user_PointsControllerService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<User_Points>> updateById (@RequestBody User_Points user_Points){
        return new ResponseEntity<>(this.user_PointsControllerService.update(user_Points), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<User_Points> createUser_Points (@RequestBody User_Points user_Points){
        return new ResponseEntity<>(this.user_PointsControllerService.create(user_Points), HttpStatus.CREATED);
    }
}
