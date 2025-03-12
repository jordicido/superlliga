package org;

import java.util.List;

public class Root {
    protected List<Equip> Equip;

    // Getters and setters
    public List<Equip> getEquip() {
        return Equip;
    }
    public void setEquip(List<Equip> Equip) { this.Equip = Equip; }

    @Override
    public String toString() {
        return "Root{Equip=" + Equip + "}";
    }
}