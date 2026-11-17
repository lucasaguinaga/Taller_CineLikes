import java.util.ArrayList;

/** Datos ficticios. Cargar una sola vez al iniciar el programa. */
public final class DatosIniciales {
    private DatosIniciales() { }

    public static ArrayList<Pelicula> cargar() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        // Orden de carga intencionalmente diferente al orden de códigos.
        peliculas.add(new Pelicula(2016, "Cartas de invierno", "Nicolás López", "Drama", 2025, 1));
        peliculas.add(new Pelicula(2003, "El último mapa", "Carla Ríos", "Aventura", 2022, 6));
        peliculas.add(new Pelicula(2010, "La isla del viento", "Marco Vera", "Aventura", 2020, 2));
        peliculas.add(new Pelicula(2001, "La ciudad de los faros", "Ana Torres", "Drama", 2021, 4));
        peliculas.add(new Pelicula(2018, "Vecinos por un día", "Camila Vega", "Comedia", 2023, 0));
        peliculas.add(new Pelicula(2008, "Caminos de la montaña", "Pablo Soto", "Documental", 2024, 1));
        peliculas.add(new Pelicula(2005, "Guardianes del bosque", "Sofía Paz", "Animación", 2023, 0));
        peliculas.add(new Pelicula(2013, "Señales desde el espacio", "Gabriela Ríos", "Ciencia ficción", 2023, 4));
        peliculas.add(new Pelicula(2002, "Viaje al espacio", "Luis Mora", "Ciencia ficción", 2020, 1));
        peliculas.add(new Pelicula(2019, "Amigos del espacio", "Tomás León", "Animación", 2024, 4));
        peliculas.add(new Pelicula(2006, "Sombras del puerto", "Diego Ruiz", "Suspenso", 2021, 6));
        peliculas.add(new Pelicula(2015, "Memorias del río", "Valeria Sol", "Documental", 2024, 5));
        peliculas.add(new Pelicula(2004, "Una tarde inesperada", "Pedro Vega", "Comedia", 2019, 2));
        peliculas.add(new Pelicula(2020, "El puente de cristal", "Isabel Rojas", "Suspenso", 2025, 3));
        peliculas.add(new Pelicula(2011, "Un plan diferente", "Daniela Vega", "Comedia", 2025, 6));
        peliculas.add(new Pelicula(2007, "Ecos del espacio", "Elena Ramos", "Ciencia ficción", 2020, 3));
        peliculas.add(new Pelicula(2017, "La ruta del tesoro", "Paula Reyes", "Aventura", 2021, 2));
        peliculas.add(new Pelicula(2009, "El café de la esquina", "Laura Díaz", "Drama", 2022, 5));
        peliculas.add(new Pelicula(2014, "La puerta cerrada", "Mateo Peña", "Suspenso", 2022, 3));
        peliculas.add(new Pelicula(2012, "El reloj de papel", "Andrés Luna", "Animación", 2021, 0));
        return peliculas;
    }
}
