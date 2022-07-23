/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion.dominio;

/**
 *
 * @author linri
 */
public class Listadoalumnoscurso {
    String idlistado;
    String idAlumno;
    String nombres;
    String Apellidos;
    String carnet;
    String semestre;
    String año;
    String idcarrera;
    String idfacultades;


    public String getIdlistado() {
        return idlistado;
    }

    public void setIdlistado(String idlistado) {
        this.idlistado = idlistado;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(String idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getIdfacultades() {
        return idfacultades;
    }

    public void setIdfacultades(String idfacultades) {
        this.idfacultades = idfacultades;
    }  
}
