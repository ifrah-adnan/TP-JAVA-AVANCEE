package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class CompteCourant extends CompteBancaire{
    private double decouvert;

    public CompteCourant(int numC, double solde, String nom, double decouvert) {
        super(numC, solde, nom);
        this.decouvert = decouvert;
    }




}
