package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReportTag;
import com.unipaulistana.CityProblemsReportApp.service.PointOfReportTagService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/pointofreporttags")
public class PointOfReportTagController {
    private final PointOfReportTagService pointOfReportTagService;

    public PointOfReportTagController(PointOfReportTagService pointOfReportTagService) {
        this.pointOfReportTagService = pointOfReportTagService;
    }

    @GetMapping
    public ResponseEntity<Optional<PointOfReportTagService>> findById (@RequestParam UUID id){
        return ResponseEntity.ok(this.pointOfReportTagService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<PointOfReportTag>> deleteById (@PathVariable UUID id){
        this.pointOfReportTagService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<PointOfReportTag>> updateById (@RequestBody Comment comment){
        return new ResponseEntity<>(this.pointOfReportTagService.update(comment), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<PointOfReportTag> createPointOfReportTag (@RequestBody Comment comment){
        return new ResponseEntity<>(this.pointOfReportTagService.create(comment), HttpStatus.CREATED);
    }
}
