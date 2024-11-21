public class SistemaDePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        // Crear métodos de pago
        TarjetaCredito tarjeta1 = new TarjetaCredito("Juan Pérez", "1234-5678-9012-3456", "12/25", 123);
        PayPal paypal = new PayPal("María López", "n/a","maria@gmail.com");

        // Agregar métodos de pago
        pagos.agregarMetodoPago(tarjeta1);
        pagos.agregarMetodoPago(paypal);

        // Mostrar métodos de pago
        System.out.println("\nMétodos de pago disponibles:");
        pagos.mostrarMetodosPago();

        // Realizar pagos
        System.out.println("\nRealizando pagos:");
        pagos.realizarPagos(100.0);

        // Cancelar pagos
        System.out.println("\nCancelando pagos:");
        pagos.cancelarPagos();

        // Intentar realizar el pago nuevamente
        System.out.println("\nIntentando realizar pagos nuevamente:");
        pagos.realizarPagos(200.0);
    }
}
