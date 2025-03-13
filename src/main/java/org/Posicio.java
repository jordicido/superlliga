package org;

public class Posicio {
    private Equip equip;
    private int victories;
    private int derrotes;

    public Posicio(Equip equip) {
        this.equip = equip;
        this.victories = 0;
        this.derrotes = 0;
    }

    public Equip getEquip() {
        return equip;
    }

    public void setEquip(Equip equip) {
        this.equip = equip;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDerrotes() {
        return derrotes;
    }

    public void setDerrotes(int derrotes) {
        this.derrotes = derrotes;
    }
}
