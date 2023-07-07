package Modelo;

public class VuelosTurista {

    private int CodigoVuelo;
    private String Clase;
    private int Vuelos_NumeroVuelo;
    private int ViajesContratados_CodigoViaje;

    public VuelosTurista() {
        
    }
    
    public VuelosTurista(Object[] registro) {
        CodigoVuelo = Integer.parseInt(registro[0].toString());
        Clase = registro[1].toString();
        Vuelos_NumeroVuelo = Integer.parseInt(registro[2].toString());
        ViajesContratados_CodigoViaje = Integer.parseInt(registro[3].toString());
    }

    public Object[] getRegistro() {
        return new Object[]{CodigoVuelo, Clase, Vuelos_NumeroVuelo, ViajesContratados_CodigoViaje};
    }
    
    public String getFiltro(){
        return CodigoVuelo+Clase+Vuelos_NumeroVuelo+ViajesContratados_CodigoViaje;
    }

    public int getCodigoVuelo() {
        return CodigoVuelo;
    }

    public void setCodigoVuelo(int CodigoVuelo) {
        this.CodigoVuelo = CodigoVuelo;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public int getVuelos_NumeroVuelo() {
        return Vuelos_NumeroVuelo;
    }

    public void setVuelos_NumeroVuelo(int Vuelos_NumeroVuelo) {
        this.Vuelos_NumeroVuelo = Vuelos_NumeroVuelo;
    }

    public int getViajesContratados_CodigoViaje() {
        return ViajesContratados_CodigoViaje;
    }

    public void setViajesContratados_CodigoViaje(int ViajesContratados_CodigoViaje) {
        this.ViajesContratados_CodigoViaje = ViajesContratados_CodigoViaje;
    }

}
