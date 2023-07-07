package Modelo;

public class ViajesContratados {
    private int CodigoViajes;
    private int Turistas_CodigoTurista;
    private int Sucursales_CodigoSucursal;
    private int Estancias_CodigoEstancia;

    public ViajesContratados() {
    }
    
    public ViajesContratados(Object[] Registro) {
        CodigoViajes = Integer.parseInt(Registro[0].toString());
        Turistas_CodigoTurista = Integer.parseInt(Registro[1].toString());
        Sucursales_CodigoSucursal = Integer.parseInt(Registro[2].toString());
        Estancias_CodigoEstancia = Integer.parseInt(Registro[3].toString());
    }
    
    public Object[] getRegistro(){
        return new Object[]{CodigoViajes, Turistas_CodigoTurista, Sucursales_CodigoSucursal, Estancias_CodigoEstancia};
    }

    public int getCodigoViajes() {
        return CodigoViajes;
    }

    public void setCodigoViajes(int CodigoViajes) {
        this.CodigoViajes = CodigoViajes;
    }

    public int getTuristas_CodigoTurista() {
        return Turistas_CodigoTurista;
    }

    public void setTuristas_CodigoTurista(int Turistas_CodigoTurista) {
        this.Turistas_CodigoTurista = Turistas_CodigoTurista;
    }

    public int getSucursales_CodigoSucursal() {
        return Sucursales_CodigoSucursal;
    }

    public void setSucursales_CodigoSucursal(int Sucursales_CodigoSucursal) {
        this.Sucursales_CodigoSucursal = Sucursales_CodigoSucursal;
    }

    public int getEstancias_CodigoEstancia() {
        return Estancias_CodigoEstancia;
    }

    public void setEstancias_CodigoEstancia(int Estancias_CodigoEstancia) {
        this.Estancias_CodigoEstancia = Estancias_CodigoEstancia;
    }
    
}
