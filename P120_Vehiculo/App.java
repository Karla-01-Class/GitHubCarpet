package P120_Vehiculo;

public class App {
    public static void main(String[] args) {
       
        Maquina vochito = new SedanElectrico("Vochito", "Maria Diaz", 4);
        Maquina laMamalona = new SuvCombustion("La mamalona", "Carlos Castaneda", 6);
        System.out.println(vochito);
        if (vochito instanceof AutomovilElectrico) {
            ((AutomovilElectrico) vochito).tipoMotorElectrico();
        }
        if (vochito instanceof Sedan) {
            ((Sedan) vochito).tipoCarroceria();
            ((Sedan) vochito).tipoChasis();
        }
        vochito.repostar();
        vochito.arrancar();
        vochito.frenar();

        System.out.println();

        System.out.println(laMamalona);
        if (laMamalona instanceof AutomovilCombustionInterna) {
            ((AutomovilCombustionInterna) laMamalona).tipoMotorCombustion();
        }
        if (laMamalona instanceof Suv) {
            ((Suv) laMamalona).tipoTraccion();
            ((Suv) laMamalona).tipoChasis();
        }
        laMamalona.repostar();
        laMamalona.arrancar();
        laMamalona.frenar();
    }
}
