package com.prueba.prueba.crud;

import com.prueba.prueba.modelo.PersonaDos;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrud extends CrudRepository<PersonaDos, Integer> {
}
