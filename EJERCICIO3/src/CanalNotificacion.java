// Clase abstracta CanalNotificacion
abstract class CanalNotificacion {
    protected String usuario;
    protected String mensaje;

    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    // Método abstracto para enviar notificaciones
    public abstract void enviarNotificacion();
}
