import java.util.Scanner;

public class P62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Cuantos renglones desea imprimir? "); n = obj.nextInt();
        for (i=1; i<=n; i++) {
            for (j =1; j<=i; j++){
                System.out.print(j + " ");

            }
           System.out.println();
        }
        obj.close();

        
    }

    
}
    

