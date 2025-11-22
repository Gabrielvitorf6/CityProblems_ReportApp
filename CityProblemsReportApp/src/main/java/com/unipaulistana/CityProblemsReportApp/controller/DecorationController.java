package com.unipaulistana.CityProblemsReportApp.controller;


import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.service.DecorationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/decorations")
public class DecorationController {
    private final DecorationService decorationService;

    public DecorationController(DecorationService decorationService, DecorationService decorationService1) {
        this.decorationService = decorationService1;
    }
@GetMapping
public ResponseEntity<List<Decoration>> findAll(){
        return ResponseEntity.ok(this.decorationService.getAllDecorations());
}


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Decoration>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(this.decorationService.getDecorationById(id));
    }
    @GetMapping("/{title}")
    public ResponseEntity<List<Decoration>> findByTitleLike(@PathVariable String title) {
        return ResponseEntity.ok(this.decorationService.getDecorationsByTitleLike(title));
    }
    @GetMapping("/{description}")
    public ResponseEntity<List<Decoration>> findByDescriptionLike(@PathVariable String description) {
        return ResponseEntity.ok(this.decorationService.getDecorationsByDescrptionsLike(description));
    }
    @GetMapping("/{valuePointsIsGreaterThan}")
    public ResponseEntity<List<Decoration>> findByValuePointsGreaterThan(@PathVariable int valuePointsIsGreaterThan) {
        return ResponseEntity.ok(this.decorationService.getDecorationsWithPointsGreaterThan(valuePointsIsGreaterThan));
    }
    @GetMapping("/post/{id}")
    public ResponseEntity<List<Decoration>> findDecorationsByPostId(@PathVariable UUID id){
        return ResponseEntity.ok(this.decorationService.getDecorationsByPostId(id));
    }
    @GetMapping("/userprofile/{userprofileID}")
    public ResponseEntity<Optional<Decoration>> findDecorationsByUserProfilel(@PathVariable UUID userprofileID){
        return ResponseEntity.ok(this.decorationService.getDecorationsByUSerProfile_Id(userprofileID));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<List<Decoration>> deleteById (@PathVariable UUID id){
        this.decorationService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Decoration> updateById (@RequestBody Decoration decoration){
        return new ResponseEntity<>(this.decorationService.create(decoration), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Decoration> createDecoration (@RequestBody Decoration decoration){
        return new ResponseEntity<>(this.decorationService.create(decoration), HttpStatus.CREATED);
    }
}
