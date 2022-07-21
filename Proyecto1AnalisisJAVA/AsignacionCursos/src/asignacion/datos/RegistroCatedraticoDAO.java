/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion.datos;

import asignacion.dominio.BoletaAsignacion;
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
 
 
 public List<BoletaAsignacion> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        BoletaAsignacion boletaasignacion = null;
        List<BoletaAsignacion> boletaasignaciones = new ArrayList <BoletaAsignacion>();

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
             
                
                 
                boletaasignacion = new BoletaAsignacion();
                boletaasignacion.setIdCat(idCat);
                boletaasignacion.setNombres(nombres);
                boletaasignacion.setapellidos(apellidos);
                boletaasignacion.setdpi(dpi);
                
             
                boletaasignaciones.add(boletaasignacion);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return boletaasignaciones;
    }
 
 
    
}
