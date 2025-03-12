package org;

public final class Jugador  extends Participant{

    private Rol rol;

    public Jugador(String nom, String cognom, String nickname, int edat, Rol rol) {
        super(nom,cognom,nickname,edat);
        this.rol = rol;
    }

    public String getCompletePlayerName() {
        return this.nom + " \"" + this.nickname + "\" " + this.cognom;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
