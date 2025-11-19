package com.unipaulistana.CityProblemsReportApp.controller;


import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import com.unipaulistana.CityProblemsReportApp.service.PointOfReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class PointOfReportRepositoryController {
    private final PointOfReportService pointOfReportService;

    public PointOfReportRepositoryController(PointOfReportService pointOfReportService) {
        this.pointOfReportService = pointOfReportService;
    }


    @GetMapping
    public ResponseEntity<Optional<PointOfReport>> findById(@PathVariable UUID id) {
            return ResponseEntity.ok(this.pointOfReportService.findById(id));
    }

    @DeleteMapping
    public ResponseEntity<Optional<PointOfReport>> deleteById (@PathVariable UUID id){
        this.pointOfReportService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<Optional<PointOfReport>> updateById (@RequestBody PointOfReport pointOfReport){
        return new ResponseEntity<>(this.pointOfReportService.update(pointOfReport), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<PointOfReport> createComment (@RequestBody PointOfReport pointOfReport){
        return new ResponseEntity<>(this.pointOfReportService.create(pointOfReport), HttpStatus.CREATED);
    }
}
