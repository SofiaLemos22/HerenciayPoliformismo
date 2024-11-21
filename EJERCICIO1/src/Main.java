public class Main {
    public static void main(String[] args) {
        Reservas reserva = new Reservas();

        VueloRegular vuelo1 = new VueloRegular(101, "Buenos Aires", "Córdoba", "2024-12-01", 150, 100.0);
        VueloCharter vuelo2 = new VueloCharter(102, "Mendoza", "Bariloche", "2024-12-02", 5000);
        reserva.agregarVuelo(vuelo1);
        reserva.agregarVuelo(vuelo2);

        System.out.println("Vuelos antes de aplicar promociones:");
        reserva.mostrarVuelos();

        reserva.aplicarPromociones(10); // Aplicar un 10% de descuento a vuelos promocionables

        System.out.println("\nVuelos después de aplicar promociones:");
        reserva.mostrarVuelos();

        System.out.println("\nPrecio total de las reservas: $" + reserva.calcularTotalReservas());
    }
}
