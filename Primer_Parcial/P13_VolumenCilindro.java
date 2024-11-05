// P13_VolumenCilindro - calcula el area de un cilindro.

import java.util.Scanner;

public class P13_VolumenCilindro {
    public static void main(String[] args){
        double radio, altura, volumen;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCalculadora del volumen de un cilindro\n");
        System.out.print("Dame el radio: ");
        radio = scanner.nextDouble();  // Usa nextDouble() para leer el radio
        System.out.print("Dame la altura: ");
        altura = scanner.nextDouble();  // Usa nextDouble() para leer la altura

        // Calcula el volumen del cilindro
        volumen = Math.PI * Math.pow(radio, 2) * altura;

        // Muestra el resultado
        System.out.printf("El cilindro tiene un volumen de %.2f\n", volumen);
        
        // Cierra el scanner
        scanner.close();
    }
}
