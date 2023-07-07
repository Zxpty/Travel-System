package DAOs;

import AccesoBD.ConexionBD;
import Control.ArbolVuelos;
import Control.Nodo_Vuelos;
import Modelo.Vuelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class VuelosDAO {
    public static void Insertar(Vuelos elemento){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into vuelos(NumeroVuelo, FechaVuelo, HoraVuelo, OrigenVuelo, DestinoVuelo, PlazasTotales, PlazasTurista) value(?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, elemento.getNumeroVuelo());
            ps.setString(2, elemento.getFechaVuelo());
            ps.setString(3, elemento.getHoraVuelo());
            ps.setString(4, elemento.getOrigenVuelo());
            ps.setString(5, elemento.getDestinoVuelo());
            ps.setInt(6, elemento.getPlazasTotales());
            ps.setInt(7, elemento.getPlazasTurista());
            int r = ps.executeUpdate();
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "El Registro fue exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se puedo registrar :(");
            }
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarLista(ArbolVuelos objArbolVuelos){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from vuelos");
            ResultSet rs = ps.executeQuery();
            objArbolVuelos.setRaiz(null);
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3) ,rs.getString(4),
                    rs.getString(5), rs.getInt(6), rs.getInt(7)};
                Vuelos elemento = new Vuelos(registro);
                Nodo_Vuelos raiz = objArbolVuelos.Agregar(objArbolVuelos.getRaiz(), elemento);
                objArbolVuelos.setRaiz(raiz);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Eliminar(Vuelos elemento){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement pst = cn.prepareStatement("delete from vuelos where NumeroVuelo = ?");
            pst.setInt(1, elemento.getNumeroVuelo());
            int rpta = pst.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null, "La Eliminacion del Turista fue Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "La Eliminacion no se pudo realizar");
            }
            pst.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void EliminarTodo(int NumeroVuelo){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from vuelosturisticos");
            PreparedStatement pst = cn.prepareStatement("delete from vuelosturisticos where codigovuelo = ?");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getInt(3) == NumeroVuelo){
                    pst.setInt(1, rs.getInt(1));
                    int rpta = pst.executeUpdate();
                }
            }
            rs.close();
            ps.close();
            pst.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Actualizar(Vuelos elemento){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update vuelos set FechaVuelo = ?, HoraVuelo = ?, OrigenVuelo = ?, DestinoVuelo = ?, PlazasTotales = ?, PlazasTurista = ? where NumeroVuelo = ?");
            ps.setString(1, elemento.getFechaVuelo());
            ps.setString(2, elemento.getHoraVuelo());
            ps.setString(3, elemento.getOrigenVuelo());
            ps.setString(4, elemento.getDestinoVuelo());
            ps.setInt(5, elemento.getPlazasTotales());
            ps.setInt(6, elemento.getPlazasTurista());
            ps.setInt(7, elemento.getNumeroVuelo());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null, "La Actualizacion fue Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "No fue posible realizar la Actualizacion");
            }
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
    public static void ConsultarCbo(JComboBox controlcbo){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement pst = cn.prepareStatement("select * from vuelos");
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
