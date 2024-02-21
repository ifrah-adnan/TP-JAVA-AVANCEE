package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Cercle extends Figure {
    private double rayon;

    public Cercle(String nom ,double rayon) {
        super(nom);
        this.rayon=rayon;
    }

    @Override
    public double calculerAir() {
        double res= Math.PI*Math.pow(this.rayon,2);
        return res;
    }

    @Override
    public double calculerPerimetre() {
        double res = Math.PI*this.rayon*2;
        return res;
    }

}
