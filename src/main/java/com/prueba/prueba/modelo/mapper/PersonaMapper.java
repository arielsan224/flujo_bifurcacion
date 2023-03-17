package com.prueba.prueba.modelo.mapper;

import com.prueba.prueba.modelo.PersonaDos;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaMapper implements RowMapper<PersonaDos> {

    @Override
    public PersonaDos mapRow (ResultSet rs, int nowNum) throws SQLException {

        PersonaDos personaDos = new PersonaDos();
        personaDos.setId(rs.getInt("ID"));
        personaDos.setPrimernombre(rs.getString(  "PRIMER_NOMBRE"));
        personaDos.setSegundonombre(rs.getString( "SEGUNDO_NOMBRE"));
        personaDos.setPrimerapellido(rs.getString("PRIMER_APELLIDO"));
        personaDos.setSegundoapellido(rs.getString("SEGUNDO_APELLIDO"));
        return personaDos;
    }


}
