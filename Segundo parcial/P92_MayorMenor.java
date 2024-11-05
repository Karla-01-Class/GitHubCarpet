import java.util.Scanner;

public class P92_MayorMenor {

    public static void mostrarElementos(int[] numeros) {
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Elementos del arreglo:");
        mostrarElementos(numeros);

        int mayor = encontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);

        int menor = encontrarMenor(numeros);
        System.out.println("El número menor es: " + menor);
    }
}
