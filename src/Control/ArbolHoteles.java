package Control;

import Modelo.Hoteles;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArbolHoteles {
    private Nodo_Hoteles raiz;

    public ArbolHoteles() {
        raiz = null;
    }
    
    public Nodo_Hoteles Agregar(Nodo_Hoteles raiz, Hoteles elemento){
        if(raiz == null){
            Nodo_Hoteles nuevo = new Nodo_Hoteles(elemento);
            return nuevo;
        }else{
            if(elemento.getCodigoHotel()> raiz.getElemento().getCodigoHotel()){
                raiz.setDerecha(Agregar(raiz.getDerecha(), elemento));
            }else if(elemento.getCodigoHotel()< raiz.getElemento().getCodigoHotel()){
                raiz.setIzquierda(Agregar(raiz.getIzquierda(), elemento));
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo agregar hotel");
            }
        }
        return raiz;
    }
    
    public void listar(JTable control){
        String[] cabecera = {"Codigo", "Nombre", "Dirección", "Ciudad", "Telefono","Plazas"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOrder(raiz, modtabla);
    }
    
    public void InOrder(Nodo_Hoteles raiz, DefaultTableModel modtabla){
        if(raiz != null){
            InOrder(raiz.getIzquierda(), modtabla);
            modtabla.addRow(raiz.getElemento().getRegistro());
            InOrder(raiz.getDerecha(), modtabla);
        }
    }
    
    public void filtro(JTable control, String filtro){
        String[] cabecera = {"Codigo", "Nombre", "Dirección", "Ciudad", "Telefono","Plazas"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOrder(raiz, modtabla, filtro);
    }
    
    public void InOrder(Nodo_Hoteles raiz, DefaultTableModel modtabla, String filtro){
        if(raiz != null){
            InOrder(raiz.getIzquierda(), modtabla);
            if(raiz.getElemento().getFiltro().contains(filtro)){
                modtabla.addRow(raiz.getElemento().getRegistro());
            }
            InOrder(raiz.getDerecha(), modtabla);
        }
    }
    
    public Nodo_Hoteles BuscarCodigo(int codigo){
        Nodo_Hoteles raiz = this.raiz;
        while (raiz != null) {            
            if(raiz.getElemento().getCodigoHotel()== codigo){
                return raiz;
            }else if(codigo > raiz.getElemento().getCodigoHotel()){
                raiz = raiz.getDerecha();
            }else{
                raiz = raiz.getIzquierda();
            }
        }
        return null;
    }
    
    private Nodo_Hoteles EliminarMIzq(Nodo_Hoteles raiz){
        if(raiz == null){
            return null;
        }else if(raiz.getDerecha()!= null){
            raiz.setDerecha(EliminarMIzq(raiz.getDerecha()));
        }
        return raiz.getIzquierda();
    }
    
    private Nodo_Hoteles BuscarMIzq(Nodo_Hoteles raiz){
        if(raiz == null){
            while (raiz.getDerecha() != null) {                
                raiz = raiz.getDerecha();
            }
        }
        return raiz;
    }
    
    public Nodo_Hoteles Eliminar(Nodo_Hoteles raiz, int codigo){
        if(raiz == null){
            return null;
        }if(raiz.getElemento().getCodigoHotel()> codigo){
            raiz.setIzquierda(Eliminar(raiz.getIzquierda(), codigo));
        }else if(raiz.getElemento().getCodigoHotel() < codigo){
            raiz.setDerecha(Eliminar(raiz.getDerecha(), codigo));
        }else if(raiz.getIzquierda() != null && raiz.getDerecha()!= null){
            raiz.setElemento(BuscarMIzq(raiz.getIzquierda()).getElemento());
            raiz.setIzquierda(EliminarMIzq(raiz.getDerecha()));
        }else{
            raiz = (raiz.getIzquierda() != null) ? raiz.getIzquierda() : raiz.getDerecha();
        }
        return raiz;
    }
    
    public void ImprimirHash(Nodo_Hoteles Raiz, HashMap Hash){
        if(Raiz != null){
            ImprimirHash(Raiz.getIzquierda(), Hash);
            Hash.put(Raiz.getElemento().getCodigoHotel(), Raiz.getElemento());
            ImprimirHash(Raiz.getDerecha(), Hash);
        }
    }
    
    public Nodo_Hoteles getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo_Hoteles raiz) {
        this.raiz = raiz;
    }
}
