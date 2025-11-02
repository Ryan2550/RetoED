public class Artista extends ElementoMusical {

    private String generoMusical;
    private String nacionalidad;

    public Artista(String generoMusical, String nacionalidad) {
        setGeneroMusical(generoMusical);
        setNacionalidad(nacionalidad);
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
