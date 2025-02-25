import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Equip {
    private String nom;
    private List<Jugador> titulars = new ArrayList<Jugador>();
    private List<Jugador> reserves = new ArrayList<Jugador>();
    private Entrenador entrenador;
    private String tag;

    public Equip(String nom, String tag) {
        this.nom = nom;
        this.tag = tag;
    }

    public void imprimirAlineacio() {
        // Ordenar listas de jugadores
        titulars.sort(Comparator.comparing(jugador -> jugador.getRol().ordinal()));
        reserves.sort(Comparator.comparing(jugador -> jugador.getRol().ordinal()));

        // Imprimir jugadores
        int anchoJugador = 35;
        int anchoPosicion = 5;
        System.out.println("··· " + getNom() + " ···");
        System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", "JUGADORES TITULARES", "POSICIÓN");
        System.out.println("---------------------------------------------");
        for (Jugador jugador : titulars) {
            System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", jugador.getCompleteName(), jugador.getRol());
        }
        System.out.println("============================================="); // Añadir el entrenador
        System.out.println("ENTRENADOR\n" + this.entrenador.getCompleteName());
        System.out.println("=============================================");
        System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", "JUGADORES RESERVAS", "POSICIÓN");
        System.out.println("---------------------------------------------");
        for (Jugador jugador : reserves) {
            System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", jugador.getCompleteName(), jugador.getRol());
        }
        System.out.println();
        System.out.println();
    }

    public void afegirJugadorTitular(Jugador jugador) {
        titulars.add(jugador);
    }

    public void afegirJugadorSuplent(Jugador jugador) {
        reserves.add(jugador);
    }

    public void afegirEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getNom() {
        return nom;
    }

    public List getTitulars() {
        return titulars;
    }

    public List getReserves() {
        return reserves;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public String getTag() {
        return tag;
    }
}

