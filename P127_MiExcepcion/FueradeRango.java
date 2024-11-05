package P127_MiExcepcion;

public class FueradeRango extends Exception{
    public FueradeRango(String error){
        super(error);
    }
}