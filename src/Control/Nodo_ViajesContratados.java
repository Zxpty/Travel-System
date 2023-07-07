package Control;

import Modelo.ViajesContratados;

public class Nodo_ViajesContratados {
    private ViajesContratados Elemento;
    private Nodo_ViajesContratados Izquierda, Derecha;
    
    public Nodo_ViajesContratados(ViajesContratados Elemento){
        this.Elemento = Elemento;
        Izquierda = Derecha = null;
    }

    public ViajesContratados getElemento() {
        return Elemento;
    }

    public void setElemento(ViajesContratados Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_ViajesContratados getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo_ViajesContratados Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo_ViajesContratados getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo_ViajesContratados Derecha) {
        this.Derecha = Derecha;
    }
    
}
