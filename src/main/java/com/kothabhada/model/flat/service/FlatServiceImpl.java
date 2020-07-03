package com.kothabhada.model.flat.service;

import com.kothabhada.model.flat.entity.Flat;
import com.kothabhada.model.flat.repository.FlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FlatServiceImpl implements FlatService {
    @Autowired
    private FlatRepository flatRepo;

    @Override
    public List<Flat> findAll() {
        return flatRepo.findAll();
    }

    @Override
    public Optional<Flat> findById(Long id) {
        return flatRepo.findById(id);
    }

    @Override
    public Flat save(Flat flat) {
        return flatRepo.save(flat);
    }

    @Override
    public void delete(Long id) {
          flatRepo.deleteById(id);
    }
}
