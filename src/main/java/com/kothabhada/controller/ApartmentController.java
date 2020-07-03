package com.kothabhada.controller;

import com.kothabhada.model.apartment.entity.Apartment;
import com.kothabhada.model.apartment.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(ApartmentController.API)
public class ApartmentController {
    static final String API = "apartment";

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping("/list")
    public ResponseEntity<List<Apartment>> getAll() {
        return ResponseEntity.ok().body(apartmentService.findAll());
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Optional<Apartment>> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(apartmentService.findById(id));
    }

    @PostMapping("/create")
    public  ResponseEntity<Apartment> create(@RequestBody Apartment apartment) {
        return ResponseEntity.ok().body(this.apartmentService.save(apartment));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        this.apartmentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
