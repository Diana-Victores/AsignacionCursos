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
public class CertificacionCurso {
     String idcertificacion;
    String idAlumno;
    String carnet;
    String semestre;
    String año;
    String idfacultades;

    public String getIdcertificacion() {
        return idcertificacion;
    }

    public void setIdcertificacion(String idcertificacion) {
        this.idcertificacion = idcertificacion;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
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

    public String getIdfacultades() {
        return idfacultades;
    }

    public void setIdfacultades(String idfacultades) {
        this.idfacultades = idfacultades;
    }

    public void add(CertificacionCurso CertificacionCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    