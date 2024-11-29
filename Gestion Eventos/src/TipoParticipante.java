public abstract class TipoParticipante extends Participante{
    private String rol;

    public TipoParticipante(String nombre, String email, String rol) {
        super(nombre, email);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }
}
