package DAOs;

import AccesoBD.ConexionBD;
import Control.ArbolTuristas;
import Control.Nodo_Turistas;
import Modelo.Turistas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TuristasDAO {

    public static void Insertar(Turistas elemento) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into turistas(CodigoTurista, NombreTurista, ApellidoTurista, DireccionTurista, TelefonoTurista) value(?, ?, ?, ?, ?)");
            ps.setInt(1, elemento.getCodigoTurista());
            ps.setString(2, elemento.getNombreTurista());
            ps.setString(3, elemento.getApellidoTurista());
            ps.setString(4, elemento.getDireccionTurista());
            ps.setString(5, elemento.getTelefonoTurista());
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

    public static void ConsultarLista(ArbolTuristas objArbolTuristas) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from turistas");
            ResultSet rs = ps.executeQuery();
            objArbolTuristas.setRaiz(null);
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5)};
                Turistas elemento = new Turistas(registro);
                Nodo_Turistas raiz = objArbolTuristas.Agregar(objArbolTuristas.getRaiz(), elemento);
                objArbolTuristas.setRaiz(raiz);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Actualizar(Turistas elemento){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update turistas set NombreTurista = ?, ApellidoTurista = ?, DireccionTurista = ?, TelefonoTurista = ? where CodigoTurista = ?");
            ps.setString(1, elemento.getNombreTurista());
            ps.setString(2, elemento.getApellidoTurista());
            ps.setString(3, elemento.getDireccionTurista());
            ps.setString(4, elemento.getTelefonoTurista());
            ps.setInt(5, elemento.getCodigoTurista());
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
    
    public static void Eliminar(Turistas elemento){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement pst = cn.prepareStatement("delete from turistas where CodigoTurista = ?");
            pst.setInt(1, elemento.getCodigoTurista());
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
    
    public static void EliminarTodo(int codigoTurista){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps1 = cn.prepareStatement("select * from viajescontratados");
            PreparedStatement pst1 = cn.prepareStatement("delete from viajescontratados where codigoviajes = ?");
            ResultSet rs1 = ps1.executeQuery();
            PreparedStatement ps2 = cn.prepareStatement("select * from vuelosturisticos");
            PreparedStatement pst2 = cn.prepareStatement("delete from vuelosturisticos where codigovuelo = ?");
            ResultSet rs2 = ps2.executeQuery();
            int codigoViajes = 0;
            while (rs1.next()) {
                if (rs1.getInt(2) == codigoTurista){
                    codigoViajes = rs1.getInt(1);
                    while (rs2.next()){
                        if(rs2.getInt(4) == codigoViajes){
                            pst2.setInt(1, rs2.getInt(1));
                            int rpta3 = pst2.executeUpdate();
                        }
                    }
                    pst1.setInt(1, rs1.getInt(1));
                    int rpta2 = pst1.executeUpdate();
                }
            }
            rs1.close(); rs2.close();
            ps1.close(); ps2.close(); 
            pst1.close(); pst2.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarCbo(JComboBox controlcbo){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement pst = cn.prepareStatement("select * from turistas");
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
