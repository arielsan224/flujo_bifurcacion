package com.prueba.prueba.modelo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="CLIENTE_ID")
    private  String nombre;
    @Column (name="NOMBRE_CLIENTE")
    private  String direccion;
    @Column (name ="DIRECCION")
    private  String telefono;
    @Column (name="TELEFONO")
    private  String sucursalAtencion;
    @Column (name="SUCURSAL_ATENCION")
    private  String sucursal;

}
