import java.util.Scanner;

public class P125_Excepcion5 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        int a[] = {10,20,30,40};

        System.out.println("Los elementos del arreglo son: ");
        for (int i : a) {
            System.out.println(i + " ");
        }

        try {
            System.out.print("\nQue posicion quieres acceder? ");
            int pos = new Scanner(System.in).nextInt();
            System.out.println("La posicion " + pos + ", contiene un valor de " + a[pos]);
        } catch (ArithmeticException e) {
            System.out.println("Te pasaste de lanza... no puedo ir allá");
        }
    }
}