package com.prueba.prueba.repo.dao;

import com.prueba.prueba.modelo.PersonaDos;

import java.util.List;
import java.util.Optional;

public interface PersonaDao {

    List<PersonaDos> obtenerTodo();
    void guardar (PersonaDos personaDos);

    public Optional<PersonaDos> obtenerPorId(int id);

    void  eliminar(int id);


}
