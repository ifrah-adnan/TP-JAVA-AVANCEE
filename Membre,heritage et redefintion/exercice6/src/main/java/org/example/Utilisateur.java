package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public Utilisateur() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable objet){
        objet.emprunter();
    }
}
