import java.util.ArrayList;

public class Jugador extends EntidadBase {
    private ArrayList<String> inventario;

    public Jugador(String nombre, int salud) {
        super(nombre, salud);
        this.inventario = new ArrayList<>();
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " abre su inventario.");
    }

    @Override
    public String obtenerTipo() {
        return "Jugador";
    }

    public void agregarItem(String item) {
        inventario.add(item);
        System.out.println(nombre + " ha agregado " + item + " a su inventario.");
    }
}
