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

            return equips;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}