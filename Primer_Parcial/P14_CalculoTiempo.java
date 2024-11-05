// haceuna conversion de horas a dias, minutos y segundos
import java.util.Scanner;


public class P14_CalculoTiempo {
    public static void main(String[] args) {
        int horas;
        float dias, minutos, segundos;

        Scanner obj = new Scanner(System.in);
        System.out.println("Dame las horas a calcular en dias, minutos y segundos;"); horas = obj.nextInt();

        dias = horas/24;
        minutos = horas * 60;
        segundos = horas * 3600;

        System.out.println("Sus horas en dia son: "+ dias+ " dias");
        System.out.println("Sus horas en minutos son: "+ minutos+ " minutos");
        System.out.println("Sus horas en segundos son: "+ segundos+ " segundos");

    }   
}