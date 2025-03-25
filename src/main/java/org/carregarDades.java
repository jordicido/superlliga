package org;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.io.FileReader;
import java.util.List;

public class carregarDades {
    public static List<Equip> carregarLesDades() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("src/main/resources/database.json")) {
            // Parse JSON to List<Equip> directly
            // Convertir el JSON directamente en una lista de Equip
            Type listType = new TypeToken<List<Equip>>() {
            }.getType();
            List<Equip> equips = gson.fromJson(reader, listType);

            return equips;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}