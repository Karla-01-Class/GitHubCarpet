import java.util.Scanner;

public class EP01_PrimerExamenParcial {
    public static void main(String[] args) {
        String Nom;
        int Edad, TDin=0;
        char Genero,  TP;
        int TAlu=0, TDo=0,Ttra=0, THo = 0, TMu = 0, TPart=0, TRe=0, R1 = 0, R2 = 0, R3 = 0;
        char resp = 'S';

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("----------------------------------------------------");
        System.out.println("Escuela de programacion de quien sabe que");
        System.out.println("Sistema de inscripciones y conteo");
        System.out.println("----------------------------------------------------");

        do{

        System.out.print("Dame tu nombre: "); Nom = obj.next();
        System.out.print("Dame la edad "); Edad = obj.nextInt();

            if( Edad >=23 ) {
                System.out.print("Seleccione su genero: [M] o [F] "); Genero = obj.next().charAt(0);
                switch (Genero) {
                    case 'm':
                        THo +=1;
                       
                        break;
                    case 'f':
                        TMu += 1;
                        
                        break;
                    default:
                        System.out.println("Opción no válida...");
                        continue;
                }

                System.out.print("A que se dedica usted [a]Alumno   [b]Trabajador   [C]Docente "); TP = obj.next().charAt(0);
                switch (TP) {
                    case 'a':
                        TAlu++;
                        System.out.println("Monto a pagar $40");
                        R1 += 1*40;
                        
                        break;
                    case 'b':
                        Ttra++;
                        System.out.println("Monto a pagar $80");
                        R2 += 1*80;
                        break;
                    case 'c':
                        TDo++;
                        System.out.println("Monto a pagar $60");
                        R3 += 1*60;
                        break;
                    
                    default: System.out.println("opcion no valida...");
                        break;
                }

            }
            else System.out.println("No podemos aceptarte, no aplicas en el rango de edad...");
            TRe++;

            TDin += R1+R2+R3;
            TPart++;
            System.out.println("\n¿Desea inscribirse?)");
            resp = Character.toUpperCase(obj.next().charAt(0));

        }while (resp != 'N');

        System.out.println("-----------------------------------");
        System.out.println("queteimporta");
        System.out.println("-----------------------------------");
        System.out.printf("Total de prticipantes : %d\n", TPart);
        System.out.printf("Hombres : %d\n", THo);
        System.out.printf("Mujeres : %d\n", TMu);
        System.out.printf("Rechazados : %d\n", TRe);
        System.out.println("-------------------------------");
        System.out.printf("Alumnos:         %d     $%d\n", TAlu, R1);
        System.out.printf("Trabajadores:    %d     $%d\n", Ttra, R2);
        System.out.printf("Docentes:        %d     $%d\n", TDo, R3);
        System.out.println("-------------------------------");
        System.out.printf("Dinero recaudado: %d\n", TDin);

        System.out.println("\n-------------------------------");
        if (TDin < 50) {
            System.out.println("Evento de: GANANCIAS BAJAS");
        } else if (TDin >= 50 && TDin <= 1000) {
            System.out.println("Evento de: GANACIAS MODERADAS");
        } else {
            System.out.println("Evendo de: BUENAS GANANCIAS");
        }

        obj.close();




    }

}
