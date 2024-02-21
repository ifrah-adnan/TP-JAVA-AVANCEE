package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Commande {
    private double montant;
    private Paiement type;

    public Commande(double montant, Paiement type) {
        this.montant = montant;
        this.type = type;
    }
    public void processPayment() {
        type.effectuerPaiement(montant);
    }

}
