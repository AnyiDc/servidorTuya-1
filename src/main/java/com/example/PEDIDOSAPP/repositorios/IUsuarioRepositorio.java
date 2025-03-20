package com.example.PEDIDOSAPP.repositorios;

import com.example.PEDIDOSAPP.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario,Integer> {
//Aca dentro del repo van las consultas personalizadas
    //Hacer  las 9 interfazes
}
