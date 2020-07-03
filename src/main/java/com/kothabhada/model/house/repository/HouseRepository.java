package com.kothabhada.model.house.repository;

import com.kothabhada.model.house.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
}
