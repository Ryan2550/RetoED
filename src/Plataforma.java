public class Plataforma extends ElementoMusical{

    private String anioCreacion;

    public Plataforma(String anioCreacion) {
        setAnioCreacion(anioCreacion);
    }

    public String getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(String anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
}
