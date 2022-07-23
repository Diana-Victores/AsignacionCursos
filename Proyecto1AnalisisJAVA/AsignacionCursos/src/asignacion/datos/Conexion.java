/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Diana
 */
public class Conexion{

    Connection enlazar = null;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            enlazar = DriverManager.getConnection("jdbc:mysql://localhost/asignacioncurso", "root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "No fue posible establecer la conexion");
                    
        }
        return enlazar;
    }

}