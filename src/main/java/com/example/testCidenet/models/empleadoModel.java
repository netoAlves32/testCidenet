package com.example.testCidenet.models;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.*;

import org.springframework.validation.*;
import org.springframework.validation.annotation.Validated;



@Entity
@Table(name = "empleado")
public class empleadoModel {

    /**
     *
     */
    private static final String ACTIVO = "Activo";
    @Column(length = 20)
    String regex="/[A-Z]/";
    Pattern pat = Pattern.compile(regex);
    private String primerApellido;
    @Column(length = 20)
    private String segundoApellido;
    @Column(length = 20)
    private String primerNombre;
    @Column(length = 50)
    private String otrosNombres;
    private String paisEmpleo;
    private String tipoId;
    @Id
    @Column(unique = true, nullable = false,length = 20)
    //@Valid(mensaje = "El número de teléfono móvil no puede estar vacío")
    private String id;
    @Column(length = 300) 
    private String correo;
    private Date fechaIngreso;
    private String area;
    private String estado = ACTIVO;
    private Date fechaRegistro;

    
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    
    

    /*
     * @return String return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return String return the primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * @param primerNombre the primerNombre to set
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @return String return the otrosNombres
     */
    public String getOtrosNombres() {
        return otrosNombres;
    }

    /**
     * @param otrosNombres the otrosNombres to set
     */
    public void setOtrosNombres(String otrosNombres) {
        this.otrosNombres = otrosNombres;
    }

    /**
     * @return String return the paisEmpleo
     */
    public String getPaisEmpleo() {
        return paisEmpleo;
    }

    /**
     * @param paisEmpleo the paisEmpleo to set
     */
    public void setPaisEmpleo(String paisEmpleo) {
        this.paisEmpleo = paisEmpleo;
    }

    /**
     * @return String return the tipoId
     */
    public String getTipoId() {
        return tipoId;
    }

    /**
     * @param tipoId the tipoId to set
     */
    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return Date return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return Area return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return String return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return Date return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
