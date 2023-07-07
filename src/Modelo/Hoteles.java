package Modelo;

public class Hoteles {
    private int CodigoHotel;
    private String NombreHotel;
    private String DireccionHotel;
    private String CiudadHotel;
    private String TelefonoHotel;
    private int PlazasHotel;

    public Hoteles() {
    }
    
    public Hoteles(Object[] Registro) {
        CodigoHotel = Integer.parseInt(Registro[0].toString());
        NombreHotel = Registro[1].toString();
        DireccionHotel = Registro[2].toString();
        CiudadHotel = Registro[3].toString();
        TelefonoHotel = Registro[4].toString();
        PlazasHotel = Integer.parseInt(Registro[5].toString());
    }
    
    public Object[] getRegistro() {
        return new Object[] {CodigoHotel,NombreHotel,DireccionHotel,CiudadHotel,TelefonoHotel,PlazasHotel};
    }
    
    public String getFiltro(){
        return CodigoHotel+NombreHotel+DireccionHotel+CiudadHotel+TelefonoHotel+PlazasHotel;
    }

    public int getCodigoHotel() {
        return CodigoHotel;
    }

    public void setCodigoHotel(int CodigoHotel) {
        this.CodigoHotel = CodigoHotel;
    }

    public String getNombreHotel() {
        return NombreHotel;
    }

    public void setNombreHotel(String NombreHotel) {
        this.NombreHotel = NombreHotel;
    }

    public String getDireccionHotel() {
        return DireccionHotel;
    }

    public void setDireccionHotel(String DireccionHotel) {
        this.DireccionHotel = DireccionHotel;
    }

    public String getCiudadHotel() {
        return CiudadHotel;
    }

    public void setCiudadHotel(String CiudadHotel) {
        this.CiudadHotel = CiudadHotel;
    }

    public String getTelefonoHotel() {
        return TelefonoHotel;
    }

    public void setTelefonoHotel(String TelefonoHotel) {
        this.TelefonoHotel = TelefonoHotel;
    }

    public int getPlazasHotel() {
        return PlazasHotel;
    }

    public void setPlazasHotel(int PlazasHotel) {
        this.PlazasHotel = PlazasHotel;
    }

}
