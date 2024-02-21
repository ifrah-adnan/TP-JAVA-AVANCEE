package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Rectangle extends Figure {
    private double longueur;
    private  double largeur;

    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAir() {
        return longueur*largeur;
    }

    @Override
    public double calculerPerimetre() {
        double res=2*(longueur+largeur);
        return res;
    }
}
