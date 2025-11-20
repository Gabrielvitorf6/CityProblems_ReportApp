package com.unipaulistana.CityProblemsReportApp.controller;


import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import com.unipaulistana.CityProblemsReportApp.service.PointOfReportService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/pointsofreport")
public class PointOfReportController {
    private final PointOfReportService pointOfReportService;

    public PointOfReportController(PointOfReportService pointOfReportService) {
        this.pointOfReportService = pointOfReportService;
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findAll(){
        return ResponseEntity.ok(this.pointOfReportService.findAll());
    }
@GetMapping
public ResponseEntity<List<PointOfReport>> findByTitleLike(@PathVariable String title){
        return ResponseEntity.ok(this.pointOfReportService.findByTitleLike(title));
}

    @GetMapping
    public ResponseEntity<Optional<PointOfReport>> findById(@PathVariable UUID id) {
            return ResponseEntity.ok(this.pointOfReportService.getPointOfReportById(id));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findByDescriptionLike(@PathVariable String description){
        return ResponseEntity.ok(this.pointOfReportService.getPointOfReportByDescriptionLike(description));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findPointOfReportByCEP(@PathVariable String cep){
        return ResponseEntity.ok(this.pointOfReportService.findByCep(cep));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findPointOfReportByCity(@PathVariable String city){
        return ResponseEntity.ok(this.pointOfReportService.findPointOfReportByCity(city));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findPointOfReportByCountry(@PathVariable String country){
        return ResponseEntity.ok(this.pointOfReportService.findpointOfReportByCountry(country));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findPointOfReportByState(@PathVariable String state){
        return ResponseEntity.ok(this.pointOfReportService.findPointOfReportByState(state));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findByAdress(@PathVariable String adress){
        return ResponseEntity.ok(this.pointOfReportService.findByAdress(adress));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findByStateAndCityt(@PathVariable String state, @PathVariable String city){
        return ResponseEntity.ok(this.pointOfReportService.findPointOfReportByStateAndCity(state , city));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findByLatitudeAndLongitude(@PathVariable double latitude, @PathVariable double longitude){
        return ResponseEntity.ok(this.pointOfReportService.findByLatitudeAndLongitude(latitude, longitude
        ));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findPointOfReportByPostId (@PathVariable UUID postid){
        return ResponseEntity.ok(this.pointOfReportService.findByPostId(postid));
    }
    @GetMapping
    public ResponseEntity<List<PointOfReport>> findPointsOfReportByPointOfReportTag_ID (@PathVariable UUID pointOfReportTagID){
        return ResponseEntity.ok(this.pointOfReportService.findPointsOfReportByPointOfReportId(pointOfReportTagID));
    }

    @DeleteMapping
    public ResponseEntity<Optional<PointOfReport>> deleteById (@PathVariable UUID id){
        this.pointOfReportService.deletePointById(id);
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<PointOfReport> updatePointOfReportById (@RequestBody PointOfReport pointOfReport){
        return new ResponseEntity<>(this.pointOfReportService.create(pointOfReport), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<PointOfReport> createComment (@RequestBody PointOfReport pointOfReport){
        return new ResponseEntity<>(this.pointOfReportService.create(pointOfReport), HttpStatus.CREATED);
    }

}
