import java.util.Scanner;

public class P36_CompraPizza {
    public static void main(String[] args) {
        int cant1, cant2, cant3, cantidadComprada, totalCompra;
        double descuento, totalCompraDescuento;

        descuento = totalCompraDescuento = 0;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Elige la cantidad de pizzas que quieres de cada tamaño");

        System.out.print("\nPizza [CH]ica   - $5: ");
        cant1 = obj.nextInt();
        System.out.print("\nPizza [M]ediana - $10: ");
        cant2 = obj.nextInt();
        System.out.print("\nPizza [G]rande  - $15: ");
        cant3 = obj.nextInt();

        cantidadComprada = cant1 + cant2 + cant3;
        totalCompra = (cant1 * 5) + (cant2 * 10) + (cant3 * 15);

        if (totalCompra > 2000) {
            descuento = (totalCompra * 0.15);
            totalCompraDescuento = (totalCompra - descuento);
        } else
            totalCompraDescuento = totalCompra;
        
        System.out.println("\n\nTICKET DE COMPRA");

        System.out.printf("\nCantidad comprada: %d", cantidadComprada);
        System.out.printf("\nTotal de la compra: $%d", totalCompra);
        System.out.printf("\nDescuento: $%.2f", descuento);
        System.out.printf("\nTotal de la compra con descuento: $%.2f\n", totalCompraDescuento);
    }
}