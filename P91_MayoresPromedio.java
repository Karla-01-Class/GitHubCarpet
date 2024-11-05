import java.util.Scanner;

public class P91_MayoresPromedio {

    public static void mostrarElementos(float[] calificaciones) {
        for (float calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
        System.out.println();
    }

    public static float calcularSuma(float[] calificaciones) {
        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma;
    }

    public static float calcularPromedio(float suma, int n) {
        return suma / n;
    }

    public static void mostrarMayoresPromedio(float[] calificaciones, float promedio) {
        int contador = 0;
        System.out.println("Elementos mayores al promedio:");
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.print(calificacion + " ");
                contador++;
            }
        }
        System.out.println("\nCantidad de elementos mayores al promedio: " + contador);
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int n = scanner.nextInt();
        
        float[] calificaciones = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        System.out.println("Elementos del arreglo:");
        mostrarElementos(calificaciones);

        float suma = calcularSuma(calificaciones);
        System.out.println("Suma de las calificaciones: " + suma);

        float promedio = calcularPromedio(suma, n);
        System.out.println("Promedio de las calificaciones: " + promedio);

        mostrarMayoresPromedio(calificaciones, promedio);
    }
}
