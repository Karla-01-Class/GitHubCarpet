package P139_ArchivoEstudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        String archivo = "datos.dat";
        ArrayList<Estudiante> datos = new ArrayList<>();
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("-------- Procesamiento de datos --------");
            System.out.println("Capturar datos ................................... [ 1 ]");
            System.out.println("Grabar datos en archivo .......................... [ 2 ]");
            System.out.println("Leer datos de archivo ............................ [ 3 ]");
            System.out.println("Mostrar datos .................................... [ 4 ]");
            System.out.println("Calcular y mostrar promedio de calificaciones..... [ 5 ]");
            System.out.println("Calcular y mostrar promedio de edades............. [ 6 ]");
            System.out.println("Mostrar cantidad de hombres....................... [ 7 ]");
            System.out.println("Mostrar cantidad de mujeres....................... [ 8 ]");
            System.out.println("Salir ............................................ [ 9 ]");
            System.out.print("\nElije opcion ? ");
            op = obj.nextInt();

            switch (op) {
                case 1:
                    if (datos.size() == 0)
                        System.out.println("\nSe capturan datos por primera vez");
                    else
                        System.out.println("\nLos datos a capturar se agregan a los datos existentes");
                    Procesa.capturaDatos(datos);
                    break;
                case 2:
                    try {
                        if (datos.size() != 0) {
                            Procesa.grabarDatos(archivo, datos);
                            System.out.println("\nDatos grabados correctamente ..");
                        } else
                            System.out.println("\nNo hay datos para grabar, captura datos antes");
                    } catch (Exception e) {
                        System.out.println("\nError al grabar los datos en el archivo");
                    }
                    break;
                case 3:
                    try {
                        datos = Procesa.leerDatos(archivo);
                        System.out.println("\nDatos cargados correctamente ..");

                    } catch (Exception e) {

                        System.out.println("\nError al leer archivo");

                    }
                    break;
                case 4:
                    if (datos.size() != 0)
                        Procesa.mostrarDatos(datos);
                    else
                        System.out.println("\nNo hay datos para mostrar, captura datos o lee datos del disco");
                    break;
                case 5:
                        Procesa.promedioCalificaciones(datos);
                    break;
                case 6:
                        Procesa.promedioEdades(datos);
                    break;
                case 7:
                        Procesa.cantidadHombres(datos);
                    break;
                case 8:
                        Procesa.cantidadMujeres(datos);
                    break;
                case 9:
                    System.out.println("\nSaliendo del sistema .... \n");
                    break;
                default:
                    System.out.println("Opcion inválida");
                    break;
            }
            System.out.println("\n<Presiona <Enter> para Continuar>");
            obj.nextLine();
            obj.nextLine();
        } while (op != 9);
        obj.close();
    }
}