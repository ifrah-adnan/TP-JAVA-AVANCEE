package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
    Adherent a1=new Adherent("adnan","ifrah","aifrah@gmail.com",0666666666L,22,1);
    Auteur a2=new Auteur("victor","hugo",null,0L,120,2);
    Livre l=new Livre(22,"Assasin",a2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(l);
    }
}