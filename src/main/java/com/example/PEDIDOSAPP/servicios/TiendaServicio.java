package com.example.PEDIDOSAPP.servicios;

import com.example.PEDIDOSAPP.modelos.Tienda;
import com.example.PEDIDOSAPP.modelos.Usuario;
import com.example.PEDIDOSAPP.repositorios.ITiendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaServicio {
    @Autowired
    ITiendaRepositorio repositorio;
    //Listar los metodos que activaran las consultas en la base de datos
    //Guardar
    public Tienda guardarUsuario(Tienda datosTienda)throws Exception {
        try {
            //validar los datos de entrada
            return this.repositorio.save(datosTienda);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Buscar todos los registros
    public List<Tienda> buscarTodosTienda () throws Exception{
        try {
            return this.repositorio.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //Buscar por ID
    public Tienda buscarTiendaPorId (Integer idTienda) throws  Exception{
        try {
            Optional <Tienda> tiendaBuscado =this.repositorio.findById(idTienda);
            if (tiendaBuscado.isPresent()){
                return tiendaBuscado.get();
            }else {
                throw new Exception("La tienda consultado no esta en la BD");
            }
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    //Modificar por ID
    public Tienda modificarTienda (Integer idTienda,Tienda datosTienda)throws Exception{
        try {
            Optional<Tienda> tiendaBuscado=this.repositorio.findById(idTienda);
            if (tiendaBuscado.isPresent()){
                tiendaBuscado.get().setTelefono(datosTienda.getTelefono());
                tiendaBuscado.get().setNombre(datosTienda.getNombre());
                return this.repositorio.save(tiendaBuscado.get());
            }else {
                throw new Exception("Tienda no encontrada");
            }
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }
    //Eliminar por ID

    public boolean eliminarTienda(Integer id) throws Exception{
        try {
            Optional <Tienda> tiendaBuscado=this.repositorio.findById(id);
            if (tiendaBuscado.isPresent()){
                this.repositorio.deleteById(id);
                return true;
            }else {
                throw new Exception("Tienda no encontrada");
            }
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }


}

















