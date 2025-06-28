public class Aldeano extends EntidadBase {
    private String profesion;

    public Aldeano(String nombre, int salud, String profesion) {
        super(nombre, salud);
        this.profesion = profesion;
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " dice: ¡Hola! Soy un aldeano que trabaja como " + profesion + ".");
    }

    @Override
    public String obtenerTipo() {
        return "Aldeano";
    }
}
