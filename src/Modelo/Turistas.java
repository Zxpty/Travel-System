package Modelo;

public class Turistas {
    private int CodigoTurista;
    private String NombreTurista;
    private String ApellidoTurista;
    private String DireccionTurista;
    private String TelefonoTurista;

    public Turistas() {
    }
    
    public Turistas(Object[] registro){
     CodigoTurista = Integer.parseInt(registro[0].toString());
     NombreTurista = registro[1].toString();
     ApellidoTurista = registro[2].toString();
     DireccionTurista = registro[3].toString();
     TelefonoTurista = registro[4].toString();
    }
    
    public Object[] getRegistro(){
        return new Object[]{CodigoTurista, NombreTurista, ApellidoTurista, DireccionTurista, TelefonoTurista};
    }
    
    public String getFiltro(){
        return CodigoTurista+NombreTurista+ApellidoTurista+DireccionTurista+TelefonoTurista;
    }

    public int getCodigoTurista() {
        return CodigoTurista;
    }

    public void setCodigoTurista(int CodigoTurista) {
        this.CodigoTurista = CodigoTurista;
    }

    public String getNombreTurista() {
        return NombreTurista;
    }

    public void setNombreTurista(String NombreTurista) {
        this.NombreTurista = NombreTurista;
    }

    public String getApellidoTurista() {
        return ApellidoTurista;
    }

    public void setApellidoTurista(String ApellidoTurista) {
        this.ApellidoTurista = ApellidoTurista;
    }

    public String getDireccionTurista() {
        return DireccionTurista;
    }

    public void setDireccionTurista(String DireccionTurista) {
        this.DireccionTurista = DireccionTurista;
    }

    public String getTelefonoTurista() {
        return TelefonoTurista;
    }

    public void setTelefonoTurista(String TelefonoTurista) {
        this.TelefonoTurista = TelefonoTurista;
    }
    
}
