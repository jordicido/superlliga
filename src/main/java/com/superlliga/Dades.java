package com.superlliga;
import java.util.List;

public class Dades {
    private List<Equip> Equip;

    // Getters y Setters
    public List<Equip> getEquip() {
        return Equip;
    }

    public void setEquip(List<Equip> equip) {
        Equip = equip;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "Equip=" + Equip +
                '}';
    }
}