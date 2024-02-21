package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Ingenieure extends Employe {
    private String specialite;

    public Ingenieure(String nom, String prenom, String email, int telephone, double salaire,String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite=specialite;
    }

    @Override
    double calculerSalaire() {
        double res=this.salaire*1.15;
        return res;

    }

}
