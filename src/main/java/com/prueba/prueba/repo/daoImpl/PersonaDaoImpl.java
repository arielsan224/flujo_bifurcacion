package com.prueba.prueba.repo.daoImpl;

import com.prueba.prueba.modelo.PersonaDos;
import com.prueba.prueba.modelo.mapper.PersonaMapper;
import com.prueba.prueba.repo.dao.PersonaDao;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaDaoImpl implements PersonaDao {

    private final JdbcTemplate jdbcTemplate;

    public PersonaDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<PersonaDos> obtenerTodo() {
        return jdbcTemplate.query("select * from persona", new PersonaMapper());
    }

    @Override
    public void guardar(PersonaDos personaDos) {
        jdbcTemplate.update("INSERT INTO dbo.PERSONA" +
                "([PRIMER_NOMBRE]," +
                "[SEGUNDO_NOMBRE]," +
                "[PRIMER_APELLIDO]," +
                "[SEGUNDO_APELLIDO] )" +
                "VALUES (?,?,?,?)", personaDos.getPrimernombre(), personaDos.getSegundonombre(), personaDos.getPrimerapellido(), personaDos.getSegundoapellido()
        );

    }

    @Override
    public Optional<PersonaDos> obtenerPorId(int id) {
        return jdbcTemplate.query("select * from persona where id = ?",new PersonaMapper(),id).stream().findFirst();
    }

    @Override
    public void eliminar(int id) {
        jdbcTemplate.update("delete persona where id = ?",id);

    }
}
