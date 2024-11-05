import java.util.Scanner;

public class P51_FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;
        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {
            System.out.print("¿Número de términos que deseas imprimir ?: ");
            int n = scanner.nextInt();
            int a = 0, b = 1;

            System.out.println("Los primeros " + n + " términos de la sucesión Fibonacci son:");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int temp = a;
                a = b;
                b = temp + b;
            }
            System.out.println();

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next().trim().toUpperCase();

        } while (continuar.equals("S"));

        scanner.close();
    }
}