// Acepta a un estudiante en base a su edad y sus calificaciones

import java.util.Scanner;

public class P38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        char genero;
        float c1,c2, c3;
        double promedio;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Inscripcion a Universidad Kitty kat Sa\n");
        
        System.out.print("Dame tu nombre: ");  nombre = obj.nextLine();
        System.out.print("Seleccione su genero: [M] o [F] "); 
        genero = obj.next().charAt(0);
        genero = Character.toUpperCase(genero);

        if (genero == 'M') {
            System.out.println("\nNo aceptamos hombres en esta Universidad..");
        }
        else
        System.out.print("Dame la edad: "); edad = obj.nextInt();
         if( edad >= 21 ) {
            System.out.println("Cumples con el rango de edad, continuamos ");
            System.out.println("Dame 3 calificaciones separadas por Enter:");
            c1 = obj.nextFloat();
            c2 = obj.nextFloat();
            c3 = obj.nextFloat();

            promedio= (c1+c2+c3)/3.0;

            if( promedio >= 8)
                System.out.printf("\nBIENVENIDO %s tienes %d y promedio adecuado para entrar  ... ACEPTADA\n",nombre,edad);
            else
                System.out.println("\nSolo aceptamos estudiantes con promedio de 8 en adelante");

        }
        else
                System.out.println("Solo aceptamos estudiantes mayores de edad");

        System.out.println("\nProceso terminado ...");
    }
}