package com.hackaboss.nota.irepository;

import com.hackaboss.nota.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {
}
