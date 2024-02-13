package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class CompteBancaire {
    private int numC;
    private double solde;
    private String nom;

    public CompteBancaire(int numC, double solde, String nom) {
        this.numC = numC;
        this.solde = solde;
        this.nom = nom;
    }

    public double depot(double mt){
        double res= mt+this.solde;
        return  res;
    }
    public double retirer(double mt) throws myException {
        if (mt < 0) {
            throw new myException("solde insuffisant");
        }
        return this.solde -= mt;


    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "numC=" + numC +
                ", solde=" + solde +
                ", nom='" + nom + '\'' +
                '}';
    }
    public void  transfer(CompteBancaire c,double mt)throws myException{
        if(mt>this.solde){
            throw new myException("impossible de passer le virement car le montant est plus grand au solde ");
        }
        this.retirer(mt);
        c.depot(mt);
        this.toString();

    }

}
