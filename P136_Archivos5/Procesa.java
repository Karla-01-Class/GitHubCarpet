package P136_Archivos5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    public static void capturaDatos(ArrayList<Persona> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce de una Persona (nombre vacio para terminar)> ");
        while (true) {
            Persona persona = new Persona();
            System.out.println("\nDatos de la persona>");
            System.out.print("Nombre : ");
            persona.setNombre(obj.nextLine());
            if (persona.getNombre().isEmpty())
                break;
            System.out.print("Edad : ");
            persona.setEdad(obj.nextInt());
            System.out.print("Peso : ");
            persona.setPeso(obj.nextDouble());
            obj.nextLine();
            System.out.print("Correo : ");
            persona.setCorreo(obj.nextLine());
            datos.add(persona);
        }
        obj.close();
    }

    public static void grabarDatos(String archivo, ArrayList<Persona> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fdatos = new ObjectOutputStream(arch);
        fdatos.writeObject(datos);
        fdatos.close();

    }

    public static ArrayList<Persona> leerDatos(String archivo) throws IOException,
            ClassNotFoundException {
        ArrayList<Persona> datos = new ArrayList<>();
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fdatos = new ObjectInputStream(arch);
        datos = (ArrayList<Persona>) fdatos.readObject();
        fdatos.close();
        return datos;
    }

    public static void mostrarDatos(ArrayList<Persona> datos) {
        System.out.println("\nLos datos hasta el momento:");
        for (Persona dato : datos) {

            System.out.println(dato);

        }
    }
    
}
