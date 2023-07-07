package Control;

import Modelo.Turistas;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArbolTuristas {
    private Nodo_Turistas raiz;

    public ArbolTuristas() {
        raiz = null;
    }
    
    public Nodo_Turistas Agregar(Nodo_Turistas raiz, Turistas elemento){
        if(raiz == null){
            Nodo_Turistas nuevo = new Nodo_Turistas(elemento);
            return nuevo;
        }else{
            if(elemento.getCodigoTurista() > raiz.getElemento().getCodigoTurista()){
                raiz.setDer(Agregar(raiz.getDer(), elemento));
            }else if(elemento.getCodigoTurista() < raiz.getElemento().getCodigoTurista()){
                raiz.setIzq(Agregar(raiz.getIzq(), elemento));
            }else{
                JOptionPane.showMessageDialog(null, "No fue posible registrar a otro turista con el mismo ID");
            }
        }
        return raiz;
    }
    
    public void listar(JTable control){
        String[] cabecera = {"Codigo", "Nombre", "Apellidos", "Direccion", "Telefono"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOrder(raiz, modtabla);
    }
    
    public void InOrder(Nodo_Turistas raiz, DefaultTableModel modtabla){
        if(raiz != null){
            InOrder(raiz.getIzq(), modtabla);
            modtabla.addRow(raiz.getElemento().getRegistro());
            InOrder(raiz.getDer(), modtabla);
        }
    }
    
    public void filtro(JTable control, String filtro){
        String[] cabecera = {"Codigo", "Nombre", "Apellidos", "Direccion", "Telefono"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOrder(raiz, modtabla, filtro);
    }
    
    public void InOrder(Nodo_Turistas raiz, DefaultTableModel modtabla, String filtro){
        if(raiz != null){
            InOrder(raiz.getIzq(), modtabla);
            if(raiz.getElemento().getFiltro().contains(filtro)){
                modtabla.addRow(raiz.getElemento().getRegistro());
            }
            InOrder(raiz.getDer(), modtabla);
        }
    }

    public Nodo_Turistas BuscarCodigo(int codigo){
        Nodo_Turistas raiz = this.raiz;
        while (raiz != null) {            
            if(raiz.getElemento().getCodigoTurista() == codigo){
                return raiz;
            }else if(codigo > raiz.getElemento().getCodigoTurista()){
                raiz = raiz.getDer();
            }else{
                raiz = raiz.getIzq();
            }
        }
        return null;
    }
    
    private Nodo_Turistas EliminarMIzq(Nodo_Turistas raiz){
        if(raiz == null){
            return null;
        }else if(raiz.getDer() != null){
            raiz.setDer(EliminarMIzq(raiz.getDer()));
        }
        return raiz.getIzq();
    }
    
    private Nodo_Turistas BuscarMIzq(Nodo_Turistas raiz){
        if(raiz == null){
            while (raiz.getDer() != null) {                
                raiz = raiz.getDer();
            }
        }
        return raiz;
    }
    
    public Nodo_Turistas Eliminar(Nodo_Turistas raiz, int codigo){
        if(raiz == null){
            return null;
        }if(raiz.getElemento().getCodigoTurista() < codigo){
            raiz.setDer(Eliminar(raiz.getDer(), codigo));
        }else if(raiz.getElemento().getCodigoTurista() > codigo){
            raiz.setIzq(Eliminar(raiz.getIzq(), codigo));
        }else if(raiz.getIzq() != null && raiz.getDer() != null){
            raiz.setElemento(BuscarMIzq(raiz.getIzq()).getElemento());
            raiz.setIzq(EliminarMIzq(raiz.getDer()));
        }else{
            raiz = (raiz.getIzq() != null) ? raiz.getIzq() : raiz.getDer();
        }
        return raiz;
    }
    
    public Nodo_Turistas getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo_Turistas raiz) {
        this.raiz = raiz;
    }
    
}
