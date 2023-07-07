package Control;

import Modelo.Sucursales;

public class Nodo_Sucursales {
    private Sucursales Elemento;
    private Nodo_Sucursales Izquierda, Derecha;
    
    public Nodo_Sucursales(Sucursales Elemento){
        this.Elemento = Elemento;
        Izquierda = Derecha = null;
    }

    public Sucursales getElemento() {
        return Elemento;
    }

    public void setElemento(Sucursales Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Sucursales getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo_Sucursales Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo_Sucursales getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo_Sucursales Derecha) {
        this.Derecha = Derecha;
    }

}
