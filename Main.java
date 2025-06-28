public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Steve", 100);
        jugador.aparecer();
        jugador.agregarItem("Espada de diamante");
        jugador.interactuar();

        Zombi zombi = new Zombi("Zombi1", 50, 3);
        zombi.aparecer();
        zombi.interactuar();

        Aldeano aldeano = new Aldeano("Aldeano1", 70, "Agricultor");
        aldeano.aparecer();
        aldeano.interactuar();
    }
}
