package Control;

import Modelo.Turistas;

public class Nodo_Turistas {
    private Turistas elemento;
    private Nodo_Turistas izq, der;

    public Nodo_Turistas(Turistas elemento) {
        this.elemento = elemento;
        izq = der = null;
    }

    public Turistas getElemento() {
        return elemento;
    }

    public void setElemento(Turistas elemento) {
        this.elemento = elemento;
    }

    public Nodo_Turistas getIzq() {
        return izq;
    }

    public void setIzq(Nodo_Turistas izq) {
        this.izq = izq;
    }

    public Nodo_Turistas getDer() {
        return der;
    }

    public void setDer(Nodo_Turistas der) {
        this.der = der;
    }
    
}
