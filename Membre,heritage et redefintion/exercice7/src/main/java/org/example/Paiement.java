package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public  class Paiement {
    double montant;
    int numeroTransaction;

    public Paiement(double montant) {
        this.montant = montant;
    }

    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " DH effectué avec succès.");
    }


  }
