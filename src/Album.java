public class Album extends ElementoMusical {

    private String anioLanzamiento;
    private String generoPredominante;
    private int cantCanciones;

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }
}
