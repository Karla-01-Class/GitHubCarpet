package P131_ExcepcionTemperatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static double Conversion(int temp) throws TemperturaExcesiva{
        if (temp > 100) {
            throw new TemperturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        } else {
            return ( temp * 9f / 5f ) + 32;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        try {
            System.out.print("Dame una temperatura en centigrados: ");
            int temp = obj.nextInt();
            double resp = Conversion(temp);
            System.out.printf("%.2f grados centigrados, equivale a %.2f grados Farenheit", temp,resp);

        } catch (InputMismatchException e) {
            System.out.println("La temperatura a convertir, debe ser un valor numérico");
        } catch (TemperturaExcesiva e){
            System.out.println(e.getMessage());
        }
        obj.close();
    }
}
