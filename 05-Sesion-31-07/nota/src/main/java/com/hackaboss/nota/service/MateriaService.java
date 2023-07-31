package com.hackaboss.nota.service;

import com.hackaboss.nota.entity.Materia;
import com.hackaboss.nota.irepository.IMateriaRepository;
import com.hackaboss.nota.iservice.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService implements IMateriaService {
    @Autowired
    private IMateriaRepository repository;

    @Override
    public List<Materia> all() {
        return null;
    }

    @Override
    public Optional<Materia> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Materia save(Materia materia) {
        return null;
    }

    @Override
    public void update(Long id, Materia materia) {

    }

    @Override
    public void delete(Long id) {

    }
}
