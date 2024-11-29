public class Adicional {
    private String descripcion;

    public Adicional(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Adicional{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
