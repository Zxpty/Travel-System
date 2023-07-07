package DAOs;

import AccesoBD.ConexionBD;
import Control.ArbolHoteles;
import Control.Nodo_Hoteles;
import Modelo.Hoteles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class HotelesDAO {
    public static void Insertar(Hoteles elemento) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into hoteles(CodigoHotel, NombreHotel, DireccionHotel, CiudadHotel, TelefonoHotel, PlazasHotel) value(?, ?, ?, ?, ?, ?)");
            ps.setInt(1, elemento.getCodigoHotel());
            ps.setString(2, elemento.getNombreHotel());
            ps.setString(3, elemento.getDireccionHotel());
            ps.setString(4, elemento.getCiudadHotel());
            ps.setString(5, elemento.getTelefonoHotel());
            ps.setInt(6, elemento.getPlazasHotel());
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

    public static void ConsultarLista(ArbolHoteles objArbolHoteles) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from hoteles");
            ResultSet rs = ps.executeQuery();
            objArbolHoteles.setRaiz(null);
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)};
                Hoteles elemento = new Hoteles(registro);
                Nodo_Hoteles raiz = objArbolHoteles.Agregar(objArbolHoteles.getRaiz(), elemento);
                objArbolHoteles.setRaiz(raiz);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Actualizar(Hoteles elemento) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update hoteles set NombreHotel = ?, DireccionHotel = ?, CiudadHotel = ?, TelefonoHotel = ?, PlazasHotel = ? where CodigoHotel = ?");
            ps.setString(1, elemento.getNombreHotel());
            ps.setString(2, elemento.getDireccionHotel());
            ps.setString(3, elemento.getCiudadHotel());
            ps.setString(4, elemento.getTelefonoHotel());
            ps.setInt(5, elemento.getPlazasHotel());
            ps.setInt(6, elemento.getCodigoHotel());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "La Actualizacion fue Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No fue posible realizar la Actualizacion");
            }
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Eliminar(Hoteles elemento) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement pst = cn.prepareStatement("delete from hoteles where CodigoHotel = ?");
            pst.setInt(1, elemento.getCodigoHotel());
            int rpta = pst.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "La Eliminacion del Hotel fue Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "La Eliminacion no se pudo realizar");
            }
            pst.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void EliminarTodo(int CodigoHotel){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps1 = cn.prepareStatement("select * from estancias");
            PreparedStatement pst1 = cn.prepareStatement("delete from estancias where codigoestancia = ?");
            ResultSet rs1 = ps1.executeQuery();
            PreparedStatement ps2 = cn.prepareStatement("select * from viajescontratados");
            PreparedStatement pst2 = cn.prepareStatement("delete from viajescontratados where codigoviajes = ?");
            ResultSet rs2 = ps2.executeQuery();
            PreparedStatement ps3 = cn.prepareStatement("select * from vuelosturisticos");
            PreparedStatement pst3 = cn.prepareStatement("delete from vuelosturisticos where codigovuelo = ?");
            ResultSet rs3 = ps3.executeQuery();
            int codigoEstancia = 0, codigoViajes = 0;
            while (rs1.next()) {
                if (rs1.getInt(5) == CodigoHotel){
                    codigoEstancia = rs1.getInt(1);
                    while (rs2.next()) {
                        if (rs2.getInt(4) == codigoEstancia){
                            codigoViajes = rs2.getInt(1);
                            while (rs3.next()){
                                if(rs3.getInt(4) == codigoViajes){
                                    pst3.setInt(1, rs3.getInt(1));
                                    int rpta3 = pst3.executeUpdate();
                                }
                            }
                            pst2.setInt(1, rs2.getInt(1));
                            int rpta2 = pst2.executeUpdate();
                        }
                    }
                    pst1.setInt(1, rs1.getInt(1));
                    int rpta1 = pst1.executeUpdate();
                }
            }
            rs1.close(); rs2.close(); rs3.close();
            ps1.close(); ps2.close(); ps3.close(); 
            pst1.close(); pst2.close(); pst3.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarCbo(JComboBox controlcbo){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement pst = cn.prepareStatement("select * from hoteles");
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
