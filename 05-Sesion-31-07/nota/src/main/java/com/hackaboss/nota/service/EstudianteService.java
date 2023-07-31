package com.hackaboss.nota.service;

import com.hackaboss.nota.entity.Estudiante;
import com.hackaboss.nota.irepository.IEstudianteRepository;
import com.hackaboss.nota.iservice.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService  implements IEstudianteService {
    @Autowired
    private IEstudianteRepository repository;

    @Override
    public List<Estudiante> all() {
        return null;
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return null;
    }

    @Override
    public void update(Long id, Estudiante estudiante) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Estudiante> findOrderByNameStudent() {
        return null;
    }
}
