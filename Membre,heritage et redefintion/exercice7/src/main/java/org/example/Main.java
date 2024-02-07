package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
           Paiement c =new CarteCredit(200);
           Paiement p =new Paybal(300,"aaaa");
           Commande cmd =new Commande(400,p);
           cmd.processPayment();


    }
}