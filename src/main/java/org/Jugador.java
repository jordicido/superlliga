package org;

public final class Jugador  extends Participant{

    protected Rol rol;

    public Jugador(String nom, String cognom, String nickname, int edat, Rol rol) {
        super(nom,cognom,nickname,edat);
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
