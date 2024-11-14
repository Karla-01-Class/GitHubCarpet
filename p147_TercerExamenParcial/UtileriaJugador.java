package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UtileriaJugador {
    // Lista que contendrá los jugadores cargados desde el archivo.
    public static List<Jugador> cargarJugadores(String archivo) {
        List<Jugador> jugadores = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            jugadores = (List<Jugador>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los jugadores: " + e.getMessage());
        }
        return jugadores;
    }

    public static void guardarJugadores(List<Jugador> jugadores, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            // Escribe la lista de jugadores en el archivo.
            oos.writeObject(jugadores);
        } catch (IOException e) {
            System.out.println("Error al guardar los jugadores: " + e.getMessage());
        }
    }
}
