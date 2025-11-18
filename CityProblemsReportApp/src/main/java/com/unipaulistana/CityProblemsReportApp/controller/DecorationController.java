package com.unipaulistana.CityProblemsReportApp.controller;


import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;
import com.unipaulistana.CityProblemsReportApp.service.DecorationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class DecorationController {
    private final DecorationService decorationService;
    private DecorationController DecorationService;

    public DecorationController(DecorationService decorationService, DecorationService decorationService1) {
        this.decorationService = decorationService1;
    }

    @GetMapping
    public ResponseEntity<List<Decoration>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(this.decorationService.finById(id));
    }

    @DeleteMapping
    public ResponseEntity<List<Decoration>> deleteById (@PathVariable UUID id){
        this.DecorationService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<Decoration>> updateById (@RequestBody Decoration decoration){
        return new ResponseEntity<>(this.decorationService.update(decoration), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Decoration> createDecoration (@RequestBody Decoration decoration){
        return new ResponseEntity<>(this.decorationService.create(decoration), HttpStatus.CREATED);
    }
}
