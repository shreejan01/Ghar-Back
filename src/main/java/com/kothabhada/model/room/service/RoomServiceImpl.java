package com.kothabhada.model.room.service;


import com.kothabhada.model.room.entity.Room;
import com.kothabhada.model.room.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepo;

    @Override
    public List<Room> findAll() { return roomRepo.findAll(); }

    @Override
    public Optional<Room> findById(Long id) {
        return roomRepo.findById(id);
    }

    @Override
    public Room save(Room room) {
        return roomRepo.save(room);
    }

    @Override
    public void delete(Long id) {
        roomRepo.deleteById(id);
    }
}
