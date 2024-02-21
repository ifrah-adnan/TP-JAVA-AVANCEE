package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Vehicul {
    private String nom;
    private double  prix;

    public Vehicul(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void emettreSon(){
        System.out.println("Le vehicule emet un son inconnu");
    }
    public void afficherinformations(){
        System.out.println("Name :"+nom+" \n"+"prix "+prix);
    }
}
