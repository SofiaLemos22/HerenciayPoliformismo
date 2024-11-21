import java.util.ArrayList;
import java.util.List;

class Pagos {
    private List<MetodoPago> metodosPago;

    public Pagos() {
        metodosPago = new ArrayList<>();
    }

    public void agregarMetodoPago(MetodoPago metodoPago) {
        metodosPago.add(metodoPago);
        System.out.println("Método de pago agregado: " + metodoPago);
    }

    public void realizarPagos(double monto) {
        for (MetodoPago metodoPago : metodosPago) {
            metodoPago.realizarPago(monto);
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodoPago : metodosPago) {
            if (metodoPago instanceof Cancelable) {
                ((Cancelable) metodoPago).cancelarPago();
            }
        }
    }

    public void mostrarMetodosPago() {
        for (MetodoPago metodoPago : metodosPago) {
            System.out.println(metodoPago);
        }
    }
}

