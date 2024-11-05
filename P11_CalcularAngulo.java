// P11_CalcularAngulo calcula el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo.
//
import java.util.Scanner;

public class P11_CalcularAngulo {
    public static void main(String[] args) {
        int Angulo1, Angulo2;
        int Angulo;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame el Angulo 1:");
        Angulo1 = obj.nextInt();
        System.out.println("Dame Angulo 2:");
        Angulo2 = obj.nextInt();

        Angulo = 180 - (Angulo1+Angulo2);
        System.out.println(String.format("El angulo final es: "+ Angulo));
    }
}
