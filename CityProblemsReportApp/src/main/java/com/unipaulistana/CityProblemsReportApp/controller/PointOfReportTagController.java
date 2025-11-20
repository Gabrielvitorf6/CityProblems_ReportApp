package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReportTag;
import com.unipaulistana.CityProblemsReportApp.service.PointOfReportTagService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/pointofreporttags")
public class PointOfReportTagController {
    private final PointOfReportTagService pointOfReportTagService;

    public PointOfReportTagController(PointOfReportTagService pointOfReportTagService) {
        this.pointOfReportTagService = pointOfReportTagService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<PointOfReportTag>> findById (@RequestParam UUID id){
        return ResponseEntity.ok(this.pointOfReportTagService.getTagById(id));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReportTag>> findAll(){
        return ResponseEntity.ok(this.pointOfReportTagService.getAllTags());
    }
    @GetMapping("/{name}")
    public ResponseEntity<List<PointOfReportTag>> findByTitleLike(@RequestParam String title){
        return ResponseEntity.ok(this.pointOfReportTagService.findByTagTitleLike(title));
    }
    @GetMapping("/{description}")
    public ResponseEntity<List<PointOfReportTag>> findByDescriptionLike(@RequestParam String description){
        return ResponseEntity.ok(this.pointOfReportTagService.findByDescriptionLike(description));
    }
    @GetMapping("/{pointOfReportId}")
    public ResponseEntity<List<PointOfReportTag>> findByPointOfReportId(@PathVariable UUID pointOfReportId){
        return ResponseEntity.ok(this.pointOfReportTagService.findByPointOfReportId(pointOfReportId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<PointOfReportTag>> deleteById (@PathVariable UUID id){
        this.pointOfReportTagService.deleteById(id);
        return ResponseEntity.notFound().build();
    }
    @PutMapping
    public ResponseEntity<PointOfReportTag> updatePointOfReportTag (@RequestBody PointOfReportTag pointOfReportTag){
        return new ResponseEntity<>(this.pointOfReportTagService.create(pointOfReportTag), HttpStatus.CREATED);
    }
    @PostMapping
    public ResponseEntity<PointOfReportTag> createPointOfReportTag (@RequestBody PointOfReportTag pointOfReportTag){
        return new ResponseEntity<>(this.pointOfReportTagService.create(pointOfReportTag), HttpStatus.CREATED);
    }
}
