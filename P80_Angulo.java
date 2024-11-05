import java.util.Scanner;

public class P80_Angulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Muestra el tipo de ángulo \n");
        int angulo = pedirAngulo();
        String tipo = determinarTipoAngulo(angulo);
        System.out.println("El ángulo que introdujiste: " + angulo);
        System.out.println("El tipo de ángulo es: " + tipo);
        System.out.println("\nProceso terminado ....");
    }

    public static int pedirAngulo() {
        System.out.print("Dame un ángulo entre 0 y 360 grados? ");
        return new Scanner(System.in).nextInt();
    }

    public static String determinarTipoAngulo(int angulo) {
        if (angulo < 0 || angulo > 360) {
            return "inválido (debe estar entre 0 y 360)";
        }
        if (angulo < 90) {
            return "agudo";
        }
        if (angulo == 90) {
            return "recto";
        }
        if (angulo > 90 && angulo < 180) {
            return "obtuso";
        }
        if (angulo == 180) {
            return "llano";
        }
        if (angulo > 180 && angulo < 360) {
            return "cóncavo";
        }
        return "completo";
    }
}
