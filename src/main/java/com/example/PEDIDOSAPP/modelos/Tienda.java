package com.example.PEDIDOSAPP.modelos;

import jakarta.persistence.*;

@Entity
@Table (name ="Restaurante" )
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restaurante")
    private Integer id;
    @Column(length = 100,nullable = false)
    private String nombre;
    @Column(length = 250,nullable = false)
    private String direccion;
    @Column(length = 20,nullable = false)
    private String telefono;
    @Column(length = 50)
    private String categoria;

    public Tienda() {
    }

    public Tienda(Integer id, String nombre, String direccion, String telefono, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
