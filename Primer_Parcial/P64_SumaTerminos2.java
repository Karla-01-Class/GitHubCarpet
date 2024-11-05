import java.util.Scanner;

public class P64_SumaTerminos2 {
        public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int n, suma=0;
        Scanner obj = new Scanner(System.in);


        System.out.println("¿Cuantos terminos? "); n=obj.nextInt();

        System.out.println("Secuencia: ");
        for (int i =1; i<= n; i++) {
            long term = 0;
            for (int j = 0; j <i; j++){
                term = term* 10+ 1;
            }
            if (i>1){
                System.out.print("+");

            }
            System.out.print(term);

            suma += term;

        }
        System.out.println();
        System.out.println("suma: " + suma);

        obj.close();

    }
    
}
