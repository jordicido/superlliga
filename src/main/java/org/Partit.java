package org;

import java.util.Date;

public class Partit {
    private int id;
    private Equip equipBlau;
    private Equip equipRoig;
    private Equip guanyador;
    private Date hora;
    private Jugador mvp;

    public Partit(int id, Equip equipBlau, Equip equipRoig, Date hora) {
        this.id = id;
        this.equipBlau = equipBlau;
        this.equipRoig = equipRoig;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equip getEquipBlau() {
        return equipBlau;
    }

    public void setEquipBlau(Equip equipBlau) {
        this.equipBlau = equipBlau;
    }

    public Equip getEquipRoig() {
        return equipRoig;
    }

    public void setEquipRoig(Equip equipRoig) {
        this.equipRoig = equipRoig;
    }

    public Equip getGuanyador() {
        return guanyador;
    }

    public void setGuanyador(Equip guanyador) {
        this.guanyador = guanyador;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Jugador getMvp() {
        return mvp;
    }

    public void setMvp(Jugador mvp) {
        this.mvp = mvp;
    }
}
