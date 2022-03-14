import java.util.HashMap;
import java.util.Map;

public class Boleteria {

    private int Asientos;
    private int precioUnidadAsiento;
    private int precioPelicula3D = 60;
    public HashMap<String,Integer > descuentoEdad = new HashMap<String , Integer>();



    private int precioPelicula2D = 40;

    private String dia;
    private String tarjetaCredito;


    public void añadirDescuentoEdad()
    {
        descuentoEdad.put("MenorDiezAños", 15); // %
        descuentoEdad.put("TarjetaCreditoLosElefantes", 12);
        descuentoEdad.put("MayorEdad", 50);
    }

    public void definirPrecioPelicula()
    {

    }
    public void generadorBoleto()
    {

    }
    public void descuentoPrecio()
    {

    }
    public void addMetodoPago()
    {

    }
    public void mostrarMetodoPago()
    {

    }

}
