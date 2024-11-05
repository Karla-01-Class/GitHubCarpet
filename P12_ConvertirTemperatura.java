//P12_ConvertirTemperatura lo que hac es convertir una temperatura de grados fahrenheit a grados celsius.
//
import java.util.Scanner;

public class P12_ConvertirTemperatura {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame los grados fahrenheit para convertirlo en celsius: ");
        fahrenheit = obj.nextDouble();

        celsius= (fahrenheit -32)*(5.0/9.0);
        System.out.println(String.format("Ahora es: "+ celsius ));
    }
    
}
