public class Asistente extends TipoParticipante {
    public Asistente(String nombre, String email, String rol) {
        super(nombre, email, rol);
    }

    @Override
    public String toString() {
        return "Asistente{" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", rol='" + getRol() + '\'' +
                '}';
    }
}
