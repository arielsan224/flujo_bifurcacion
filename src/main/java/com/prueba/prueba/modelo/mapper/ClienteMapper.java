package com.prueba.prueba.modelo.mapper;

import com.prueba.prueba.modelo.Cliente;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteMapper implements RowMapper<Cliente> {
    @Override
    public Cliente mapRow(ResultSet rs, int nowNum) throws SQLException {

        Cliente cliente = new Cliente();
        cliente.setId(rs.getInt("CLIENTE_ID"));
        cliente.setDireccion(rs.getString("DIRECCION"));
        cliente.setSucursalAtencion(rs.getString("SUCURSAL_ATENCION"));
        cliente.setNombre(rs.getString("NOMBRE_CLIENTE"));
        cliente.setTelefono(rs.getString("TELEFONO"));
        return cliente;
    }
}
