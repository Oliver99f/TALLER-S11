public class Zombi extends EntidadBase {
    private int nivelDeAgresividad;

    public Zombi(String nombre, int salud, int nivelDeAgresividad) {
        super(nombre, salud);
        this.nivelDeAgresividad = nivelDeAgresividad;
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " ataca con agresividad nivel " + nivelDeAgresividad);
    }

    @Override
    public String obtenerTipo() {
        return "Zombi";
    }
}
