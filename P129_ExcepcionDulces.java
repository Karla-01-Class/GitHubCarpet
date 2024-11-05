import java.util.InputMismatchException;
import java.util.Scanner;

public class P129_ExcepcionDulces {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        try {
            System.out.print("Número de niños en el barrio: ");
            int niños = obj.nextInt();
            System.out.print("Cantidad de dulces existentes: ");
            int dulces = obj.nextInt();
            int cantidad = niños/dulces;
            System.out.print("A cada niño le tocan " + cantidad + " dulces");
        } catch (InputMismatchException e) {
            System.out.print("Los niños y los dulces, deben ser cantidades numéricas");
        } catch (ArithmeticException e){
            System.out.print("Si no hay dulces, no puedo repartir dulces");
        } 
        obj.close();
    }
    
}
