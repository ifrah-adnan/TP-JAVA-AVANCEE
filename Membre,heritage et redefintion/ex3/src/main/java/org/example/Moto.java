package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Moto extends Vehicul{
    private String marque;
    private int puissance;

    public Moto(String nom, double prix, String marque, int puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    @Override
    public void emettreSon(){

        System.out.println("la moto rugit");
    }
    @Override
    public void afficherinformations(){
        super.afficherinformations();
        System.out.println("la marque de moto est "+marque +" est son puissance : "+puissance);;

    }
}
