public class Album extends ElementoMusical {

    private String anioLanzamiento;
    private String generoPredominante;
    private int cantCanciones;

    public Album(String anioLanzamiento, String generoPredominante, int cantCanciones) {
        setAnioLanzamiento(anioLanzamiento);
        setGeneroPredominante(generoPredominante);
        setCantCanciones(cantCanciones);
    }

    public String getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(String anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getGeneroPredominante() {
        return generoPredominante;
    }

    public void setGeneroPredominante(String generoPredominante) {
        this.generoPredominante = generoPredominante;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }
}
