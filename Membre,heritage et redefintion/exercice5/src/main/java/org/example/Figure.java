package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
 abstract class Figure {
 protected String nom;
 public abstract double calculerAir();
 public abstract double calculerPerimetre();
 public void afficherDetail(){
     System.out.println("le nom :"+nom+ "l'air est :"+calculerAir()+" et le perimetre est "+calculerPerimetre());

 }

    public Figure(String nom) {
        this.nom = nom;
    }
}
