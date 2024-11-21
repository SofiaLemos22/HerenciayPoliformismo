class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;
    private boolean pagoRealizado;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
        this.pagoRealizado = false;
    }

    @Override
    public void realizarPago(double monto) {
        if (!pagoRealizado) {
            System.out.println("Pago de $" + monto + " realizado con PayPal: " + correoElectronico);
            pagoRealizado = true;
        } else {
            System.out.println("El pago ya fue realizado con esta cuenta de PayPal.");
        }
    }

    @Override
    public void cancelarPago() {
        if (pagoRealizado) {
            System.out.println("Pago realizado con PayPal (" + correoElectronico + ") ha sido cancelado.");
            pagoRealizado = false;
        } else {
            System.out.println("No hay un pago realizado para cancelar con esta cuenta de PayPal.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Correo electrónico: " + correoElectronico;
    }
}

