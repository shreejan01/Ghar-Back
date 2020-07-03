package com.kothabhada.model.house.service;

import com.kothabhada.model.house.entity.House;

import java.util.List;
import java.util.Optional;

public interface HouseService {
    List<House> findAll();
    Optional<House> findById(Long id);
    House save(House house);
    void delete(Long id);
}
