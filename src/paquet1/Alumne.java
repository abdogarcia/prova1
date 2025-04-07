package paquet1;

public class Alumne {
    String nom;
    int edat;

    public Alumne(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }


    public String nom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    Alumne(String nom) {
        this.nom = nom;
    }
}
