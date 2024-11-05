import java.util.Scanner;

public class P128_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        try {
            System.out.print("Introduce un número: ");
            double num = obj.nextFloat();
            num = Math.sqrt(num);
            System.out.printf("El resultado es: %.2f", num);
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raíz cuadrada");
        }
        obj.close();
    }
    
}
