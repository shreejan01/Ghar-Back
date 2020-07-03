package com.kothabhada.model.room.repository;

import com.kothabhada.model.room.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
