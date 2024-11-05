package P113_SegundoExamenParcial;

public abstract class Jugador {
    private String nombre;
    protected char Sexo;
    private String descripcion;
    protected static double Salario;
    protected double total;


    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.nombre = nombre;
        Sexo = sexo;
        this.descripcion = descripcion;
        Salario = salario;
    }

    public abstract double getBono();

    @Override
    public String toString() {
        return "Jugador [nombre = " + nombre + ", Sexo = " + Sexo + ", descripcion = " + descripcion + ", Salario = " + Salario
                + ", total = " + total + "]";
    }

    

    
    
}
