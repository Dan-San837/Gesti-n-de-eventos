import java.util.ArrayList;
import java.util.List;

public class Organizador {
    private String nombre;
    private String email;
    private List<Evento> eventos;

    public Organizador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.eventos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public Evento crearEvento(String nombre, String fecha, String lugar) {
        Evento evento = new Evento(nombre, fecha, lugar);
        eventos.add(evento);
        return evento;
    }

    public void modificarEvento(Evento evento, String nombre, String fecha, String lugar) {
        evento = new Evento(nombre, fecha, lugar);
    }

    public void seguimientoEvento(Evento evento) {
        System.out.println("Siguiendo evento: " + evento.getNombre());
    }

    @Override
    public String toString() {
        return "Organizador{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", eventos=" + eventos +
                '}';
    }
}
