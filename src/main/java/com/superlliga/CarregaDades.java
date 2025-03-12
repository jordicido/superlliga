package com.superlliga;

import com.google.gson.Gson;
import java.io.FileReader;

public class CarregaDades {
    public static void carregarLesDades(){
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("src/main/resources/database.json")) {
            // Parse JSON to Java object
            Dades dades = gson.fromJson(reader, Dades.class);

            for (Equip equip : dades.getEquip()) {
                equip.imprimirAlineacio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
