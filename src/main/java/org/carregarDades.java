package org;
import com.google.gson.Gson;
import java.io.FileReader;


public class carregarDades {
    public static void carregarLesDades(){
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("src/main/resources/database.json")) {
            // Parse JSON to Java object

            // Convertir el JSON en un objeto Java
            Root root = gson.fromJson(reader, Root.class);

            // Acceder a los equipos
            for (Equip equipo : root.Equip) {
                System.out.println("Equipo: " + equipo.getNom());

                // Acceder a la lista de jugadores titulares
                if (equipo.titulars != null) {
                    System.out.println("Jugadores titulares:");
                    for (Jugador jugador : equipo.getTitulars()) {
                        System.out.println(" - " + jugador.getNickname() + " (" + jugador.getRol() + ")");
                    }
                }


                // Acceder a la lista de suplentes
                if (equipo.reserves != null) {
                    System.out.println("Suplentes:");
                    for (Jugador suplente : equipo.getReserves()) {
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

            //System.out.println(root);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}