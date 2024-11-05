import java.util.Scanner;

public class P37_CalculoNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double promedio;
        double N1, N2, N3, N4, N5;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nSaquemos tu promedio con 5 calificaciones");

        System.out.println("Calificion 1: "); N1 = scan.nextDouble();
        System.out.println("Calificion 2: "); N2 = scan.nextDouble();
        System.out.println("Calificion 3: "); N3 = scan.nextDouble();
        System.out.println("Calificion 4: "); N4 = scan.nextDouble();
        System.out.println("Calificion 5: "); N5 = scan.nextDouble();


        promedio= (N1+N2+N3+N4+N5)/5.0;
        System.out.println(String.format("el promedio es %f", promedio));

        if(promedio<=6) System.out.println("Quedas reprobado");
        if((promedio>=6)&&(promedio<=7)) System.out.println("Pasas de panzazo");
        if((promedio>=7)&&(promedio<=8)) System.out.println("Muy bien, pues mejorar");
        if((promedio>=8)&&(promedio<=9)) System.out.println("Excelente sigue así");
        if((promedio>=9)&&(promedio<=10)) System.out.println("Perfecto tu esfuerzo valió la pena");
    }
    
}
