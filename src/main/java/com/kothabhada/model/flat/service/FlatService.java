package com.kothabhada.model.flat.service;

import com.kothabhada.model.flat.entity.Flat;

import java.util.List;
import java.util.Optional;

public interface FlatService {
    List<Flat> findAll();
    Optional<Flat> findById(Long id);
    Flat save(Flat flat);
    void delete(Long id);
}
