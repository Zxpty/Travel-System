package Control;

import Modelo.Hoteles;

public class Nodo_Hoteles {
    private Hoteles Elemento;
    private Nodo_Hoteles Izquierda, Derecha;
    
    public Nodo_Hoteles(Hoteles Elemento){
        this.Elemento = Elemento;
        Izquierda = Derecha = null;
    }

    public Hoteles getElemento() {
        return Elemento;
    }

    public void setElemento(Hoteles Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Hoteles getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo_Hoteles Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo_Hoteles getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo_Hoteles Derecha) {
        this.Derecha = Derecha;
    }
    
}
