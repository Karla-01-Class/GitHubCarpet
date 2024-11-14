package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Utileria {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Luis Suarez", 34, 'M', "Casado", "Delantero", 80000));
        datos.add(new Jugador("Ana López", 28, 'F', "Soltera", "Defensa", 60000));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(datos);
        }
    }

    public static ArrayList<Jugador> desSeralizarDatos(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Jugador>) entrada.readObject();
        }
    }
}
