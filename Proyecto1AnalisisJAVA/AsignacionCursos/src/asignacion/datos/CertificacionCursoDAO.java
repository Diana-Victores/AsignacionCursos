/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion.datos;

/**
 *
 * @author linri
 */

import asignacion.dominio.BoletaAsignacion;
import asignacion.dominio.CertificacionCurso;
import asignacion.dominio.RegistroCatedratico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Diana
 */
public class CertificacionCursoDAO {

private static final String SQL_SELECT = "SELECT idcertificacion, idAlumno, carnet, semestre, año, idfacultades";

private static final String SQL_INSERT = "INSERT INTO Certificacion (idcertificacion, idAlumno, carnet, semestre, año, idfacultades) VALUES(?,?,?,?,?,?,?)";

private static final String SQL_UPDATE = "UPDATE Certificacion SET carnet= ?, semestre= ?, año= ?, idfacultades=? WHERE idcertificacion= ?";

private static final String SQL_QUERY = "SELECT idcertificacion, idAlumno, carnet, semestre, año, idfacultades FROM catedratico WHERE idcertificacion=?";

private static final String SQL_DELETE = "DELETE FROM Certificacion WHERE idcertificacion=?";



 public List<CertificacionCurso> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CertificacionCurso certificacioncurso = null;
        List<CertificacionCurso> certificacionCursos = new ArrayList <CertificacionCurso>();

        try {
            conn = (Connection) Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idcertificacion = rs.getString("idcertificacion");
                String idAlumno = rs.getString("idAlumno");
                String carnet = rs.getString("carnet");
                String semestre = rs.getString("semestre");
                String año = rs.getString("año");
                String idfacultades = rs.getString("idfacultades");


                certificacioncurso = new CertificacionCurso();
                certificacioncurso.setIdcertificacion(idcertificacion);
                certificacioncurso.setIdAlumno(idAlumno);
                certificacioncurso.setCarnet(carnet);
                certificacioncurso.setSemestre(semestre);
                certificacioncurso.setAño(año);
                certificacioncurso.setIdfacultades(idfacultades);


                certificacionCursos.add(certificacioncurso);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return certificacionCursos;
    }

 public int insert(CertificacionCurso certificado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = (Connection) Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,certificado.getIdcertificacion());
            stmt.setString(2, certificado.getIdAlumno());
            stmt.setString(3, certificado.getCarnet());
            stmt.setString(4,certificado.getSemestre());
            stmt.setString(5,certificado.getAño());
            stmt.setString(6,certificado.getIdfacultades());



             //System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            //System.out.println("Registros afectados:" + rows);
            JOptionPane.showMessageDialog(null, "Certificado completado");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return rows;
    }
  public int update(CertificacionCurso certificado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,certificado.getIdcertificacion());
            stmt.setString(2, certificado.getIdAlumno());
            stmt.setString(3, certificado.getCarnet());
            stmt.setString(4,certificado.getSemestre());
            stmt.setString(5,certificado.getAño());
            stmt.setString(6,certificado.getIdfacultades());


            rows = stmt.executeUpdate();
            //System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return rows;
    }
  public CertificacionCurso query(CertificacionCurso certificado) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<CertificacionCurso> certificacionCursos = new ArrayList <CertificacionCurso>();
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, certificado.getIdcertificacion());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idcertificacion = rs.getString("idcertificacion");
                String idAlumno = rs.getString("idAlumno");
                String carnet = rs.getString("carnet");
                String semestre = rs.getString("semestre");
                String año = rs.getString("año");
                String idfacultades = rs.getString("idfacultades");

                certificado = new CertificacionCurso();
                certificado.setIdcertificacion(idcertificacion);
                certificado.setIdAlumno(idAlumno);
                certificado.setCarnet(carnet);
                certificado.setSemestre(semestre);
                certificado.setAño(año);
                certificado.setIdfacultades(idfacultades);

                //empleados.add(empleado); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + empleado);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        //return empleados;  // Si se utiliza un ArrayList
        return certificado;
    } 
 public int delete(CertificacionCurso certificacioncurso) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            //System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, certificacioncurso.getIdcertificacion());
            rows = stmt.executeUpdate();
            //System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
                Conexion.close((ResultSet) conn);
        }

        return rows;
    }

    public void setIdcertificacion(JTextField jTextnumero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdAlumno(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCarnet(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSemestre(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAño(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdfacultades(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insert(CertificacionCursoDAO certificacioncursoAInsertar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}