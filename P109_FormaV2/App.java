package P109_FormaV2;

public class App {
    public static void main(String[] args) {
        Forma[] formas = {
            new Circulo("Rojo", true, 10.23),
            new Circulo("Verde", false, 99.12),
            new Rectangulo("Amarillo", false, 10.0, 20.0),
            new Rectangulo("Azul", true, 15.0, 44.0)
        };

        System.out.println("Todas las formas :");
        for (Forma forma : formas) {
            System.out.println(forma);
        }

        System.out.println("Calculando áreas y perímetros de las figuras:");
        for (Forma forma : formas) {
            System.out.println("La forma es un " + (forma instanceof Circulo ? "Circulo" : "Rectangulo"));
            System.out.println("El área es : " + forma.getArea());
            System.out.println("El perímetro es : " + forma.getPerimetro());
        }
    }
}
