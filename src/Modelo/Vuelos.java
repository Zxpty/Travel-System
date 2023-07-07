package Modelo;

public class Vuelos {
    private int NumeroVuelo;
    private String FechaVuelo;
    private String HoraVuelo;
    private String OrigenVuelo;
    private String DestinoVuelo;
    private int PlazasTotales;
    private int PlazasTurista;

    public Vuelos() {
    }
    
    public Vuelos(Object[] Registro) {
        NumeroVuelo = Integer.parseInt(Registro[0].toString());
        FechaVuelo = Registro[1].toString();
        HoraVuelo = Registro[2].toString();
        OrigenVuelo = Registro[3].toString();
        DestinoVuelo = Registro[4].toString();
        PlazasTotales = Integer.parseInt(Registro[5].toString());
        PlazasTurista = Integer.parseInt(Registro[6].toString());
    }
    
    public Object[] getRegistro(){
        return new Object[]{NumeroVuelo, FechaVuelo, HoraVuelo, OrigenVuelo, DestinoVuelo, PlazasTotales, PlazasTurista};
    }

    public String getFiltro(){
        return NumeroVuelo+FechaVuelo+HoraVuelo+OrigenVuelo+DestinoVuelo+PlazasTotales+PlazasTurista;
    }
    
    public int getNumeroVuelo() {
        return NumeroVuelo;
    }

    public void setNumeroVuelo(int NumeroVuelo) {
        this.NumeroVuelo = NumeroVuelo;
    }

    public String getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(String FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }

    public String getHoraVuelo() {
        return HoraVuelo;
    }

    public void setHoraVuelo(String HoraVuelo) {
        this.HoraVuelo = HoraVuelo;
    }

    public String getOrigenVuelo() {
        return OrigenVuelo;
    }

    public void setOrigenVuelo(String OrigenVuelo) {
        this.OrigenVuelo = OrigenVuelo;
    }

    public String getDestinoVuelo() {
        return DestinoVuelo;
    }

    public void setDestinoVuelo(String DestinoVuelo) {
        this.DestinoVuelo = DestinoVuelo;
    }

    public int getPlazasTotales() {
        return PlazasTotales;
    }

    public void setPlazasTotales(int PlazasTotales) {
        this.PlazasTotales = PlazasTotales;
    }

    public int getPlazasTurista() {
        return PlazasTurista;
    }

    public void setPlazasTurista(int PlazasTurista) {
        this.PlazasTurista = PlazasTurista;
    }
    
}
