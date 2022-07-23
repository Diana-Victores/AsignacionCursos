
package asignacion.datos;

import asignacion.dominio.AsignacionCursos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class AsignacionCursosDAO {

private static final String SQL_SELECT = "SELECT idAlumno, nombres, Apellidos FROM  alumno";


private static final String SQL_INSERT = "INSERT INTO CursosAsignados (carnet, Nombres, Apellidos, Boleta_Pago_Numero, Semestre_Trimestre, Año, Curso_1, Curso_2, Curso_3, Curso_4, Curso_5, Curso_Extraordinario_1, Curso_Extraordinario_2, Curso_Extraordinario_3)"
        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";

private static final String SQL_QUERY = "SELECT idAlumno, nombres, Apellidos FROM alumno WHERE idAlumno=?";

 
 
 public List<AsignacionCursos> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AsignacionCursos asignacioncurso = null;
        List<AsignacionCursos> asignacioncursos = new ArrayList <AsignacionCursos>();

        try {
            conn = (Connection) Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idAlumno = rs.getString("IdAlumno");
                String nombres = rs.getString("nombres");
                String Apellidos = rs.getString("Apellidos");
                        
                 
                asignacioncurso = new AsignacionCursos();
                asignacioncurso.setIdAlumno(idAlumno);
                asignacioncurso.setNombres(nombres);
                asignacioncurso.setApellidos(Apellidos);          
                
                asignacioncursos.add(asignacioncurso);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return asignacioncursos;
    }
 
  public int insert(AsignacionCursos asigcursos) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = (Connection) Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,asigcursos.getIdAlumno());
            stmt.setString(2, asigcursos.getNombres());
            stmt.setString(3, asigcursos.getApellidos());
            stmt.setString(rows, SQL_QUERY);
            
             //System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            //System.out.println("Registros afectados:" + rows);
            JOptionPane.showMessageDialog(null, "Asignacion Exitosa");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return rows;
    }
  
  public AsignacionCursos query(AsignacionCursos asigcursos) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AsignacionCursos> asignacioncursos = new ArrayList<AsignacionCursos>();
        int rows = 0;

        try {
            conn = (Connection) Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, asigcursos.getIdAlumno());
            rs = stmt.executeQuery();
            while (rs.next()) {
               String idAlumno = rs.getString("idAlumno");
               String Nombres = rs.getString("nombres");
               String Apellidos = rs.getString("Apellidos");
                
                asigcursos = new AsignacionCursos();
                asigcursos.setIdAlumno(idAlumno);
                asigcursos.setNombres(Nombres);
                asigcursos.setApellidos(Apellidos);

                
            }
        
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }
        return asigcursos;
    } 
    
}
