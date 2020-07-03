package com.kothabhada.controller;

import com.kothabhada.model.house.entity.House;
import com.kothabhada.model.house.service.HouseService;
import com.kothabhada.model.room.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(HouseController.API)
public class HouseController {
    static final String API = "house";

    @Autowired
    private HouseService houseService;

    @GetMapping("/list")
    public ResponseEntity<List<House>> getAll() {
        return ResponseEntity.ok().body(houseService.findAll());
    }

    @GetMapping("list/{id}")
    public ResponseEntity<Optional<House>> getById(@PathVariable Long id){
        return ResponseEntity.ok().body(houseService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<House> create(@RequestBody House house) {
        return ResponseEntity.ok().body(houseService.save(house));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        this.houseService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
