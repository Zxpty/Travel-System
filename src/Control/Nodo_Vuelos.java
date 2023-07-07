package Control;

import Modelo.Vuelos;

public class Nodo_Vuelos {
    private Vuelos Elemento;
    private Nodo_Vuelos Izquierda, Derecha;
    
    public Nodo_Vuelos(Vuelos Elemento){
        this.Elemento = Elemento;
        Izquierda = Derecha = null;
    }

    public Vuelos getElemento() {
        return Elemento;
    }

    public void setElemento(Vuelos Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Vuelos getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo_Vuelos Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo_Vuelos getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo_Vuelos Derecha) {
        this.Derecha = Derecha;
    }
    
}
