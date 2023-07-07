
package Control;

import Modelo.Estancias;
import Modelo.Hoteles;
import Modelo.Sucursales;
import Modelo.Turistas;
import Modelo.ViajesContratados;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class Arbol_ViajesContratados {
    private Nodo_ViajesContratados Raiz;
    
    public Arbol_ViajesContratados(){
        Raiz = null;
    }

    public Nodo_ViajesContratados getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo_ViajesContratados Raiz) {
        this.Raiz = Raiz;
    }
    
    public Nodo_ViajesContratados Agregar(Nodo_ViajesContratados raiz, ViajesContratados elemento){
        if(raiz == null){
            Nodo_ViajesContratados nuevo = new Nodo_ViajesContratados(elemento);
            return nuevo;
        }else{
            if(elemento.getCodigoViajes() > raiz.getElemento().getCodigoViajes()){
                raiz.setDerecha(Agregar(raiz.getDerecha(), elemento));
            }else if(elemento.getCodigoViajes() < raiz.getElemento().getCodigoViajes()){
                raiz.setIzquierda(Agregar(raiz.getIzquierda(), elemento));
            }else{
                JOptionPane.showMessageDialog(null, "No fue posible registrar a otro turista con el mismo ID");
            }
        }
        return raiz;
    }
    
    public void listar(JTable control){
        String[] cabecera = {"Codigo Viaje", "Código Turista", "Código Sucursal", "Código Estancia"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOrder(Raiz, modtabla);
    }
    
    public void InOrder(Nodo_ViajesContratados Raiz, DefaultTableModel modtabla){
        if(Raiz != null){
            InOrder(Raiz.getIzquierda(), modtabla);
            modtabla.addRow(Raiz.getElemento().getRegistro());
            InOrder(Raiz.getDerecha(), modtabla);
        }
    }
    
    public void DatosSucursal(JTextArea txa, Sucursales X){
        txa.setText("********************************************************************\n"+
                    "Código Sucursal: "+X.getCodigoSucursal()+"\n"+
                    "Dirección: "+X.getDireccionSucursal()+"\n"+
                    "Teléfono: "+X.getTelefonoSucursal()+"\n"+
                    "********************************************************************");
    }
    
    public void DatosTurista(JTextArea txa, Turistas X){
        txa.setText("********************************************************************\n"+
                    "Código Turista: "+X.getCodigoTurista()+"\n"+
                    "Nombres: "+X.getNombreTurista()+"\n"+
                    "Apellidos: "+X.getApellidoTurista()+"\n"+
                    "Dirección: "+X.getDireccionTurista()+"\n"+
                    "Teléfono: "+X.getTelefonoTurista()+"\n"+
                    "********************************************************************");
    }
    
    public void DatosEstancia(JTextArea txa, Estancias X, Hoteles Y){
        txa.setText("********************************************************************\n"+
                    "Código Estancia: "+X.getCodigoEstancia()+"\n"+
                    "Pensión: "+X.getPension()+"\n"+
                    "Fecha Entrada: "+X.getFechaEntrada()+"\n"+
                    "Fecha Salida: "+X.getFechaSalida()+"\n"+
                    "********************************************************************\n"+
                    "Código Hotel: "+X.getHoteles_CodigoHotel()+"\n"+
                    "Nombre Hotel: "+Y.getNombreHotel()+"\n"+
                    "Dirección: "+Y.getDireccionHotel()+"\n"+
                    "Ciudad: "+Y.getCiudadHotel()+"\n"+
                    "Teléfono: "+Y.getTelefonoHotel()+"\n"+
                    "Plazas Hotel: "+Y.getPlazasHotel()+"\n"+
                    "********************************************************************");
    }
}
