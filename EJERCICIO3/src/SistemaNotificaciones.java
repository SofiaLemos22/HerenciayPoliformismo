//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();

        // Crear canales de notificación
        CorreoElectronico correo = new CorreoElectronico("Juan Pérez", "Hola, Juan!", "juan@example.com");
        MensajeTexto mensajeTexto = new MensajeTexto("María López", "Hola, María!", "123-456-7890");

        // Agregar canales de notificación
        notificaciones.agregarCanal(correo);
        notificaciones.agregarCanal(mensajeTexto);

        // Mostrar información de los canales
        System.out.println("Canales de Notificación:");
        notificaciones.mostrarCanales();

        // Enviar notificaciones
        System.out.println("\nEnviando Notificaciones:");
        notificaciones.enviarNotificaciones();

        // Personalizar mensajes
        System.out.println("\nPersonalizando Mensajes:");
        notificaciones.personalizarMensaje(0, "¡Nuevo mensaje para Juan!");
        notificaciones.personalizarMensaje(1, "¡Nuevo mensaje para María!");

        // Enviar notificaciones nuevamente
        System.out.println("\nEnviando Notificaciones Personalizadas:");
        notificaciones.enviarNotificaciones();
    }
}