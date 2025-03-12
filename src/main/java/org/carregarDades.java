package org;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class carregarDades {
    public static void carregarLesDades(){
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("src/main/resources/database.json")) {
            // Parse JSON to Java object
            Root root = gson.fromJson(reader, Root.class);

            //System.out.println(root);

            for (Equip equip : root.getEquip()) {
                System.out.println("Team: " + equip.getNom());
                System.out.println("Tag: " + equip.getTag());
                System.out.println("Coach: " + equip.getEntrenador().getNom());
                System.out.println("Players:");
//                for (Jugador jugador : equip.getTitulars()) { // Use getJugador() instead of getTitulars()
//                    System.out.println(" - " + jugador.getNickname() + " (" + jugador.getRol() + ")");
//                }
//                for (Jugador suplent : equip.getReserves(){
//                    System.out.println(" - " + suplent.getNickname() + " (" + suplent.getRol() + ")");
//                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}