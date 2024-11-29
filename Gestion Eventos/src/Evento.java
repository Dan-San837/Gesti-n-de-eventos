import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fecha;
    private String lugar;
    private List<Participante> participantes;
    private List<Adicional> adicionales;

    public Evento(String nombre, String fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
        this.adicionales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void addParticipante(Participante participante) {
        participantes.add(participante);
    }

    public List<Adicional> getAdicionales() {
        return adicionales;
    }

    public void addAdicional(Adicional adicional) {
        adicionales.add(adicional);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                ", participantes=" + participantes +
                ", adicionales=" + adicionales +
                '}';
    }
}
