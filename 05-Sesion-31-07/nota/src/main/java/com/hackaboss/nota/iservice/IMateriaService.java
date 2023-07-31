package com.hackaboss.nota.iservice;

import com.hackaboss.nota.entity.Materia;

import java.util.List;
import java.util.Optional;

public interface IMateriaService {

    /** Método encargado de retornar la lista con todos los registros **/
    List<Materia> all();

    /** Método encargado de retornar un registro por medio del ID **/
    Optional<Materia> findById(Long id);

    /** Método encargado de guardar los datos del registro **/
    Materia save(Materia materia);


    /** Método encargado de modificar los datos del registro **/
    void update(Long id, Materia materia);

    /** Método encargado de eliminar el registro **/
    void delete(Long id);
}
