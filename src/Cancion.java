import java.sql.Time;

public class Cancion extends ElementoMusical{

    private Time duracion;
    private String numPista;
    private int cantReproducciones;

    public int getCantReproducciones() {
        return cantReproducciones;
    }

    public void setCantReproducciones(int cantReproducciones) {
        this.cantReproducciones = cantReproducciones;
    }
}
