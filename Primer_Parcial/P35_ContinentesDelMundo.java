import java.util.Scanner;
public class P35_ContinentesDelMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Te mostraremos los continentes del mundo de a cuerdo a tu eleccion\n");
        System.out.print("Dame un numero (1...6): ");
        int n = new Scanner(System.in).nextInt();
        

        System.out.println("\nAqui lo tienes ...");
        if(n==1) System.out.println("Asia");
        if(n==2) System.out.println("Africa");
        if(n==3) System.out.println("America del norte");
        if(n==4) System.out.println("America del sur");
        if(n==5) System.out.println("Antartida");
        if(n==6) System.out.println("Europa");
    }
}