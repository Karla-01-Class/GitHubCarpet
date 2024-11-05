package P131_ExcepcionTemperatura;

public class TemperturaExcesiva extends Exception{
    public TemperturaExcesiva(String error){
        super(error);
    }
}