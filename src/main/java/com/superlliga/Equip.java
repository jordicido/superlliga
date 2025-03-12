package com.superlliga;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Equip {
    private String nom;
    private List<Jugador> titulars;
    private List<Jugador> reserves;
    private Entrenador entrenador;
    private String tag;


    public void imprimirAlineacio() {
        // Verificar si las listas son null antes de ordenar
        if (titulars == null) {
            titulars = new ArrayList<>(); // Inicializa la lista si es null
        }
        if (reserves == null) {
            reserves = new ArrayList<>(); // Inicializa la lista si es null
        }

        // Ordenar listas de jugadores
        titulars.sort(Comparator.comparing(jugador -> jugador.getRol().ordinal()));
        reserves.sort(Comparator.comparing(jugador -> jugador.getRol().ordinal()));

        // Imprimir jugadores
        int anchoJugador = 35;
        int anchoPosicion = 5;
        System.out.println("··· " + getNom() + " ···");
        System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", "JUGADORS TITULARS", "POSICIÓ");
        System.out.println("---------------------------------------------");
        for (Jugador jugador : titulars) {
            System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", jugador.getCompletePlayerName(), jugador.getRol());
        }
        System.out.println("============================================="); // Añadir el entrenador
        System.out.println("ENTRENADOR\n" + this.entrenador.getCompletePlayerName());
        System.out.println("=============================================");
        System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", "JUGADORS RESERVES", "POSICIÓ");
        System.out.println("---------------------------------------------");
        for (Jugador jugador : reserves) {
            System.out.printf("%-" + anchoJugador + "s%-" + anchoPosicion + "s%n", jugador.getCompletePlayerName(), jugador.getRol());
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

