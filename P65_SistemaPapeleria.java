//SIMULA UN CONTADOR DE VENTAS
//Escobedo Aguilera Karla Karina

import java.util.Scanner;

public class P65_SistemaPapeleria {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int CanC = 0, CanO = 0, CanDO = 0;
        int R1 = 0, R2 = 0, R3 = 0;
        int Ven = 1, ToVen = 0, CaVen = 0;
        char O;
        char resp = 'S';

        System.out.println("-----------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("-----------------------------------");

        do {
            System.out.printf("Venta: %d\n", Ven);
            System.out.println("Tipo de copias: [a]-Carta $3  [b]-Oficio $4   [c]-Doble Oficio $6");
            O = Character.toUpperCase(obj.next().charAt(0));

            int Can = 0;
            switch (O) {
                case 'A':
                    System.out.println("Cantidad: ");
                    Can = obj.nextInt();
                    CanC += Can;
                    R1 += Can * 3;
                    break;

                case 'B':
                    System.out.println("Cantidad: ");
                    Can = obj.nextInt();
                    CanO += Can;
                    R2 += Can * 4;
                    break;

                case 'C':
                    System.out.println("Cantidad: ");
                    Can = obj.nextInt();
                    CanDO += Can;
                    R3 += Can * 6;
                    break;

                default:
                    System.out.println("Opción no válida...");
                    continue;
            }
            ToVen += Can;
            CaVen++;
            System.out.println("\n¿Otra venta? (S/N)");
            resp = Character.toUpperCase(obj.next().charAt(0));
            Ven++;

        } while (resp != 'N');

        System.out.println("-----------------------------------");
        System.out.println("RESUMEN DIARIO DE VENTAS");
        System.out.println("-----------------------------------");
        System.out.printf("Ventas realizadas: %d\n", CaVen);
        System.out.println("-------------------------------");
        System.out.printf("Carta:           %d     $%d\n", CanC, R1);
        System.out.printf("Oficio:          %d     $%d\n", CanO, R2);
        System.out.printf("Doble Oficio:    %d     $%d\n", CanDO, R3);
        System.out.println("-------------------------------");
        System.out.printf("Total de venta: %d     $%d\n", ToVen, R1 + R2 + R3);

        int To = R1 + R2 + R3;
        if (To < 50) {
            System.out.println("Esta es una: Venta moderada");
        } else if (To >= 50 && To <= 100) {
            System.out.println("Esta es una: Venta frecuente");
        } else {
            System.out.println("Esta es una: Venta superada!!");
        }

        obj.close();
    }
}
