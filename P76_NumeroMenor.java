import java.util.Scanner;

public class P76_NumeroMenor {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Introduce cuatro números enteros:");
        int menor = encontrarMenor();
        System.out.println("El menor de los cuatro números es: " + menor);
    }

    public static int encontrarMenor() {
        Scanner obj = new Scanner(System.in);
        int menor;
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();
        int num4 = obj.nextInt();
        menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num4 < menor) {
            menor = num4;
        }
        return menor;

        
    } 
}
