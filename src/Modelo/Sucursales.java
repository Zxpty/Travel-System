package Modelo;

public class Sucursales {
    private int CodigoSucursal;
    private String DireccionSucursal;
    private String TelefonoSucursal;

    public Sucursales() {
    }
    
    public Sucursales(Object[] Registro) {
        CodigoSucursal = Integer.parseInt(Registro[0].toString());
        DireccionSucursal = Registro[1].toString();
        TelefonoSucursal = Registro[2].toString();
    }
    
    public Object[] getRegistro(){
        return new Object[]{CodigoSucursal, DireccionSucursal, TelefonoSucursal};
    }

    public int getCodigoSucursal() {
        return CodigoSucursal;
    }

    public void setCodigoSucursal(int CodigoSucursal) {
        this.CodigoSucursal = CodigoSucursal;
    }

    public String getDireccionSucursal() {
        return DireccionSucursal;
    }

    public void setDireccionSucursal(String DireccionSucursal) {
        this.DireccionSucursal = DireccionSucursal;
    }

    public String getTelefonoSucursal() {
        return TelefonoSucursal;
    }

    public void setTelefonoSucursal(String TelefonoSucursal) {
        this.TelefonoSucursal = TelefonoSucursal;
    }
    
}
