package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Avion extends Vehicul {
    private String compagnie;
    private double vitesseMax;

    public Avion(String nom, double prix, String compagnie, double vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon(){

        System.out.println("l'avion fait un bruit de moteur puissant ");
    }
    @Override
    public void afficherinformations(){
        super.afficherinformations();
        System.out.println("la compagnie de l'avion est "+compagnie+" est sa vitess Max : "+vitesseMax);;

    }
}
