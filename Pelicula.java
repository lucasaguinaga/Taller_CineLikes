/** Modelo de referencia para adaptar al proyecto del grupo. */
public class Pelicula {
    private final int codigo;
    private String titulo;
    private String director;
    private String genero;
    private int anio;
    private int meGusta;

    public Pelicula(int codigo, String titulo, String director,
                    String genero, int anio, int meGusta) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.anio = anio;
        this.meGusta = meGusta;
    }

    public int getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getDirector() { return director; }
    public String getGenero() { return genero; }
    public int getAnio() { return anio; }
    public int getMeGusta() { return meGusta; }

    // El catálogo debe validar todos los datos antes de aplicar una edición.
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDirector(String director) { this.director = director; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setAnio(int anio) { this.anio = anio; }
    public void incrementarMeGusta() { meGusta++; }

    @Override
    public String toString() {
        return codigo + " | " + titulo + " | " + director + " | Me gusta: " + meGusta;
    }
}
