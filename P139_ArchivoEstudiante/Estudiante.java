package P139_ArchivoEstudiante;

import java.io.Serializable;

public class Estudiante implements Serializable{
    private String nombre;
    private int edad;
    private double promedio;
    private char sexo;

    public Estudiante(){

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", promedio=" + promedio + ", sexo=" + sexo + "]";
    }
}