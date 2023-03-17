package com.prueba.prueba.servicio;

import com.prueba.prueba.crud.PersonaCrud;
import com.prueba.prueba.modelo.PersonaDos;
import com.prueba.prueba.repo.dao.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {
    private final PersonaCrud personaCrud;
    private final PersonaDao personaDao;

    @Autowired
    public PersonaServicio(PersonaDao personaDao, PersonaCrud personaCrud) {
        this.personaCrud = personaCrud;
        this.personaDao = personaDao;
    }
    public List<PersonaDos> obtenerTodo() {
        return (List<PersonaDos>) personaCrud.findAll();
    }

    public void guardar(PersonaDos personaDos) {
        //personaDao.guardar(persona);
        personaCrud.save(personaDos);
    }

    public void guardarDao(PersonaDos personaDos) {
        //personaDao.guardar(persona);
        personaCrud.save(personaDos);
    }

  /*  public Persona guardarsimple(Persona persona) {
        return personaDao.guardarSimple(persona);

    }*/

    public Optional<PersonaDos> obtenerPorId(int id) {
        //return personaDao.obtenerPorId(id);
        return personaCrud.findById(id);
    }


    public void eliminar(int id) {
        //personaDao.eliminar(id);
        personaCrud.deleteById(id);

    }

}
