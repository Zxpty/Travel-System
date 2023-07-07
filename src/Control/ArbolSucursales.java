package Control;

import Modelo.Sucursales;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArbolSucursales {
    private Nodo_Sucursales raiz;

    public ArbolSucursales() {
        raiz = null;
    }
    
    public Nodo_Sucursales Agregar(Nodo_Sucursales raiz, Sucursales elemento){
        if(raiz == null){
            Nodo_Sucursales nuevo = new Nodo_Sucursales(elemento);
            return nuevo;
        }else{
            if(elemento.getCodigoSucursal()> raiz.getElemento().getCodigoSucursal()){
                raiz.setDerecha(Agregar(raiz.getDerecha(), elemento));
            }else if(elemento.getCodigoSucursal() < raiz.getElemento().getCodigoSucursal()){
                raiz.setIzquierda(Agregar(raiz.getIzquierda(), elemento));
            }else{
                JOptionPane.showMessageDialog(null, "No fue posible registrar otra sucursal con el mismo ID");
            }
        }
        return raiz;
    }
    
    public void listar(JTable control){
        String[] cabecera = {"Codigo", "Direccion", "Telefono"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOrder(raiz, modtabla);
    }
    
    public void InOrder(Nodo_Sucursales raiz, DefaultTableModel modtabla){
        if(raiz != null){
            InOrder(raiz.getIzquierda(), modtabla);
            modtabla.addRow(raiz.getElemento().getRegistro());
            InOrder(raiz.getDerecha(), modtabla);
        }
    }

    public Nodo_Sucursales getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo_Sucursales raiz) {
        this.raiz = raiz;
    }
}
