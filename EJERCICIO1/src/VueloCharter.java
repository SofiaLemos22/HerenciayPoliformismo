public class VueloCharter extends Vuelos implements Promocionable {
    private double precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String fecha, String destino, int precioTotal){
        super(numeroVuelo, origen, fecha, destino);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double porcentajeDescuento) {
        precioTotal -= precioTotal * (porcentajeDescuento / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " [Charter] Precio total: $" + calcularPrecio();
    }
}
