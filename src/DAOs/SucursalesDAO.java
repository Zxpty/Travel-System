package DAOs;

import AccesoBD.ConexionBD;
import Control.ArbolSucursales;
import Control.Nodo_Sucursales;
import Modelo.Sucursales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class SucursalesDAO {
    public static void Insertar(Sucursales elemento) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into sucursales(CodigoSucursal, DireccionSucursal, TelefonoSucursal) value(?, ?, ?)");
            ps.setInt(1, elemento.getCodigoSucursal());
            ps.setString(2, elemento.getDireccionSucursal());
            ps.setString(3, elemento.getTelefonoSucursal());
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

    public static void ConsultarLista(ArbolSucursales objArbolSucursales) {
        try {
            Connection cn = ConexionBD.obtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from Sucursales");
            ResultSet rs = ps.executeQuery();
            objArbolSucursales.setRaiz(null);
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2),
                    rs.getString(3)};
                Sucursales elemento = new Sucursales(registro);
                Nodo_Sucursales raiz = objArbolSucursales.Agregar(objArbolSucursales.getRaiz(), elemento);
                objArbolSucursales.setRaiz(raiz);
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
            PreparedStatement pst = cn.prepareStatement("select * from sucursales");
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
