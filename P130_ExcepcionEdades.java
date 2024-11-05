import java.util.InputMismatchException;
import java.util.Scanner;

public class P130_ExcepcionEdades {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int persona = 0;
        int [] edades = new int[5];

        System.out.print("\033[H\033[2J");

        System.out.println("Captura las edades de 5 personas\n");

        while (persona < 5) {
            System.out.print("Edad persona " + (persona+1) + " : ");
            try {
                edades[persona] = obj.nextInt();
                persona++;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
                obj.next();
            }
        }

        System.out.println("\nCaptura terminada las edades son:");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        obj.close();
    }
    
}
