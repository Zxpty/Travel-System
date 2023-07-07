package Control;

import Modelo.Estancias;
import Modelo.Hoteles;
import Modelo.Sucursales;
import Modelo.Turistas;
import Modelo.ViajesContratados;
import Modelo.Vuelos;
import Modelo.VuelosTurista;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class Arbol_VuelosTuristicos {

    private Nodo_VuelosTuristas Raiz;

    public Arbol_VuelosTuristicos() {
        Raiz = null;
    }

    public Nodo_VuelosTuristas getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo_VuelosTuristas Raiz) {
        this.Raiz = Raiz;
    }

    public Nodo_VuelosTuristas Agregar(Nodo_VuelosTuristas Raiz, VuelosTurista Elemento) {
        if (Raiz == null) {
            Nodo_VuelosTuristas Nuevo = new Nodo_VuelosTuristas(Elemento);
            return Nuevo;
        } else {
            if (Elemento.getCodigoVuelo() > Raiz.getElemento().getCodigoVuelo()) {
                Raiz.setDerecha(Agregar(Raiz.getDerecha(), Elemento));
            } else if (Elemento.getCodigoVuelo() < Raiz.getElemento().getCodigoVuelo()) {
                Raiz.setIzquierda(Agregar(Raiz.getIzquierda(), Elemento));
            } else {
                JOptionPane.showMessageDialog(null, "No fue posible registrar otro vuelo con el mismo Codigo");
            }
        }
        return Raiz;
    }

    public void listar(JTable control) {
        String[] cabecera = {"Codigo", "Clase", "Numero de Vuelo", "Codigo de Viajes"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOrder(Raiz, modtabla);
    }

    public void InOrder(Nodo_VuelosTuristas Raiz, DefaultTableModel modtabla) {
        if (Raiz != null) {
            InOrder(Raiz.getIzquierda(), modtabla);
            modtabla.addRow(Raiz.getElemento().getRegistro());
            InOrder(Raiz.getDerecha(), modtabla);
        }
    }
    
    public void filtro(JTable control, String filtro) {
        String[] cabecera = {"Codigo", "Clase", "Numero de Vuelo", "Codigo de Viajes"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);
        InOrder(Raiz, modtabla, filtro);
    }

    public void InOrder(Nodo_VuelosTuristas Raiz, DefaultTableModel modtabla, String filtro) {
        if (Raiz != null) {
            InOrder(Raiz.getIzquierda(), modtabla);
            if(Raiz.getElemento().getFiltro().contains(filtro)){
                modtabla.addRow(Raiz.getElemento().getRegistro());
            }
            InOrder(Raiz.getDerecha(), modtabla);
        }
    }

    public Nodo_VuelosTuristas BuscarCodigo(int codigo) {
        Nodo_VuelosTuristas Raiz = this.Raiz;
        while (Raiz != null) {
            if (Raiz.getElemento().getCodigoVuelo() == codigo) {
                return Raiz;
            } else if (codigo > Raiz.getElemento().getCodigoVuelo()) {
                Raiz = Raiz.getDerecha();
            } else {
                Raiz = Raiz.getIzquierda();
            }
        }
        return null;
    }

    private Nodo_VuelosTuristas EliminarMIzq(Nodo_VuelosTuristas Raiz) {
        if (Raiz == null) {
            return null;
        } else if (Raiz.getDerecha() != null) {
            Raiz.setDerecha(EliminarMIzq(Raiz.getDerecha()));
        }
        return Raiz.getIzquierda();
    }

    private Nodo_VuelosTuristas BuscarMIzq(Nodo_VuelosTuristas Raiz) {
        if (Raiz == null) {
            while (Raiz.getDerecha() != null) {
                Raiz = Raiz.getDerecha();
            }
        }
        return Raiz;
    }

    public Nodo_VuelosTuristas Eliminar(Nodo_VuelosTuristas Raiz, int codigo) {
        if (Raiz == null) {
            return null;
        }
        if (Raiz.getElemento().getCodigoVuelo() > codigo) {
            Raiz.setIzquierda(Eliminar(Raiz.getIzquierda(), codigo));
        } else if (Raiz.getElemento().getCodigoVuelo() < codigo) {
            Raiz.setDerecha(Eliminar(Raiz.getDerecha(), codigo));
        } else if (Raiz.getIzquierda() != null && Raiz.getDerecha() != null) {
            Raiz.setElemento(BuscarMIzq(Raiz.getIzquierda()).getElemento());
            Raiz.setIzquierda(EliminarMIzq(Raiz.getDerecha()));
        } else {
            Raiz = (Raiz.getIzquierda() != null) ? Raiz.getIzquierda() : Raiz.getDerecha();
        }
        return Raiz;
    }
    
    public void DatosVuelo(JTextArea txa, Vuelos X){
        txa.setText("********************************************************************\n"+
                    "Número Vuelo: "+X.getNumeroVuelo()+"\n"+
                    "Fecha Vuelo: "+X.getFechaVuelo()+"\n"+
                    "Hora Vuelo: "+X.getHoraVuelo()+"\n"+
                    "Origen: "+X.getOrigenVuelo()+"\n"+
                    "Destino: "+X.getDestinoVuelo()+"\n"+
                    "Plazas Totales: "+X.getPlazasTotales()+"\n"+
                    "Plaza Turista: "+X.getPlazasTurista()+"\n"+
                    "********************************************************************");
    }
    
    public void DatosVC(JTextArea txa, ViajesContratados A, Estancias B, Hoteles C, Sucursales D, Turistas E){
        txa.setText("********************************************************************\n"+
                    "Código Viaje Contratado: "+A.getCodigoViajes()+"\n"+
                    "********************************************************************\n"+
                    "Código Turista: "+A.getTuristas_CodigoTurista()+"\n"+
                    "Nombres: "+E.getNombreTurista()+"\n"+
                    "Apellidos: "+E.getApellidoTurista()+"\n"+
                    "Dirección: "+E.getDireccionTurista()+"\n"+
                    "Teléfono: "+E.getTelefonoTurista()+"\n"+
                    "********************************************************************\n"+
                    "Código Sucursal: "+A.getSucursales_CodigoSucursal()+"\n"+
                    "Dirección: "+D.getDireccionSucursal()+"\n"+
                    "Teléfono: "+D.getTelefonoSucursal()+"\n"+
                    "********************************************************************\n"+
                    "Código Estancia: "+A.getEstancias_CodigoEstancia()+"\n"+
                    "Pensión: "+B.getPension()+"\n"+
                    "Fecha Entrada: "+B.getFechaEntrada()+"\n"+
                    "Fecha Salida: "+B.getFechaSalida()+"\n"+
                    "********************************************************************\n"+
                    "Código Hotel: "+B.getHoteles_CodigoHotel()+"\n"+
                    "Nombre Hotel: "+C.getNombreHotel()+"\n"+
                    "Dirección: "+C.getDireccionHotel()+"\n"+
                    "Ciudad: "+C.getCiudadHotel()+"\n"+
                    "Teléfono: "+C.getTelefonoHotel()+"\n"+
                    "Plazas Hotel: "+C.getPlazasHotel()+"\n"+
                    "********************************************************************");
    }
}
