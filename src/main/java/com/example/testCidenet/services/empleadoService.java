package com.example.testCidenet.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.testCidenet.models.empleadoModel;
import com.example.testCidenet.repositories.empleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empleadoService {
    
    @Autowired 
    empleadoRepository empleadoRepo;

    public ArrayList<empleadoModel> obtenerEmpleado(){
        return (ArrayList<empleadoModel>) empleadoRepo.findAll();
    }

    public empleadoModel guardarEmpleado(empleadoModel empleado){
        return empleadoRepo.save(empleado);
    }

    public Optional<empleadoModel> obtenerEmpleadoPorId(String id){
        return empleadoRepo.findById(id);
    }

    public ArrayList<empleadoModel> obtenerEmpleadoPorPrimerApellido(String primerApellido){
        return empleadoRepo.findByPrimerApellido(primerApellido);
    }

    public ArrayList<empleadoModel> obtenerEmpleadoPorSegundoApellido(String segundoApellido){
        return empleadoRepo.findBySegundoApellido(segundoApellido);
    }

    public ArrayList<empleadoModel> obtenerEmpleadoPorPrimerNombre(String primerNombre){
        return empleadoRepo.findByPrimerNombre(primerNombre);
    }

    public ArrayList<empleadoModel> obtenerEmpleadoPorOtroNombre(String otroNombre){
        return empleadoRepo.findByOtrosNombres(otroNombre);
    }

    public ArrayList<empleadoModel> obtenerEmpleadoPorTipoId(String tipoId){
        return empleadoRepo.findByTipoId(tipoId);
    }

    public ArrayList<empleadoModel> obtenerEmpleadoPorCorreo(String correo){
        return empleadoRepo.findByCorreo(correo);
    }

    public ArrayList<empleadoModel> obtenerEmpleadoPorEstado(String estado){
        return empleadoRepo.findByEstado(estado);
    }

    public ArrayList<empleadoModel> obtenerEmpleadoPorPaisDeEmpleo(String paisEmpleo){
        return empleadoRepo.findByPaisEmpleo(paisEmpleo);
    }

    public boolean eliminarEmpleado(String id){
        try {
            empleadoRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
