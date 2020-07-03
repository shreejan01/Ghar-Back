package com.kothabhada.model.house.service;

import com.kothabhada.model.house.entity.House;
import com.kothabhada.model.house.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class HouseServiceImpl implements  HouseService{
    @Autowired
    private HouseRepository houseRepo;

    @Override
    public List<House> findAll() {
        return houseRepo.findAll();
    }

    @Override
    public Optional<House> findById(Long id) {
        return houseRepo.findById(id);
    }

    @Override
    public House save(House house) {
        return houseRepo.save(house);
    }

    @Override
    public void delete(Long id) {
         houseRepo.deleteById(id);
    }
}
