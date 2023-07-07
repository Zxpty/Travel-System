package Control;

import Modelo.Vuelos;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArbolVuelos {
    private Nodo_Vuelos raiz;
    
    public ArbolVuelos(){
        raiz = null;
    }

    public Nodo_Vuelos getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo_Vuelos raiz) {
        this.raiz = raiz;
    }
    
    public Nodo_Vuelos Agregar(Nodo_Vuelos raiz, Vuelos elemento){
        if(raiz == null){
            Nodo_Vuelos nuevo = new Nodo_Vuelos(elemento);
            return nuevo;
        }else{
            if(elemento.getNumeroVuelo() > raiz.getElemento().getNumeroVuelo()){
                raiz.setDerecha(Agregar(raiz.getDerecha(), elemento));
            }else if(elemento.getNumeroVuelo() < raiz.getElemento().getNumeroVuelo()){
                raiz.setIzquierda(Agregar(raiz.getIzquierda(), elemento));
            }else{
                JOptionPane.showMessageDialog(null, "No fue posible registrar otro vuelo con el mismo número de vuelo");
            }
        }
        return raiz;
    }
    
    public void listar(JTable control){
        String[] cabecera = {"Numero", "Fecha", "Hora", "Origen", "Destino", "PlazasTotales", "PlazasTurista"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOnder(raiz, modtabla);
    }
    
    public void InOnder(Nodo_Vuelos raiz, DefaultTableModel modtabla){
        if(raiz != null){
            InOnder(raiz.getIzquierda(), modtabla);
            modtabla.addRow(raiz.getElemento().getRegistro());
            InOnder(raiz.getDerecha(), modtabla);
        }
    }
    
    public void filtro(JTable control, String filtro){
        String[] cabecera = {"Numero", "Fecha", "Hora", "Origen", "Destino", "PlazasTotales", "PlazasTurista"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOnder(raiz, modtabla, filtro);
    }
    
    public void InOnder(Nodo_Vuelos raiz, DefaultTableModel modtabla, String filtro){
        if(raiz != null){
            InOnder(raiz.getIzquierda(), modtabla);
            if(raiz.getElemento().getFiltro().contains(filtro)){
                modtabla.addRow(raiz.getElemento().getRegistro());
            }
            InOnder(raiz.getDerecha(), modtabla);
        }
    }
    
    public Nodo_Vuelos BuscarCodigo(int codigo){
        Nodo_Vuelos raiz = this.raiz;
        while(raiz != null){
            if(raiz.getElemento().getNumeroVuelo() == codigo){
                return raiz;
            }else if(codigo > raiz.getElemento().getNumeroVuelo()){
                raiz = raiz.getDerecha();
            }else{
                raiz = raiz.getIzquierda();
            }
        }
        return null;
    }
    
    private Nodo_Vuelos EliminarMIzq(Nodo_Vuelos raiz){
        if(raiz == null){
            return null;
        }else if(raiz.getDerecha() != null){
            raiz.setDerecha(EliminarMIzq(raiz.getDerecha()));
        }
        return raiz.getIzquierda();
    }
    
    private Nodo_Vuelos BuscarMIzq(Nodo_Vuelos raiz){
        if(raiz == null){
            while (raiz.getDerecha()!= null) {                
                raiz = raiz.getDerecha();
            }
        }
        return raiz;
    }
    
    public Nodo_Vuelos Eliminar(Nodo_Vuelos raiz, int codigo){
        if(raiz == null){
            return null;
        }if(raiz.getElemento().getNumeroVuelo() > codigo){
            raiz.setIzquierda(Eliminar(raiz.getIzquierda(), codigo));
        }else if(raiz.getElemento().getNumeroVuelo() < codigo){
            raiz.setDerecha(Eliminar(raiz.getDerecha(), codigo));
        }else if(raiz.getIzquierda() != null && raiz.getDerecha() != null){
            raiz.setElemento(BuscarMIzq(raiz.getIzquierda()).getElemento());
            raiz.setIzquierda(EliminarMIzq(raiz.getDerecha()));
        }else{
            raiz = (raiz.getIzquierda() != null) ? raiz.getIzquierda() : raiz.getDerecha();
        }
        return raiz;
    }
}
