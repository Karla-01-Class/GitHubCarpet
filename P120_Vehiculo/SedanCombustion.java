package P120_Vehiculo;

public class SedanCombustion extends Maquina implements AutomovilCombustionInterna, Sedan {
    public SedanCombustion(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void tipoMotorCombustion() {
        System.out.println("Es un automóvil de combustion interna es un Sedan");
    }

    @Override
    public void tipoCarroceria() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");
    }

    @Override
    public void tipoChasis() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");
    }
}