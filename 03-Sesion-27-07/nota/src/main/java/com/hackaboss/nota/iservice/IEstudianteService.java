package com.hackaboss.nota.iservice;

import com.hackaboss.nota.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IEstudianteService {

    /** Método encargado de retornar la lista con todos los registros **/
    List<Estudiante> all();

    /** Método encargado de retornar un registro por medio del ID **/
    Optional<Estudiante> findById(Long id);

    /** Método encargado de guardar los datos del registro **/
    Estudiante save(Estudiante estudiante);

    /** Método encargado de modificar los datos del registro **/
    void update(Long id, Estudiante estudiante);

    /** Método encargado de eliminar el registro **/
    void delete(Long id);

    /** Metodo encargado de listar a los estudiantes por nombre alfabeticamente **/
    List<Estudiante> findOrderByNameStudent();

}
