class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo electrónico a " + direccionCorreo);
        System.out.println("Usuario: " + usuario);
        System.out.println("Mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
        System.out.println("Mensaje personalizado para correo electrónico: " + nuevoMensaje);
    }

    @Override
    public String toString() {
        return "Correo Electrónico [Usuario: " + usuario + ", Dirección: " + direccionCorreo + "]";
    }
}


