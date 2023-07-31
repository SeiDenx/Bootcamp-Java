package com.hackaboss.nota.service;

import com.hackaboss.nota.entity.Matricula;
import com.hackaboss.nota.irepository.IMateriaRepository;
import com.hackaboss.nota.iservice.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService implements IMatriculaService {
    @Autowired
    private IMateriaRepository repository;

    @Override
    public List<Matricula> all() {
        return null;
    }

    @Override
    public Optional<Matricula> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Matricula save(Matricula matricula) {
        return null;
    }

    @Override
    public void update(Long id, Matricula matricula) {

    }

    @Override
    public void delete(Long id) {

    }
}
