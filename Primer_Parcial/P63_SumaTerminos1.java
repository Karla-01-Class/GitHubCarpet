import java.util.Scanner;

public class P63_SumaTerminos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int n;
        double suma= 0.0;
        Scanner obj = new Scanner(System.in);


        System.out.println("¿Cuantos terminos? "); n=obj.nextInt();

        System.out.println("Secuencia: ");
        for (int i =1; i<= n; i++) {
            if (i>1) {
                System.out.print("+");
            }
            System.out.print("1/"+i);
            suma += 1.0/i;
        }
        System.out.println();
        System.out.printf("Suma: %.15f%n", suma);

        obj.close();

    }
    
}
