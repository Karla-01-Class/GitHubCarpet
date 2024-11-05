import java.util.InputMismatchException;
import java.util.Scanner;

public class P124_Excepcion4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        try {
            System.out.println("Valor de l numerador: "); int a = obj.nextInt();
            System.out.println("Valor de l denominador: "); int b = obj.nextInt();
            int c = a/b;
            System.out.println("El resultado de la divicion es: " + c);
            
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Tanto el númerador como el denominador deben ser numeros");
            System.out.println("No se puede dividir entre 0");
        } finally {
            System.out.println("\nHaya sido como haya sido ya nos vamos a desayunar");
        }
        obj.close();
    }
    
}
