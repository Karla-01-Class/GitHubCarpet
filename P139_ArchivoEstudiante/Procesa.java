package P139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    public static void capturaDatos(ArrayList<Estudiante> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce un Estudiante (nombre vacio para terminar)");
        while (true) {
            Estudiante dato = new Estudiante();
            System.out.println("\nDatos del estudiante");
            System.out.print("Nombre : ");
            dato.setNombre(obj.nextLine());
            if (dato.getNombre().isEmpty())
                break;
            System.out.print("Edad : ");
            dato.setEdad(obj.nextInt());
            System.out.print("Promedio : ");
            dato.setPromedio(obj.nextDouble());
            obj.nextLine();
            System.out.print("Sexo [H] o [M]: ");
            dato.setSexo(Character.toUpperCase(obj.next().charAt(0)));
            obj.nextLine();
            datos.add(dato);
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fdatos = new ObjectOutputStream(arch);
        fdatos.writeObject(datos);
        fdatos.close();

    }

    public static ArrayList<Estudiante> leerDatos(String archivo) throws IOException,
            ClassNotFoundException {
        ArrayList<Estudiante> datos = new ArrayList<>();
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fdatos = new ObjectInputStream(arch);
        datos = (ArrayList<Estudiante>) fdatos.readObject();
        fdatos.close();
        return datos;
    }

    public static void mostrarDatos(ArrayList<Estudiante> datos) {
        System.out.println("\nLos datos hasta el momento:");
        for (Estudiante dato : datos) {
            System.out.println(dato);
        }
    }

    public static void promedioCalificaciones(ArrayList<Estudiante> datos) {
        double totalPromedio = 0;
        for (Estudiante dato : datos) {
            totalPromedio += dato.getPromedio();
        }
        System.out.println("Promedio de calificaciones: " + (totalPromedio / datos.size()));
    }

    public static void promedioEdades(ArrayList<Estudiante> datos) {
        int totalEdad = 0;
        for (Estudiante dato : datos) {
            totalEdad += dato.getEdad(); 
        }
        if (!datos.isEmpty()) {
            System.out.println("Promedio de edades: " + (totalEdad / datos.size()));
        } else {
            System.out.println("No hay datos para calcular el promedio de edades.");
        }
    }
    

    public static void cantidadHombres(ArrayList<Estudiante> datos) {
        int hombres = 0;
        for (Estudiante dato : datos) {
            if (dato.getSexo() == 'H') {
                hombres++;
            }
        }
        System.out.println("Cantidad de hombres: " + hombres);
    }

    public static void cantidadMujeres(ArrayList<Estudiante> datos) {
        int mujeres = 0;
        for (Estudiante dato : datos) {
            if (dato.getSexo() == 'H') {
                mujeres++;
            }
        }
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
}