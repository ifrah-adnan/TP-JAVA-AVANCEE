package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
abstract class Employe {
    protected String nom;
    protected String prenom;
    protected String email;
    protected int telephone;
    protected double salaire;

    public Employe(String nom, String prenom, String email, int telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    abstract double calculerSalaire();
}
