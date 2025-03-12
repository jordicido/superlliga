package com.superlliga;

public class Participant {
    private String nom;
    private String cognom;
    private String nickname;
    private int edat;

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

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
}


