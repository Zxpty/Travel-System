package Control;

import Modelo.Estancias;
import Modelo.Hoteles;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class Arbol_Estancias {
    private Nodo_Estancias Raiz;

    public Arbol_Estancias() {
        Raiz = null;
    }

    public Nodo_Estancias getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo_Estancias Raiz) {
        this.Raiz = Raiz;
    }
    
    public Nodo_Estancias Agregar(Nodo_Estancias Raiz, Estancias Elemento){
        if(Raiz == null){
            Nodo_Estancias Nuevo = new Nodo_Estancias(Elemento);
            return Nuevo;
        }else{
            if(Elemento.getCodigoEstancia() > Raiz.getElemento().getCodigoEstancia()){
                Raiz.setDerecha(Agregar(Raiz.getDerecha(), Elemento));
            }else if(Elemento.getCodigoEstancia() < Raiz.getElemento().getCodigoEstancia()){
                Raiz.setIzquierda(Agregar(Raiz.getIzquierda(), Elemento));            
            }else{
                JOptionPane.showMessageDialog(null, "Código de estancia ya existente");
            }
        }
        return Raiz;
    }
    
    public void Listar(JTable Control){
        String[] cabecera = {"Código", "Pensión", "Fecha Entrada", "Fecha Salida", "Código Hotel"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        Control.setModel(modtabla);
        Inorder(Raiz, modtabla);
    }
    
    public void Inorder(Nodo_Estancias Raiz, DefaultTableModel modtabla){
        if(Raiz != null){
            Inorder(Raiz.getIzquierda(), modtabla);
            modtabla.addRow(Raiz.getElemento().getRegistro());
            Inorder(Raiz.getDerecha(), modtabla);
        }
    }
    
    public void DatosHotel(JTextArea txa, Hoteles X){
        txa.setText("********************************************************************\n"+
                    "Código Hotel: "+X.getCodigoHotel()+"\n"+
                    "Nombre Hotel: "+X.getNombreHotel()+"\n"+
                    "Dirección: "+X.getDireccionHotel()+"\n"+
                    "Ciudad: "+X.getCiudadHotel()+"\n"+
                    "Teléfono: "+X.getTelefonoHotel()+"\n"+
                    "Plazas Hotel: "+X.getPlazasHotel()+"\n"+
                    "********************************************************************");
    }
}
