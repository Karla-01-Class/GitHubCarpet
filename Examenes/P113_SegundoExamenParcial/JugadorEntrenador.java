package P113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int subordinados;
    private int proyectos;

    
    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados,
            int proyectos) {
        super(nombre, sexo, descripcion, salario);
        this.subordinados = subordinados;
        this.proyectos = proyectos;
    }
    
    @Override
    public double getBono() {
        return (Salario * 0.15) + (proyectos * 100) + (subordinados * 10);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Subordinados: " + subordinados + "\n" +
               "Proyectos: " + proyectos + "\n" +
               "Bono: " + getBono();
    }
}
