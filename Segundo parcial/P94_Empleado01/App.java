package P94_Empleado01;


public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();    //Instanciar
        Empleado empleado2 = new Empleado();    //Instanciar

        Empleado empleado3;
        empleado3 = new Empleado();        //Instanciar 
        empleado3.Nombre= "Huichilopostli";
        empleado3.Edad= 40;

        System.out.print("\033[H\033[2J");
        empleado1.Nombre = "Ari la de los gameplays";
        empleado1.Edad = 27;
        System.out.println(empleado1.toString());
        empleado2.Nombre = "Juan guarniciones";
        empleado2.Edad = 28;
        System.out.println(empleado2.toString());

        System.out.println("\nEmpleado 3");
        System.out.println(empleado3.toString());

        
    }
   


    
}