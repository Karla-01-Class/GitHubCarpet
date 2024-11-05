import java.util.Random;

public class P93_ParesImpares {

    public static final int MAX = 100;

    public static void mostrarElementos(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mostrarPares(int[] arreglo) {
        int cuentaPares = 0;
        System.out.println("Elementos pares:");
        for (int num : arreglo) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                cuentaPares++;
            }
        }
        System.out.println("\nCantidad de pares: " + cuentaPares);
    }

    public static void mostrarImpares(int[] arreglo) {
        int cuentaImpares = 0;
        System.out.println("Elementos impares:");
        for (int num : arreglo) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                cuentaImpares++;
            }
        }
        System.out.println("\nCantidad de impares: " + cuentaImpares);
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int[] a = new int[MAX];
        int[] b = new int[MAX]; 

        Random random = new Random();

        
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21); 
        }

        System.out.println("Elementos del arreglo a[]:");
        mostrarElementos(a);

        mostrarPares(a);
        mostrarImpares(a);
    }
}
