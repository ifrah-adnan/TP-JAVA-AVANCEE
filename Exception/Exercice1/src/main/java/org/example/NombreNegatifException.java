package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class NombreNegatifException extends Exception {
    private int valeurErronee;

    public NombreNegatifException(int valeurErronee) {
        super("Le nombre est négatif !");
        this.valeurErronee = valeurErronee;
    }

    public int getValeurErronee() {
        return valeurErronee;
    }
}

