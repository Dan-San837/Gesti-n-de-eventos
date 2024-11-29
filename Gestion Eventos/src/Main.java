public class Main {
    public static void main(String[] args) {
        // Crear organizador
        Organizador organizador = new Organizador("Carlos", "carlos@eventos.com");

        // Crear evento
        Evento evento = organizador.crearEvento("Conferencia de Tecnología", "2024-12-01", "Centro de Convenciones");

        // Crear participantes
        Ponente ponente = new Ponente("Ana", "ana@tech.com", "Ponente", "Inteligencia Artificial");
        Asistente asistente = new Asistente("Luis", "luis@tech.com", "Asistente");
        Patrocinador patrocinador = new Patrocinador("Pedro", "pedro@empresa.com", "Patrocinador", "TechCorp");

        // Registrar participantes
        evento.addParticipante(ponente);
        evento.addParticipante(asistente);
        evento.addParticipante(patrocinador);

        // Adicionales
        Adicional adicional1 = new Adicional("Coffee break");
        Adicional adicional2 = new Adicional("Materiales de conferencia");
        evento.addAdicional(adicional1);
        evento.addAdicional(adicional2);

        // Consultar información
        System.out.println("Organizador: " + organizador);
        System.out.println("Evento: " + evento);
        System.out.println("Participantes del evento:");
        for (Participante p : evento.getParticipantes()) {
            System.out.println(p);
        }

        // Gestión del evento
        organizador.seguimientoEvento(evento);

        // Enviar notificación
        EmailNotificacion emailNotificacion = new EmailNotificacion();
        EmailNotificacion.enviarNotificacion("Evento " + evento.getNombre() + " creado con éxito.");
    }
}
