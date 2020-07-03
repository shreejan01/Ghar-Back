package com.kothabhada.model.apartment.service;

import com.kothabhada.model.apartment.entity.Apartment;
import com.kothabhada.model.apartment.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ApartmentServiceImpl implements ApartmentService {
    @Autowired
    private ApartmentRepository apartmentRepo;

    @Override
    public List<Apartment> findAll() {
        return apartmentRepo.findAll();
    }

    @Override
    public Optional<Apartment> findById(Long id) {
        return apartmentRepo.findById(id);
    }

    @Override
    public Apartment save(Apartment apartment) {
        return apartmentRepo.save(apartment);
    }

    @Override
    public void delete(Long id) {
         apartmentRepo.deleteById(id);
    }
}
