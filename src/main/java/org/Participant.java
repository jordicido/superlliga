package org;

public class Participant {
    protected String nom;
    protected String cognom;
    protected String nickname;
    protected int edat;

    public Participant(String nom, String cognom, String nickname, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.nickname = nickname;
        this.edat = edat;
    }
    public String getCompletePlayerName() {
        return this.nom + " \"" + this.nickname + "\" " + this.cognom;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getNickname() {
        return nickname;
    }

    public int getEdat() {
        return edat;
    }
}
