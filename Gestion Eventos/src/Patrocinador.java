public class Patrocinador extends TipoParticipante {
    private String empresa;

    public Patrocinador(String nombre, String email, String rol, String empresa) {
        super(nombre, email, rol);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Patrocinador{" +
                "empresa='" + empresa + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", rol='" + getRol() + '\'' +
                '}';
    }
}
