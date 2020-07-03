package com.kothabhada.controller;

import com.kothabhada.model.flat.entity.Flat;
import com.kothabhada.model.flat.service.FlatService;
import com.kothabhada.model.room.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(FlatController.API)
public class FlatController {
    static final String API="flat";

    @Autowired
    private FlatService flatService;

    @GetMapping("/list")
    public ResponseEntity<List<Flat>> getAll() {
        return ResponseEntity.ok().body(flatService.findAll());
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Optional<Flat>> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(flatService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Flat> create(@RequestBody Flat flat) {
        return ResponseEntity.ok().body(this.flatService.save(flat));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        this.flatService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
