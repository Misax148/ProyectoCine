import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int cantidadAsientos;
    private String codigoSala;
    private int capacidadFila;
    private int capacidadColumna;
    ArrayList <Asiento> listaAsientos;
    ArrayList <String> idFila;
    ArrayList <String> idColumna;

    public Sala(int cantidadAsientos, String codigoSala, int capacidadFila, int capacidadColumna){
        this.cantidadAsientos = cantidadAsientos;
        this.codigoSala = codigoSala;
        this.capacidadFila = capacidadFila;
        this.capacidadColumna = capacidadColumna;
        listaAsientos = new ArrayList<>();
    }

    public void addListaAsientos(Asiento asiento){
        listaAsientos.add(asiento);
    }

    public ArrayList<Asiento> getListaAsientos() {
        return listaAsientos;
    }

}
