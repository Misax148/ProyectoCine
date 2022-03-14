import org.testng.annotations.Test;

public class TestCartelera {
    @Test

    public void testMostrarCartelera(){
        Pelicula pelicula = new Pelicula("BATMAN", "Matt Reves", Clasificacion.CLASIFICACION_C, "La trama es desconocida", "Español Latino", "3 de Marzo de 2022", 190.0, Dimension.D3, Genero.ACCION);
        Cartelera cartelera = new Cartelera(pelicula);

        cartelera.addPeliculas(pelicula);
        cartelera.mostrarPeliculas();


    }

    //sadklasdlkaslkksksksksksdlkasjdiognfdlkgnv

}
