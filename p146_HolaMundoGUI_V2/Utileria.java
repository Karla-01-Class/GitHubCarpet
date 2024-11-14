package p146_HolaMundoGUI_V2;

import java.io.*;
import java.util.ArrayList;

public class Utileria {
    public static ArrayList<Estudiante> inicializarDatos(){
        ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("Juan Perez", 22, 34.5, "jperez@gmail.com"));
        datos.add(new Estudiante("Maria Jimenez", 18, 22.5, "mjimenez@gmail.com"));
        datos.add(new Estudiante("Carlos Fuentes", 30, 22.5, "cfuentes@gmail.com"));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList <Estudiante> datos) throws IOException{
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Estudiante> desSeralizarDatos(String archivo) throws IOException, ClassNotFoundException{
        ArrayList<Estudiante> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Estudiante>)fpersonas.readObject();
        fpersonas.close();
        return datos;
    }
}
