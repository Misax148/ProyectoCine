public class Pelicula {

    String nombrePelicula;
    String director;
    Clasificacion clasificacion;
    String infoPelicula;
    String idioma;
    String estreno;

    Double duracion;

    Dimension dimension;
    Genero genero;


    public Pelicula(String nombrePelicula, String director, Clasificacion clasificacion, String infoPelicula, String idioma, String estreno, Double duracion, Dimension dimension, Genero genero) {
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.clasificacion = clasificacion;
        this.infoPelicula = infoPelicula;
        this.idioma = idioma;
        this.estreno = estreno;
        this.duracion = duracion;
        this.dimension = dimension;
        this.genero = genero;
    }

    public String toString() {

        if (dimension == Dimension.D2) {
            return "==============================================================\n" +
                    "\t\t\t | " + nombrePelicula + " | \t\t\t" +
                    "==============================================================\n\n" +
                    "\t| GENERO: " + genero + "\t| DIMENSION: 2D" +
                    "\t| DURACION: " + duracion +
                    "\t| CLASIFICACION: " + clasificacion +
                    "\t| ESTRENO: " + estreno +
                    "\t| DIRECTOR: " + director +
                    "\t| IDIOMA: " + idioma +
                    "\t| SINOPSIS: " + nombrePelicula;
        }

        else{
            return "==============================================================\n" +
                    "\t\t\t | " + nombrePelicula + " | \t\t\t" +
                    "==============================================================\n\n" +
                    "\t| GENERO: " + genero + "\t| DIMENSION: 3D" +
                    "\t| DURACION: " + duracion +
                    "\t| CLASIFICACION: " + clasificacion +
                    "\t| ESTRENO: " + estreno +
                    "\t| DIRECTOR: " + director +
                    "\t| IDIOMA: " + idioma +
                    "\t| SINOPSIS: " + nombrePelicula;
        }
    }
}

