package P120_Vehiculo;

public class SuvElectrico extends Maquina implements AutomovilElectrico, Suv {
    public SuvElectrico(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void tipoMotorElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es una Suv");
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