public class SelloDiscografico extends ElementoMusical{

    private String pais;
    private String anioFundacion;

    public SelloDiscografico(String pais, String anioFundacion) {
        setPais(pais);
        setAnioFundacion(anioFundacion);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(String anioFundacion) {
        this.anioFundacion = anioFundacion;
    }
}
