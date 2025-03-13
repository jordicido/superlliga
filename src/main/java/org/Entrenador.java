package org;

public class Entrenador extends Participant{

    public Entrenador(String nom, String cognom, String nickname, int edat) {
        super(nom, cognom, nickname, edat);
    }

    public String getCompletePlayerName() {
        return this.nom + " \"" + this.nickname + "\" " + this.cognom;
    }


}
