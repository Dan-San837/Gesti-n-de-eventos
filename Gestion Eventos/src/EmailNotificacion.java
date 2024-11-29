public class EmailNotificacion implements Notificacion {
    public static void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por email: " + mensaje);
    }
}
