package org;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int any;
    private int split;
    private List jornades = new ArrayList<Jornada>();
    private List classificacio = new ArrayList<Posicio>();

    public Temporada(int any, int split, List classificacio) {
        this.any = any;
        this.split = split;
        this.classificacio = classificacio;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getSplit() {
        return split;
    }

    public void setSplit(int split) {
        this.split = split;
    }

    public List getJornades() {
        return jornades;
    }

    public void setJornades(List jornades) {
        this.jornades = jornades;
    }

    public List getClassificacio() {
        return classificacio;
    }

    public void setClassificacio(List classificacio) {
        this.classificacio = classificacio;
    }
}
