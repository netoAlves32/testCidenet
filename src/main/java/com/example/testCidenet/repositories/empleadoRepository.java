package com.example.testCidenet.repositories;

import java.util.ArrayList;

import com.example.testCidenet.models.empleadoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empleadoRepository extends CrudRepository<empleadoModel, String>{
    public abstract ArrayList<empleadoModel>  findByPrimerNombre(String primerNombre);
    public abstract ArrayList<empleadoModel>  findByOtrosNombres(String otroNombre);   
    public abstract ArrayList<empleadoModel>  findByPrimerApellido(String primerApellido);     
    public abstract ArrayList<empleadoModel>  findBySegundoApellido(String segundoApellido);  
    public abstract ArrayList<empleadoModel>  findByTipoId(String tipoId);     
    public abstract ArrayList<empleadoModel>  findByPaisEmpleo(String paisEmpleo);
    public abstract ArrayList<empleadoModel>  findByCorreo(String correo);
    public abstract ArrayList<empleadoModel>  findByEstado(String estado);

    
}
