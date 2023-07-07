package AccesoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {
    public static Connection obtenerConexion() throws SQLException{
        Connection c = null;
        try {
            String url = "jdbc:mysql://localhost:3306/Tarea16_Grupo05?user=root&password=123456";
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return c;
    }
    
    public static void CerrarConexion(Connection c){
        try {
            if(c.isClosed() == false){
                c.close();
            }
        } catch (SQLException e) {
        }
    }
}
