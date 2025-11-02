import java.sql.Time;

public class Cancion extends ElementoMusical{

    private Time duracion;
    private String numPista;
    private int cantReproducciones;

    public Cancion(Time duracion, String numPista, int cantReproducciones) {
        setDuracion(duracion);
        setNumPista(numPista);
        setCantReproducciones(cantReproducciones);
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public String getNumPista() {
        return numPista;
    }

    public void setNumPista(String numPista) {
        this.numPista = numPista;
    }

    public int getCantReproducciones() {
        return cantReproducciones;
    }

    public void setCantReproducciones(int cantReproducciones) {
        this.cantReproducciones = cantReproducciones;
    }
}
