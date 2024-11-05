import java.util.Scanner;

public class P78_MedidasLongitud {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir pulgadas a centímetros");
            System.out.println("2. Convertir metros a pies");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor en pulgadas: ");
                    double pulgadas = scanner.nextDouble();
                    double centimetros = pulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas son " + centimetros + " centímetros.");
                    break;
                case 2:
                    System.out.print("Ingrese el valor en metros: ");
                    double metros = scanner.nextDouble();
                    double pies = metrosAPies(metros);
                    System.out.println(metros + " metros son " + pies + " pies.");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione otra opción.");
            }
            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }

    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }

}
