package P120_Vehiculo;

public  class SedanElectrico extends Maquina implements AutomovilElectrico, Sedan {
    public SedanElectrico(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void tipoMotorElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es un Sedan");
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
