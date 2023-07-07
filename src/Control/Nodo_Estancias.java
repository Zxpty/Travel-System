package Control;

import Modelo.Estancias;

public class Nodo_Estancias {
    private Estancias Elemento;
    private Nodo_Estancias Izquierda, Derecha;
    
    public Nodo_Estancias(Estancias Elemento){
        this.Elemento = Elemento;
        Izquierda = Derecha = null;
    }

    public Estancias getElemento() {
        return Elemento;
    }

    public void setElemento(Estancias Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Estancias getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo_Estancias Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo_Estancias getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo_Estancias Derecha) {
        this.Derecha = Derecha;
    }

}
