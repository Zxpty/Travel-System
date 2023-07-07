package DAOs;

import AccesoBD.ConexionBD;
import Control.Arbol_VuelosTuristicos;
import Control.Nodo_VuelosTuristas;
import Modelo.ViajesContratados;
import Modelo.Vuelos;
import Modelo.VuelosTurista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class VuelosTuristicosDAO {
    public static void Insertar(VuelosTurista Elemento) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into vuelosturisticos(CodigoVuelo, Clase, Vuelos_NumeroVuelo, ViajesContratados_CodigoViajes) value(?, ?, ?, ?)");
            ps.setInt(1, Elemento.getCodigoVuelo());
            ps.setString(2, Elemento.getClase());
            ps.setInt(3, Elemento.getVuelos_NumeroVuelo());
            ps.setInt(4, Elemento.getViajesContratados_CodigoViaje());
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

    public static void ConsultarLista(Arbol_VuelosTuristicos objArbolVuelosTuristicos) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from vuelosturisticos");
            ResultSet rs = ps.executeQuery();
            objArbolVuelosTuristicos.setRaiz(null);
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2),
                    rs.getInt(3), rs.getInt(4)};
                VuelosTurista Elemento = new VuelosTurista(registro);
                Nodo_VuelosTuristas Raiz = objArbolVuelosTuristicos.Agregar(objArbolVuelosTuristicos.getRaiz(), Elemento);
                objArbolVuelosTuristicos.setRaiz(Raiz);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarHashVuelos(HashMap objHash){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from vuelos");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3) ,rs.getString(4),
                    rs.getString(5), rs.getInt(6), rs.getInt(7)};
                Vuelos elemento = new Vuelos(registro);
                objHash.put(rs.getInt(1), elemento);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarHashVC(HashMap objHash){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from viajescontratados");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] Registro = {rs.getInt(1), rs.getInt(2),
                    rs.getInt(3), rs.getInt(4)};
                ViajesContratados Elemento = new ViajesContratados(Registro);
                objHash.put(rs.getInt(1), Elemento);
            }
            rs.close();
            ps.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Actualizar(VuelosTurista Elemento){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update vuelosturisticos set  Clase = ?, Vuelos_NumeroVuelo = ?, ViajesContratados_CodigoViajes = ? where CodigoVuelo = ?");
            ps.setString(1, Elemento.getClase());
            ps.setInt(2, Elemento.getVuelos_NumeroVuelo());
            ps.setInt(3, Elemento.getViajesContratados_CodigoViaje());
            ps.setInt(4, Elemento.getCodigoVuelo());
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
    
    public static void Eliminar(VuelosTurista Elemento){
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement pst = cn.prepareStatement("delete from vuelosturisticos where CodigoVuelo = ?");
            pst.setInt(1, Elemento.getCodigoVuelo());
            int rpta = pst.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null, "La Eliminacion del Vuelo fue Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "La Eliminacion no se pudo realizar");
            }
            pst.close();
            ConexionBD.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
