package P113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }



    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.total;
        }
        return total;
    }

    public int getTotalH() {
        int countHombres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.Sexo == 'H') {
                countHombres++;
            }
        }
        return countHombres;
    }

    public int getTotalM() {
        int countMujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.Sexo == 'M') {
                countMujeres++;
            }
        }
        return countMujeres;
    }

    public void reporte() {
        System.out.printf("Equipo [Nombre=%s, Liga=%s, Jugadores=%d, Bono=%.2f, Total=%.2f, Hombres=%d, Mujeres=%d]%n",
                nombre, liga, jugadores.size(), getTotalBono(), getTotal(), getTotalH(), getTotalM());
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public String toString() {
        return String.format("Equipo [Nombre=%s, Liga=%s, Jugadores=%d]", nombre, liga, jugadores.size());
    }
}
