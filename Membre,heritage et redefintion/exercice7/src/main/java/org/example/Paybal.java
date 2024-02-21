package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Paybal extends Paiement{
    private  String email;

    public Paybal(double montant, String email) {
        super(montant);
        this.email = email;

    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("le paiement est effectuer par Paybal et le montant est "+montant);
    }

}
