package com.hackaboss.nota.irepository;

import com.hackaboss.nota.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {
    /** Monstrar lista por orden alfabeticamente **/
    @Query(value = "SELECT" +
            " id," +
            " nombre_completo," +
            " dni," +
            " correo," +
            " telefono" +
            " contrasenia" +
            " FROM" +
            " estudiante" +
            " ORDER BY nombre_completo ASC", nativeQuery = true)
    List<Estudiante> findOrderByNameStudent();

    @Query(value = "SELECT " +
            " id," +
            " nombre_completo," +
            " dni," +
            " correo," +
            " telefono," +
            " contrasenia " +
            " FROM " +
            " estudiante " +
            " WHERE nombre_estudiante = :nameStudent " +
            " ORDER BY nombre_completo ASC;", nativeQuery = true)
    List<Estudiante> findListByNameStudent(@Param("nameStudent") String nameStudent);
}
