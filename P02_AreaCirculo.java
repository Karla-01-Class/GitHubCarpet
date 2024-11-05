// p02_AreaCirculo - calcula el area de un circulo
//
import java.util.Scanner;

public class P02_AreaCirculo {
    public static void main(String[] args){
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\n Calculando el area del circulo\n");
        System.out.println("dame el radio: ");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El circulo de radio " + radio + " tiene un area de " + area);
    }
}