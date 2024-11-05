// verifica que los numeros dados sean consecutivos

import java.util.Scanner;

public class P33_NumerosConsecutivos {
    public static void main(String[] args) {
         int N1, N2, N3;
         Scanner obj = new Scanner(System.in);System.out.print("\033[H\033[2J"); System.out.flush();
         System.out.println("Verifiquemos que los tres numeros que nos des son consecutivos\n");
         System.out.print("Primer numero: "); N1 = obj.nextInt();
         System.out.print("Segundo numero: "); N2 = obj.nextInt();
         System.out.print("Tercer numero: "); N3 = obj.nextInt();

         System.out.println("\n....¡Verificado!\n");

        if ((N1+1==N2) && (N2+1==N3)){
            System.out.println("Son consecutivos!\n");
        }else 
            System.out.println("No son consecutivos!\n");

    
    }

    
}