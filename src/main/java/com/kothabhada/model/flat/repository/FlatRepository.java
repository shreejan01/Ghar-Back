package com.kothabhada.model.flat.repository;

import com.kothabhada.model.flat.entity.Flat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlatRepository extends JpaRepository<Flat,Long> {
}
