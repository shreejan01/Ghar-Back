package com.kothabhada.model.apartment.service;

import com.kothabhada.model.apartment.entity.Apartment;

import java.util.List;
import java.util.Optional;

public interface ApartmentService {
    List<Apartment> findAll();
    Optional<Apartment> findById(Long id);
    Apartment save(Apartment apartment);
    void delete(Long id);
}
