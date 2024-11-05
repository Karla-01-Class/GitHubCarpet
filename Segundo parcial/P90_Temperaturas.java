public class P90_Temperaturas {

    public static void mostrarPrimerElemento(float[] temperaturas) {
        System.out.println(temperaturas[0]);
    }

    public static void mostrarTercerElemento(float[] temperaturas) {
        System.out.println(temperaturas[2]);
    }

    public static void mostrarElementos(float[] temperaturas) {
        for (float temp : temperaturas) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static void ponerCeroElementosMayoresDiez(float[] temperaturas) {
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        mostrarPrimerElemento(temperaturas);
        mostrarTercerElemento(temperaturas);
        mostrarElementos(temperaturas);
        ponerCeroElementosMayoresDiez(temperaturas);
        mostrarElementos(temperaturas);
    }
}
