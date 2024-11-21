import java.util.ArrayList;
import java.util.List;

public class Reservas {
    private List<Vuelos> vuelos;

    public Reservas() {
        vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelos vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularTotalReservas() {
        double total = 0;
        for (Vuelos vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones(double porcentajeDescuento) {
        for (Vuelos vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion(porcentajeDescuento);
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelos vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }
}

