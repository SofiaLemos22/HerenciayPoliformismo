public class VueloRegular extends Vuelos implements Promocionable {
    private int numeroAsientos;
    private double precioPorAsiento;

    public VueloRegular(int numeroVuelo, String origen, String fecha, String destino, int numeroAsientos, double precioPorAsiento){
        super(numeroVuelo, origen, fecha, destino);
        this.numeroAsientos = numeroAsientos;
        this.precioPorAsiento = precioPorAsiento;

    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioPorAsiento;
    }

    @Override
    public void aplicarPromocion(double porcentajeDescuento) {
        precioPorAsiento -= precioPorAsiento * (porcentajeDescuento / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " [Regular] Precio total: $" + calcularPrecio();
    }

}