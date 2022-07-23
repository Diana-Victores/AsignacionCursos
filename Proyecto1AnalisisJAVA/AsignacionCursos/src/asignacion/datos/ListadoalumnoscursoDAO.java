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
import asignacion.dominio.Listadoalumnoscurso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class ListadoalumnoscursoDAO {
    
private static final String SQL_SELECT = "SELECT idlistado, idAlumno, nombres, apellidos, carnet, semestre, año, idcarrera, idfacultades";

private static final String SQL_INSERT = "INSERT INTO Listadoalumnoscurso (idlistado, idAlumno, nombres, apellidos, carnet, semestre, año, idcarrera, idfacultades) VALUES(?,?,?,?,?,?,?)";

private static final String SQL_UPDATE = "UPDATE Listadoalumnoscurso SET nombres= ?, apellidos= ?, carnet= ?, semestre= ?, año= ?, idcarrera= ?, idfacultades=? WHERE idlistado= ?";

private static final String SQL_QUERY = "SELECT idlistado, idAlumno, nombres, apellidos, carnet, semestre, año, idcarrera, idfacultades FROM Listadoalumnoscurso WHERE idlistado=?";

private static final String SQL_DELETE = "DELETE FROM Listadoalumnoscurso WHERE idlistado=?";

 
 
 public List<Listadoalumnoscurso> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Listadoalumnoscurso listadoalumnoscurso = null;
        List<Listadoalumnoscurso> listadoalumnoscursos = new ArrayList <Listadoalumnoscurso>();

        try {
            conn = (Connection) Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idlistado = rs.getString("idlistado");
                String idAlumno = rs.getString("idAlumno");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String carnet = rs.getString("carnet");
                String semestre = rs.getString("semestre");
                String año = rs.getString("año");
                String idcarrera = rs.getString("idcarrera");
                String idfacultades = rs.getString("idfacultades");
                        
                 
                listadoalumnoscurso = new Listadoalumnoscurso();
                listadoalumnoscurso.setIdlistado(idlistado);
                listadoalumnoscurso.setIdAlumno(idAlumno);
                listadoalumnoscurso.setNombres(nombres);
                listadoalumnoscurso.setApellidos(apellidos);
                listadoalumnoscurso.setCarnet(carnet);
                listadoalumnoscurso.setSemestre(semestre);
                listadoalumnoscurso.setAño(año);
                listadoalumnoscurso.setIdcarrera(idcarrera);
                listadoalumnoscurso.setIdfacultades(idfacultades);
           
             
                listadoalumnoscursos.add(listadoalumnoscurso);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return listadoalumnoscursos;
    }
 
 public int insert(Listadoalumnoscurso listado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = (Connection) Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,listado.getIdlistado());
            stmt.setString(2, listado.getIdAlumno());
            stmt.setString(3, listado.getNombres());
            stmt.setString(4, listado.getApellidos());
            stmt.setString(5, listado.getCarnet());
            stmt.setString(6,listado.getSemestre());
            stmt.setString(7,listado.getAño());
            stmt.setString(8, listado.getIdcarrera());
            stmt.setString(9,listado.getIdfacultades());

            
            
             //System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            //System.out.println("Registros afectados:" + rows);
            JOptionPane.showMessageDialog(null, "Listado de alumnos completo");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return rows;
    }
  public int update(Listadoalumnoscurso listado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,listado.getIdlistado());
            stmt.setString(2, listado.getIdAlumno());
            stmt.setString(3, listado.getNombres());
            stmt.setString(4, listado.getApellidos());
            stmt.setString(5, listado.getCarnet());
            stmt.setString(6,listado.getSemestre());
            stmt.setString(7,listado.getAño());
            stmt.setString(8, listado.getIdcarrera());
            stmt.setString(9,listado.getIdfacultades());
            
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
  public Listadoalumnoscurso query(Listadoalumnoscurso listado) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Listadoalumnoscurso> listadoalumnoscursos = new ArrayList <Listadoalumnoscurso>();
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, listado.getIdlistado());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idlistado = rs.getString("idlistado");
                String idAlumno = rs.getString("idAlumno");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String carnet = rs.getString("carnet");
                String semestre = rs.getString("semestre");
                String año = rs.getString("año");
                String idcarrera = rs.getString("idcarrera");
                String idfacultades = rs.getString("idfacultades");
                        
                 
                listado = new Listadoalumnoscurso();
                listado.setIdlistado(idlistado);
                listado.setIdAlumno(idAlumno);
                listado.setNombres(nombres);
                listado.setApellidos(apellidos);
                listado.setCarnet(carnet);
                listado.setSemestre(semestre);
                listado.setAño(año);
                listado.setIdcarrera(idcarrera);
                listado.setIdfacultades(idfacultades);

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
        return listado;
    } 
 public int delete(Listadoalumnoscurso listadoalumnoscurso) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            //System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, listadoalumnoscurso.getIdlistado());
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

    public void setIdAlumno(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCarnet(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSemestre(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setApellidos(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAño(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdcarrera(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdfacultades(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insert(ListadoalumnoscursoDAO listadoalumnoscursoAInsertar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public asignacion.vista.Listadoalumnoscurso query(asignacion.vista.Listadoalumnoscurso listadoalumnoscursoconsultar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

