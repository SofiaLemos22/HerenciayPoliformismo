import java.util.ArrayList;
import java.util.List;

class Notificaciones {
    private List<CanalNotificacion> canales;

    public Notificaciones() {
        this.canales = new ArrayList<>();
    }

    // Agregar un canal de notificación
    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    // Enviar notificaciones a través de todos los canales
    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    // Personalizar un mensaje de un canal específico
    public void personalizarMensaje(int index, String nuevoMensaje) {
        if (index >= 0 && index < canales.size()) {
            if (canales.get(index) instanceof Personalizable) {
                ((Personalizable) canales.get(index)).personalizarMensaje(nuevoMensaje);
            }
        } else {
            System.out.println("Índice de canal no válido.");
        }
    }

    // Mostrar información de todos los canales
    public void mostrarCanales() {
        for (int i = 0; i < canales.size(); i++) {
            System.out.println(i + ": " + canales.get(i).toString());
        }
    }
}















