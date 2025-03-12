package org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jornada {
    private int numero;
    private List partits = new ArrayList<Partit>();
    private Date data;
    private TipusJornada tipus;

    public Jornada(int numero, Date data, TipusJornada tipus) {
        this.numero = numero;
        this.data = data;
        this.tipus = tipus;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List getPartits() {
        return partits;
    }

    public void setPartits(List partits) {
        this.partits = partits;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipusJornada getTipus() {
        return tipus;
    }

    public void setTipus(TipusJornada tipus) {
        this.tipus = tipus;
    }
}
