/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion.datos;

import asignacion.dominio.BoletaAsignacion;
import asignacion.dominio.RegistroCatedratico;
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
public class RegistroCatedraticoDAO {
    
private static final String SQL_SELECT = "SELECT idCat, nombres, apellidos, dpi, idDir, idCorreo, idTel FROM catedratico";

private static final String SQL_INSERT = "INSERT INTO catedratico (idCat, nombres, apellidos, dpi, idDir, idCorreo, idTel) VALUES(?,?,?,?,?,?,?)";

private static final String SQL_UPDATE = "UPDATE catedratico SET nombres= ?, apellidos= ?, dpi= ?, idDir= ?, idCorreo=?, idTel=? WHERE idCat= ?";

private static final String SQL_QUERY = "SELECT idCat, nombres, apellidos, dpi, idDir, idCorreo, idTel FROM catedratico WHERE idCat=?";

private static final String SQL_DELETE = "DELETE FROM catedratico WHERE idCat=?";
 
 
 public List<RegistroCatedratico> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        RegistroCatedratico registrocatedratico = null;
        List<RegistroCatedratico> registrocatedraticos = new ArrayList <RegistroCatedratico>();

        try {
            conn = (Connection) Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idCat = rs.getString("idCat");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String dpi = rs.getString("dpi");
                String idDir = rs.getString("idDir");
                String idCorreo = rs.getString("idCorreo");
                String idTel = rs.getString("idTel");
                        
                 
                registrocatedratico = new RegistroCatedratico();
                registrocatedratico.setIdCat(idCat);
                registrocatedratico.setNombres(nombres);
                registrocatedratico.setApellidos(apellidos);
                registrocatedratico.setDpi(dpi);
                registrocatedratico.setIdDir(idDir);
                registrocatedratico.setIdCorreo(idCorreo);
                registrocatedratico.setIdTel(idTel);
           
             
                registrocatedraticos.add(registrocatedratico);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return registrocatedraticos;
    }
 
 public int insert(RegistroCatedratico registrocate) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = (Connection) Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,registrocate.getIdCat());
            stmt.setString(2, registrocate.getNombres());
            stmt.setString(3, registrocate.getApellidos());
            stmt.setString(4,registrocate.getDpi());
            stmt.setString(5,registrocate.getIdDir());
            stmt.setString(6,registrocate.getIdCorreo());
            stmt.setString(7,registrocate.getIdTel());
            
            
             //System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            //System.out.println("Registros afectados:" + rows);
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return rows;
    }
  public int update(RegistroCatedratico registrocate) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, registrocate.getIdCat());
            stmt.setString(2, registrocate.getNombres());
            stmt.setString(3, registrocate.getApellidos());
            stmt.setString(4, registrocate.getDpi());
            stmt.setString(5, registrocate.getIdDir());
            stmt.setString(6, registrocate.getIdCorreo());
            stmt.setString(7, registrocate.getIdTel());

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
  public RegistroCatedratico query(RegistroCatedratico registrocate) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<RegistroCatedratico> registrocatedraticos = new ArrayList<RegistroCatedratico>();
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, registrocate.getIdCat());
            rs = stmt.executeQuery();
            while (rs.next()) {
               String idCat = rs.getString("idCat");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String dpi = rs.getString("dpi");
                String idDir = rs.getString("idDir");
                String idCorreo = rs.getString("idCorreo");
                String idTel = rs.getString("idTel");
                
                registrocate = new RegistroCatedratico();
                registrocate.setIdCat(idCat);
                registrocate.setNombres(nombres);
                registrocate.setApellidos(apellidos);
                registrocate.setDpi(dpi);
                registrocate.setIdDir(idDir);
                registrocate.setIdCorreo(idCorreo);
                registrocate.setIdTel(idTel);

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
        return registrocate;
    } 
 public int delete(RegistroCatedratico registrocatedratico) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            //System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, registrocatedratico.getIdCat());
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
    
}
