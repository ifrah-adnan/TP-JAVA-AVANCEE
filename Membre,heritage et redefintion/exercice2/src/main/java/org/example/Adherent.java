package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Adherent extends Personne{
    private long numAdherent;

    public Adherent(String nom, String prenom, String email, Long tel, int age, long numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return
                "Adherent{" +
                "numAdherent=" + numAdherent +super.toString()+
                '}';
    }
}
