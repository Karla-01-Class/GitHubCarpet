//HolaMundo - Manda una salida a la pantalla
 //
public class P01_HolaMundo{
    public static void main(String[] args) {
        String amigo = "Vick";
        String Hermano = "Adrian";
        String mensaje = String.format("Tanto com %s como %s desean aprender Java",amigo,Hermano);

        System.out.println("Hola mundo, en el lenguaje java");
        System.out.println("\n Hola amigo " + amigo + "bienvenido a Java" );
        System.out.println("\n Mi amigo es " + amigo + "y mi hermano es " + Hermano );
        System.out.println("\n" + mensaje );
    } 
   
}