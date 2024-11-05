package P120_Vehiculo;

public class SuvCombustion extends Maquina implements AutomovilCombustionInterna, Suv {
    public SuvCombustion(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void tipoMotorCombustion() {
        System.out.println("Es un automóvil de combustion interna es una Suv");
    }

    @Override
    public void tipoTraccion() {
        System.out.println("Es un autómovil con tracción 4 x 4 es una Suv");
    }

    @Override
    public void tipoChasis() {
        System.out.println("Es un autómovil con chaisis independiente es una Suv");
    }
}