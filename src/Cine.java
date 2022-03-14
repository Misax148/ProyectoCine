import java.util.ArrayList;

public class Cine {
    private String nombreCine;
    private ArrayList<Sala> listaSalas = new ArrayList<>();
    private final int NIT = 678934013;

    // Métodos
    public void setAgregarSala(Sala sala)
    {
        listaSalas.add(sala);
    }

    public int getNIT()
    {
        return NIT;
    }

}