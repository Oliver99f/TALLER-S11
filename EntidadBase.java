public abstract class EntidadBase implements EntidadMinecraft {
    protected String nombre;
    protected int salud;

    public EntidadBase(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    @Override
    public void aparecer() {
        System.out.println(nombre + " ha aparecido con " + salud + " puntos de salud.");
    }

    @Override
    public abstract void interactuar();

    @Override
    public String obtenerTipo() {
        return "Entidad genérica";
    }
}
