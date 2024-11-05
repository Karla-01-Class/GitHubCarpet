// P10_HipotenusaTrangulo calcula la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados.
//
import java.util.Scanner;

public class P10_HipotenusaTriangulo {
    public static void main(String[] args) {
        int LongL1, LongL2;
        Double hipotenusa;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame la longitud de lado 1:");
        LongL1 = obj.nextInt();
        System.out.println("Dame la longitud de Lado 2:");
        LongL2 = obj.nextInt();

        hipotenusa = Math.sqrt(LongL1*LongL1+LongL2*LongL2);
        System.out.println(String.format("La hipotenusa es: "+ hipotenusa));

    }
    
}
