package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class CarteCredit extends Paiement{
    private int numCarte;

    public CarteCredit(double montant) {
        super(montant);
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("le paiement par la carte du credit et le montant est :"+montant);
    }

}
