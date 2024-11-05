package P120_Vehiculo;

public abstract class Maquina implements Vehiculo {
    protected String nombre;
    protected String propietario;
    protected int pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    @Override
    public void repostar() {
        System.out.println("Repostando ...");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando ...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando ...");
    }

    @Override
    public String toString() {
        return "Maquina [Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]";
    }
}
