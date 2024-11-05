import java.util.Scanner;

public class P34_NumeroMayor {
    
    public static void main(String[] args) {
        int N1, N2, N3;
        Scanner obj = new Scanner(System.in);System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Veamos cua es el mayor de los tres numeros que nos daras\n");
        System.out.print("Primer numero: "); N1 = obj.nextInt();
        System.out.print("Segundo numero: "); N2 = obj.nextInt();
        System.out.print("Tercer numero: "); N3 = obj.nextInt();
        
        System.out.println("\n....¡Verificado!\n");

        if ((N1>N2) && (N1>N3)) System.out.println("El primer numero es el mayor\n");
        if ((N2>N1) && (N2>N3)) System.out.println("El segundo numero es el mayor\n");
        if ((N3>N1) && (N3>N2)) System.out.println("El tercer numero es el mayor\n");
        
    }
}
