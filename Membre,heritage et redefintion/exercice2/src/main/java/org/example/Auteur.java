package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Auteur extends Personne{
    private int numAuteur;

    public Auteur(String nom, String prenom, String email, Long tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "numAuteur=" + numAuteur +super.toString()+
                '}';
    }
}
