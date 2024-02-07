package ma.adnan;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Compte {
    private String numero;
    private double solde;
     static int nbcompte;

    public Compte() {
        this.numero="";
        this.solde=0;
        nbcompte++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public static int getNbcompte() {
        return nbcompte;
    }

    public static void setNbcompte(int nbcompte) {
        Compte.nbcompte = nbcompte;
    }
    public double deposer(double montant){
        if(montant<0){
            System.out.println("le montant est inferieur a 0");

        }
        else {

        this.solde+=montant;
        }
        return this.solde;
    }
    public double retirer(double montant){
        if(montant>this.solde){
            System.out.println("le solde est insufissant");
        }
        else{
            this.solde-=montant;
        }
        return this.solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                '}';
    }
    static void afficherNbComptes(){
        System.out.println("le nombre de comptes est: "+nbcompte);
    }

}
