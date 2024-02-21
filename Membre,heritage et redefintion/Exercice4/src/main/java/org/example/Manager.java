package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Manager extends Employe{
    private String service;

    public Manager(String nom, String prenom, String email, int telephone, double salaire,String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service=service;
    }

    @Override
    double calculerSalaire() {
        double res=this.salaire*1.20;
        return res;
    }
}
