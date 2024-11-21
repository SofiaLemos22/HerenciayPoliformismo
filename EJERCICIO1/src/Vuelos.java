public abstract class Vuelos {
    protected int numeroVuelo;
    protected String origen;
    protected String destino;
    protected String fecha;

    public Vuelos(int numeroVuelo, String origen, String fecha, String destino){
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }
    public abstract double calcularPrecio();

    public String toString() {
        return "Vuelo #" + numeroVuelo + " de " + origen + " a " + destino + " el " + fecha;
    }
}