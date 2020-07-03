package com.kothabhada.model.room.service;

import com.kothabhada.model.room.entity.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    List<Room> findAll();
    Optional<Room> findById(Long id);
    Room save(Room room);
    void delete(Long id);
}
