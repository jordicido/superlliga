package org;

import org.carregarDades;

public class Main {
    public static void main(String[] args) {
        Temporada temporada = new Temporada(2025, 1, null);

        temporada.equips = carregarDades.carregarLesDades();
    }
}