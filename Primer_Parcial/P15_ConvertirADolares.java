// convierte de pesos a dolares

import java.util.Scanner;

public class P15_ConvertirADolares {
    public static void main(String[] args) {
        int pesos; 
        double dolares;

        Scanner obj = new Scanner(System.in);

        System.out.println("Coloca la cantidad de pesos a convertir a dolares: "); pesos = obj.nextInt();
        dolares = pesos * 18.81;
        System.out.println("sus pesos en dolares son: "+ dolares);

    }
}