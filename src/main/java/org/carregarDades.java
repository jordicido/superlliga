package org;

import com.google.gson.Gson;
import java.io.FileReader;
import java.util.List;

public class carregarDades {
    public static List<Equip> carregarLesDades() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("src/main/resources/database.json")) {
            // Parse JSON to Java object
            // Convertir el JSON en un objeto Java
            Root root = gson.fromJson(reader, Root.class);
            List<Equip> equips = root.getEquip();

            // Acceder a los equipos
            for (Equip equip : equips) {
                System.out.println("Equipo: " + equip.getNom());

                // Acceder a la lista de jugadores titulares
                if (equip.titulars != null) {
                    System.out.println("Jugadores titulares:");
                    for (Jugador jugador : equip.getTitulars()) {
                        System.out.println(" - " + jugador.getNickname() + " (" + jugador.getRol() + ")");
                    }
                }

                // Acceder a la lista de suplentes
                if (equip.reserves != null) {
                    System.out.println("Suplentes:");
                    for (Jugador suplente : equip.getReserves()) {
                        System.out.println(" - " + suplente.getNickname() + " (" + suplente.getRol() + ")");
                    }
                }

                System.out.println("------------------");
            }

            for (Equip equip : root.getEquip()) {
                if (equip.getTitulars() == null) {
                    System.out.println("⚠ La lista de titulares de " + equip.getNom() + " es NULL.");
                } else if (equip.getTitulars().isEmpty()) {
                    System.out.println("⚠ La lista de titulares de " + equip.getNom() + " está vacía.");
                } else {
                    System.out.println("✔ Jugadores cargados correctamente.");
                }
            }

            return equips;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}