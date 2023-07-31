package com.hackaboss.nota.irepository;

import com.hackaboss.nota.entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaRepository extends JpaRepository<Materia, Long> {
}
