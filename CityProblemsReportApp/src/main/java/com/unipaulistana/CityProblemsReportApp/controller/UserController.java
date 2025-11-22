package com.unipaulistana.CityProblemsReportApp.controller;

import com.unipaulistana.CityProblemsReportApp.domainmodel.User;
import com.unipaulistana.CityProblemsReportApp.service.UserService;
//import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
//@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) { this.userService = userService; }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(this.userService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(this.userService.findById(id));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable UUID id){
        this.userService.deleteUserById(id);
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/{username}")
    public ResponseEntity<List<User>> findByUsernameLike(@PathVariable String username) {
        return ResponseEntity.ok(this.userService.findByUsernameLike(username));
    }
    @GetMapping("/{email}")
    public ResponseEntity<Optional<User>> findByEmail(@PathVariable String email) {
        return ResponseEntity.ok(this.userService.findByEmail(email));
    }
    @GetMapping("/{CPF}")
    public ResponseEntity<Optional<User>> findByCPF(@PathVariable String CPF) {
        return ResponseEntity.ok(this.userService.findByCPF(CPF));
    }
    @GetMapping("/birthdateafter/{birthdateAfter}")
    public ResponseEntity<List<User>> findUsersByBirthdateAfter(@PathVariable Date birthdateAfter) {
        return ResponseEntity.ok(this.userService.findByBirthdateAfter(birthdateAfter));
    }
    @GetMapping("/birthdatebefore/{birthdateBefore}")
    public ResponseEntity<List<User>> findUsersByBirthdateBefore(@PathVariable Date birthdateBefore) {
        return ResponseEntity.ok(this.userService.findByBirthedateBefore(birthdateBefore));
    }
    @GetMapping("/{phone}")
    public ResponseEntity<Optional<User>> findByPhone (@PathVariable String phone) {
        return ResponseEntity.ok(this.userService.findByPhone(phone));
    }
    @GetMapping("/{city}")
    public ResponseEntity<List<User>> findByCityLike(@PathVariable String city) {
        return ResponseEntity.ok(this.userService.findByCity(city));
    }
    @GetMapping("/{adress}")
    public ResponseEntity<List<User>> findByAdressLike(@PathVariable String adress) {
        return ResponseEntity.ok(this.userService.findByAdressLike(adress));
    }
    @GetMapping("/{state}")
    public ResponseEntity<List<User>> findByState(@PathVariable String state) {
        return ResponseEntity.ok(this.userService.findByState(state));
    }
    @GetMapping("/{country}")
    public ResponseEntity<List<User>> findByCountry(@PathVariable String country) {
        return ResponseEntity.ok(this.userService.findByCountry(country));
    }
    @GetMapping("/{cep}")
    public ResponseEntity<List<User>> findByCep(@PathVariable String cep) {
        return ResponseEntity.ok(this.userService.findByCep(cep));
    }
    @GetMapping("/userprofile/{userProfileId}")
    public ResponseEntity<Optional<User>> findByUserProfileId(@PathVariable UUID userProfileId) {
        return ResponseEntity.ok(this.userService.findByUserProfileId(userProfileId));
    }
    @GetMapping("/createddatebefore/{createdDate}")
    public ResponseEntity<List<User>> findByCreatedDateBefore(@PathVariable Instant createdDate) {
        return ResponseEntity.ok(this.userService.findByCreatedDateBefore(createdDate));
    }
    @GetMapping("/createddateafter/{createdDate}")
    public ResponseEntity<List<User>> findByCreatedDateAfter(@PathVariable Instant createdDate) {
        return ResponseEntity.ok(this.userService.findByCreatedDateAfter(createdDate));
    }
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(this.userService.create(user), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return new ResponseEntity<>(this.userService.create(user), HttpStatus.CREATED);
    }
}

