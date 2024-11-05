import java.util.Scanner;

public class P50_ConversionTemperaturas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {

            System.out.print("Temperatura Inicial: ");
            int tempInicial = scanner.nextInt();
            System.out.print("Temperatura Final: ");
            int tempFinal = scanner.nextInt();

            if (tempFinal >= tempInicial) {
                System.out.println("------------------------------------");
                System.out.println("Centígrados Farenheit");
                System.out.println("------------------------------------");

                int temp = tempInicial;
                while (temp <= tempFinal) {
                    double fahrenheit = (temp * 9.0 / 5.0) + 32;
                    System.out.printf("%d %.1f\n", temp, fahrenheit);
                    temp++;
                }
            } else {
                System.out.println("La temperatura final debe ser mayor o igual a la inicial.");
            }

            System.out.print("\n¿Deseas continuar (S/N)? ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));

        } while (continuar == 'S');

        System.out.println("\nGracias por utilizar este programa!");
    }
}