import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class P138_ArchivoMaterias {
    public static void CapturaDatos(ArrayList<String> materias) {
        String materia = " ";
        System.out.println("\nIntroduce un materia y presina <Enter> dato vacio para terminar");
        while (true) {
            materia = new Scanner(System.in).nextLine();
            if (!materia.isEmpty()) {
                materias.add(materia);
            } else {
                break;
            }
        }
    }

    public static void GrabarDatos(String archivo, ArrayList<String> materias) throws IOException {
        BufferedWriter fmaterias = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String materia : materias) {
            fmaterias.write(materia + "\n");
            fmaterias.close();
        }
    }

    public static ArrayList<String> LeerDatos(String archivo) throws IOException {
        ArrayList<String> materias = new ArrayList<>();
        BufferedReader fmaterias = new BufferedReader(new FileReader(new File(archivo)));
        String materia;
        while ((materia = fmaterias.readLine()) != null) {
            materias.add(materia);
        }
        fmaterias.close();
        return materias;
    }

    public static void MostrarDatos(ArrayList<String> materias) {
        System.out.println("\nLos materias hasta el momento: ");
        for (String materia : materias) {
            System.out.println(materia);
        }
    }

    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        String archivo = "materias.txt";
        ArrayList<String> materias = new ArrayList<>();

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("------Procesamiento de materias------");
            System.out.println("Capturar materias..............[1]");
            System.out.println("Grabar materias en archivo.....[2]");
            System.out.println("Lee materias de archivo........[3]");
            System.out.println("Mostrar materias...............[4]");
            System.out.println("Salir.......................[5]");
            System.out.print("Elige opcion: ");
            op = obj.nextInt();
            switch (op) {
                case 1:
                    if (materias.size() == 0) {
                        System.out.println("\nSe capturan materias por primera vez\n ");
                    } else {
                        System.out.println("\nLos materias a capturar se agregan a los materias existentes\n ");
                        CapturaDatos(materias);
                    }
                    break;

                case 2:
                    try {
                        if (materias.size() != 0) {
                            GrabarDatos(archivo, materias);
                            System.out.println("\nDatos grabados correctamente..");
                        } else {
                            System.out.println("\nNo hay materias para grabar, captura materias antes");
                        }
                    } catch (Exception e) {
                        System.out.println("\nError al grabar los materias en el archivo");
                    }
                    break;
                case 3:
                    try {
                        materias = LeerDatos(archivo);
                        System.out.println("\nDatos cargados correctamente..");
                    } catch (Exception e) {
                        System.out.println("\nError al leer archivo");
                    }
                    break;
                case 4:
                    if (materias.size() != 0) {
                        MostrarDatos(materias);
                    } else {
                        System.out.println("\nNo hay materias para mostrar, captura materias o lee materias del disco");
                    }
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema...\n");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("\n<Preciona Cualquier tecla para Continuar>");
            obj.nextLine();
            obj.nextLine();
        } while (op != 5);
        obj.close();
    }
}