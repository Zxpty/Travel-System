package DAOs;

import AccesoBD.ConexionBD;
import Control.Arbol_Estancias;
import Control.Nodo_Estancias;
import Modelo.Estancias;
import Modelo.Hoteles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EstanciasDAO {
    public static void Insertar(Estancias Elemento){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into estancias(CodigoEstancia, Pension, FechaEntrada, FechaSalida, Hoteles_CodigoHotel) value(?, ?, ?, ?, ?)");
            ps.setInt(1, Elemento.getCodigoEstancia());
            ps.setString(2, Elemento.getPension());
            ps.setString(3, Elemento.getFechaEntrada());
            ps.setString(4, Elemento.getFechaSalida());
            ps.setInt(5, Elemento.getHoteles_CodigoHotel());
            //ps.setDate(3, Elemento.getFechaEntrada());
            int r = ps.executeUpdate();
            if(r >0){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "No fue posible registrar");
            }
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarLista(Arbol_Estancias objArbolEstancias){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from estancias");
            ResultSet rs = ps.executeQuery();
            objArbolEstancias.setRaiz(null);
            while(rs.next()){
                Object[] registro = {rs.getInt(1),
                                     rs.getString(2),
                                     rs.getString(3),
                                     rs.getString(4),
                                     rs.getInt(5),};
                Estancias Elemento = new Estancias(registro);
                Nodo_Estancias Raiz = objArbolEstancias.Agregar(objArbolEstancias.getRaiz(), Elemento);
                objArbolEstancias.setRaiz(Raiz);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarHashHoteles(HashMap objHash){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from hoteles");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro = {rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)};
                Hoteles elemento = new Hoteles(registro);
                objHash.put(rs.getInt(1), elemento);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarCbo(JComboBox controlcbo){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement pst = cn.prepareStatement("select * from estancias");
            ResultSet rst = pst.executeQuery();
            DefaultComboBoxModel modcombo = new DefaultComboBoxModel();
            controlcbo.setModel(modcombo);
            while (rst.next()) {                
                modcombo.addElement(rst.getInt(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
