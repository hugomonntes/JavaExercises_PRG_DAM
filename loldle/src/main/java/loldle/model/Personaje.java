package loldle.model;

public class Personaje {
    private String nombre;
    private String genero;
    private String posicion;
    private String especie;
    private String recurso;
    private String tipoDeGama;
    private String region;
    private int anhoDeLanzamiento;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setTipoDeGama(String tipoDeGama) {
        this.tipoDeGama = tipoDeGama;
    }

    public String getTipoDeGama() {
        return tipoDeGama;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setAnhoDeLanzamiento(int anhoDeLanzamiento) {
        this.anhoDeLanzamiento = anhoDeLanzamiento;
    }

    public int getAnhoDeLanzamiento() {
        return anhoDeLanzamiento;
    }

    public Personaje(String nombre,String genero, String posicion, String especie){
        
    }
}
