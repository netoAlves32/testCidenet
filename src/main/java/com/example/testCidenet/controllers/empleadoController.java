package com.example.testCidenet.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.testCidenet.models.empleadoModel;
import com.example.testCidenet.services.empleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class empleadoController {
    @Autowired
    empleadoService eService;

    @GetMapping()
    public ArrayList<empleadoModel> obtenerEmpleado(){
        return eService.obtenerEmpleado();
    }
    
    @PostMapping()
    public empleadoModel guardarEmpleado(@RequestBody empleadoModel empleado){
        return this.eService.guardarEmpleado(empleado);
    }

    @GetMapping(path = "/{id}")
    public Optional<empleadoModel> obtenerEmpleadoPorId(@PathVariable("id") String id){
        return this.eService.obtenerEmpleadoPorId(id);
    }
    
    @GetMapping("/query")
    public ArrayList<empleadoModel> obtenerEmpleadoPorPrimerApellido(@RequestParam("primerApellido") String pApellido){
        return this.eService.obtenerEmpleadoPorPrimerApellido(pApellido);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarEmpleado(@PathVariable("id") String id){
        boolean hecho = this.eService.eliminarEmpleado(id);
        if (hecho){
            return "Se eliminó el empleado con id " + id;
        }
        else{
            return "No se pudo eliminar el empleado con el id" + id;
        }
    }
}
