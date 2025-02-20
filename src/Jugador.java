public class Jugador {
    private String nom;
    private String cognom;
    private String nickname;
    private int edat;
    private Rol rol;

    public Jugador(String nom, String cognom, String nickname, int edat, Rol rol) {
        this.nom = nom;
        this.cognom = cognom;
        this.nickname = nickname;
        this.edat = edat;
        this.rol = rol;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
