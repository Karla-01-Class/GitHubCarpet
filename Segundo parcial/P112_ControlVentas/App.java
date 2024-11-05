package P112_ControlVentas;

public class App {
    public static void main(String[] args) {
        Tienda mitienda = new Tienda("coppel", "Carlos Castañeda", "Av. Mexico 113");

        mitienda.agregarCliente(new Cliente("Felipe Calderon", "Las Lomas 123", "Calde@msn.com"));
        mitienda.agregarCliente(new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com"));
        mitienda.agregarCliente(new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com"));
        mitienda.agregarCliente(new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@precidencia.gob.mx"));

        mitienda.getClientes().get(0).agregarVenta(new VentaContado("Martillo", 10, 60.50, 0.10, "Sacabrocados"));
        mitienda.getClientes().get(0).agregarVenta(new VentaCredito("Pala", 2, 1170.55, 3, 0.10));

        mitienda.getClientes().get(1).agregarVenta(new VentaCredito("Clavo", 2, 160.34, 2, 0.20));
        mitienda.getClientes().get(1).agregarVenta(new VentaCredito("Cinta", 5, 71.34, 6, 0.20));
        mitienda.getClientes().get(1).agregarVenta(new VentaContado("Pinza", 10, 650.33, 0.20, "Taladro"));

        mitienda.getClientes().get(2).agregarVenta(new VentaContado("Thiner", 50, 65.00, 0.10, "Aerosol"));

        System.out.print("\033[H\033[2J");
        mitienda.reporte();

    }
}