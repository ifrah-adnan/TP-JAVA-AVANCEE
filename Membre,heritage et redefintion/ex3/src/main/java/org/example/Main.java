package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
        Voiture v1=new Voiture("kia",200000,"ceed",2012);
        v1.afficherinformations();
        v1.emettreSon();
        Avion a1= new Avion("airbus",100000000,"Airline",300);
        a1.afficherinformations();
        a1.emettreSon();
        Moto m1=new Moto("sh",60000,"honda",4);
        m1.afficherinformations();
        m1.emettreSon();

    }
}