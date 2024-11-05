package P95_Empleado02;

public class App {

    public static void main(String[] args) {
        // Instanciar y reservar espacio en memoria
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Juan Perez");
        empleado1.setEdad(35);
        System.out.println(empleado1.toString());
        // Instanciar, luego reservar espacio en memoria
        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.setNombre("Maria de Jesus");
        empleado2.setEdad(16);
        System.out.println(empleado2.toString());
        // Accede elementos individuales directamente
        System.out.println("Nombre : " + empleado1.getNombre());
        System.out.println("Edad : " + empleado1.getEdad());

    }

}
