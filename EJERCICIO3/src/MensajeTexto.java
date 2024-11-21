class MensajeTexto extends CanalNotificacion implements Personalizable {
    private String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando mensaje de texto a " + numeroTelefono);
        System.out.println("Usuario: " + usuario);
        System.out.println("Mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
        System.out.println("Mensaje personalizado para mensaje de texto: " + nuevoMensaje);
    }

    @Override
    public String toString() {
        return "Mensaje de Texto [Usuario: " + usuario + ", Número: " + numeroTelefono + "]";
    }
}

