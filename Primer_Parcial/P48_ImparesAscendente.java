import java.util.Scanner;

public class P48_ImparesAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Imprime números impares ascendentes");
            System.out.print("Ingresa el número máximo (n): ");
            int n = scanner.nextInt();

            int suma = 0;
            int cantidadImpares = 0;
            int i = 1;

            while (i <= n) {
                System.out.printf("%d ", i);
                suma += i;
                cantidadImpares++;
                i += 2;
            }

            double promedio = cantidadImpares > 0 ? (double) suma / cantidadImpares : 0;

            System.out.printf("\nLa suma es %d\n", suma);
            System.out.printf("El promedio es %.2f\n", promedio);

            System.out.print("Deseas continuar (S/N)? ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));

        } while (continuar == 'S');

        System.out.println("\nGracias por utilizar este programa!");
    }
}