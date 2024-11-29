public class Ponente extends TipoParticipante {
    private String tema;

    public Ponente(String nombre, String email, String rol, String tema) {
        super(nombre, email, rol);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public String toString() {
        return "Ponente{" +
                "tema='" + tema + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", rol='" + getRol() + '\'' +
                '}';
    }
}
