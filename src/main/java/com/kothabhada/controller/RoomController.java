package com.kothabhada.controller;

import com.kothabhada.model.room.entity.Room;
import com.kothabhada.model.room.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(RoomController.API)
public class RoomController {
    static final String API = "room";

    @Autowired
    private RoomService roomService;

    @GetMapping("/list")
    public ResponseEntity<List<Room>> getAll() {
        return ResponseEntity.ok().body(roomService.findAll());
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Optional<Room>> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(roomService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Room> create(@RequestBody Room room) {
        return ResponseEntity.ok().body(this.roomService.save(room));
    }

    @DeleteMapping("/{id}")
     public ResponseEntity<?> delete(@PathVariable Long id) {
        this.roomService.delete(id);
        return new ResponseEntity<> (HttpStatus.OK);
    }
}
