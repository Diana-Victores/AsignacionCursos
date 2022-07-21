/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion.datos;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.*;
/**
 *
 * @author Diana
 */
public class Conexion {
      // Estas constantes deben cambiarse temporalmente para probarlo localmente

    private static final String JDBC_URL = "jdbc:mysql://localhost/AsignacionCurso";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "";


    public static Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn) throws IOException{
        conn.close();
    }
}
