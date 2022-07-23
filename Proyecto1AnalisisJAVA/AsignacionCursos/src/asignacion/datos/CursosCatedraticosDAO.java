
package asignacion.datos;

import asignacion.dominio.CursosCatedraticos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CursosCatedraticosDAO {
    
     private static final  String SQL_SELECT = "SELECT idCat, nombres, apellidos FROM catedratico" +" SELECT idCURSO, nombre, seccion,idhorario, FROM cursos";
    
     public List<CursosCatedraticos> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CursosCatedraticos cursoscat = null;
        List<CursosCatedraticos> cursoscat2 = new ArrayList <CursosCatedraticos>();

        try {
            conn = (Connection) Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idCat = rs.getString("idCat");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String nombre = rs.getString("nombre");
                String seccion = rs.getString("seccion");
                String idhorario = rs.getString("idhorario");
                
                 
                cursoscat = new CursosCatedraticos();
                cursoscat.setIdCat(idCat);
                cursoscat.setNombres(nombres);
                cursoscat.setApellidos(apellidos);
                cursoscat.setNombre(nombre);
                cursoscat.setSeccion(seccion);
                cursoscat.setIdhorario(idhorario);
                
                cursoscat2.add(cursoscat);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close((ResultSet) conn);
        }

        return cursoscat2;
    }
}
