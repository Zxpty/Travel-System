package DAOs;

import AccesoBD.ConexionBD;
import Control.Arbol_ViajesContratados;
import Control.Nodo_ViajesContratados;
import Modelo.Estancias;
import Modelo.Sucursales;
import Modelo.Turistas;
import Modelo.ViajesContratados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class ViajesContratadosDAO {
    
     public static void Insertar(ViajesContratados Elemento) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into viajescontratados(CodigoViajes, Turistas_CodigoTurista, Sucursales_CodigoSucursal, Estancias_CodigoEstancia) value(?, ?, ?, ?)");
            ps.setInt(1, Elemento.getCodigoViajes());
            ps.setInt(2, Elemento.getTuristas_CodigoTurista());
            ps.setInt(3, Elemento.getSucursales_CodigoSucursal());
            ps.setInt(4, Elemento.getEstancias_CodigoEstancia());
            
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

    public static void ConsultarLista(Arbol_ViajesContratados objArbolViajesContratados) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from viajescontratados");
            ResultSet rs = ps.executeQuery();
            objArbolViajesContratados.setRaiz(null);
            while (rs.next()) {
                Object[] Registro = {rs.getInt(1), rs.getInt(2),
                    rs.getInt(3), rs.getInt(4)};
                ViajesContratados Elemento = new ViajesContratados(Registro);
                Nodo_ViajesContratados Raiz = objArbolViajesContratados.Agregar(objArbolViajesContratados.getRaiz(), Elemento);
                objArbolViajesContratados.setRaiz(Raiz);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarHashSucursales(HashMap objHash){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from sucursales");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro = {rs.getInt(1), rs.getString(2),
                    rs.getString(3)};
                Sucursales elemento = new Sucursales(registro);
                objHash.put(rs.getInt(1), elemento);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarHashTuristas(HashMap objHash){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from turistas");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro = {rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5)};
                Turistas elemento = new Turistas(registro);
                objHash.put(rs.getInt(1), elemento);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarHashEstancias(HashMap objHash){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from estancias");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro = {rs.getInt(1),
                                     rs.getString(2),
                                     rs.getString(3),
                                     rs.getString(4),
                                     rs.getInt(5),};
                Estancias Elemento = new Estancias(registro);
                objHash.put(rs.getInt(1), Elemento);
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
            PreparedStatement pst = cn.prepareStatement("select * from viajescontratados");
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
