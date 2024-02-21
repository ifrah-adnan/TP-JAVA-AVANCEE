package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Voiture extends Vehicul{
    private String modele;
    private int annee;

    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    @Override
    public void emettreSon(){

        System.out.println("la voiture vrombit");
    }
    @Override
    public void afficherinformations(){
        super.afficherinformations();
        System.out.println("le modele de la voiture  est "+modele+" est l'annee : "+annee);;

    }

}
