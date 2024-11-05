import java.util.Scanner;

public class P79_SumaMultiplos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        int ini, fin, constante;

        System.out.print("Ingrese el límite inferior del rango: ");
        ini = scanner.nextInt();
        System.out.print("Ingrese el límite superior del rango: ");
        fin = scanner.nextInt();

        if (ini >= fin) {
            System.out.println("Error: El límite inferior debe ser menor que el límite superior.");
            return;
        }

        System.out.println("Seleccione una opción:");
        System.out.println("1. Sumar múltiplos de 3");
        System.out.println("2. Sumar múltiplos de 4");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                constante = 3;
                break;
            case 2:
                constante = 4;
                break;
            default:
                System.out.println("Opción inválida. Saliendo...");
                return;
        }

        int suma = SumaMultiplos(ini, fin, constante);
        System.out.println("La suma de los múltiplos de " + constante + " entre " + ini + " y " + fin + " es: " + suma);
        scanner.close();
    }

    public static int SumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
            }
        }
        return suma;
    }
}

