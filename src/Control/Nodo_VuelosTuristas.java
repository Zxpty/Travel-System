package Control;

import Modelo.VuelosTurista;

public class Nodo_VuelosTuristas {
    private VuelosTurista Elemento;
    private Nodo_VuelosTuristas Izquierda, Derecha;
    
    public Nodo_VuelosTuristas(VuelosTurista Elemento){
        this.Elemento = Elemento;
        Izquierda = Derecha = null;
    }

    public VuelosTurista getElemento() {
        return Elemento;
    }

    public void setElemento(VuelosTurista Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_VuelosTuristas getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo_VuelosTuristas Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo_VuelosTuristas getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo_VuelosTuristas Derecha) {
        this.Derecha = Derecha;
    }

}
