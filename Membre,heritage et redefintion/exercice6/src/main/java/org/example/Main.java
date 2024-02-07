package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
    Livre l=new Livre("t1","a1");


    DVD d=new DVD();
    d.setTitre("d");
    d.setRealisateur("r1");
    Utilisateur u= new Utilisateur();
    u.setNom("adnan");
    u.emprunterObjet(d);
    d.retourner();
    u.emprunterObjet(l);
    u.emprunterObjet(l);
    l.retourner();



    }
}