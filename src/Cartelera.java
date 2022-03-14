import java.util.ArrayList;

public class Cartelera{

    static ArrayList<Pelicula> listaPeliculas;
    Pelicula pelicula;
    private Integer horarioPeliculaMañana;
    private Integer horarioPelicula;

    public Cartelera(Pelicula pelicula){
        this.pelicula =pelicula;
        listaPeliculas = new ArrayList<>();
    }


    public void addPeliculas(Pelicula pelicula){
            listaPeliculas.add(pelicula);
    }

    public void mostrarPrecio(){

    }

    public void mostrarPeliculas(){
        for (Pelicula mostrarpeliculas: listaPeliculas){
            System.out.println(mostrarpeliculas);
        }
    }



}
