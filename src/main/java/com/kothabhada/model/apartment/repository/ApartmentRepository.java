package com.kothabhada.model.apartment.repository;

import com.kothabhada.model.apartment.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
