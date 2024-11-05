import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class P134_Archivos3 {
    public static void main(String[] args) {
        File arch = new File("Ciudades.txt");
        ArrayList<String> ciudades = new ArrayList<String>();
        System.out.print("\033[H\033[2J");

        if (arch.exists()) {
            try {
                BufferedReader fciudades = new BufferedReader(new FileReader(arch));
                
                String linea;

                while ((linea = fciudades.readLine()) != null) {
                    System.out.println(linea);
                    ciudades.add(linea);
                }

                fciudades.close();
                System.out.println("\nLas ciudades que estan ya en el arreglo");

                for (String ciudad : ciudades) {
                    System.out.println(ciudad);
                }

            } catch (Exception e) {
                
            }
        } else {
            System.out.println("No existe el archivo");
        }
    }
    
}
