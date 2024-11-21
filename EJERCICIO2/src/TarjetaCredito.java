public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private int codigoSeguridad;
    private boolean pagoRealizado;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
        this.pagoRealizado = false;
    }

    @Override
    public void realizarPago(double monto) {
        if (!pagoRealizado) {
            System.out.println("Pago de $" + monto + " realizado con tarjeta de crédito: " + numero);
            pagoRealizado = true;
        } else {
            System.out.println("El pago ya fue realizado con esta tarjeta.");
        }
    }

    @Override
    public void cancelarPago() {
        if (pagoRealizado) {
            System.out.println("Pago realizado con tarjeta " + numero + " ha sido cancelado.");
            pagoRealizado = false;
        } else {
            System.out.println("No hay un pago realizado para cancelar con esta tarjeta.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de expiración: " + fechaExpiracion;
    }
}


