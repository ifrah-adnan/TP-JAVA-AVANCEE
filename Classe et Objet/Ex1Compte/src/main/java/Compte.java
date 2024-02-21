/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Compte {
    private Long num;
    private String nomClient;
    private Double solde;

    public Compte() {
    }

    public Compte(Long num, String nomClient, Double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }
    public void afficherCompteInfo(){
        System.out.println("le numero de compte :"+num+ " le nom de client :"+nomClient+" et leur solde est :"+solde);

    }
    public void retirer(double montant){
        if(this.solde>montant) {
            double res = this.solde - montant;
            System.out.println("le montant qui est retire est " + montant + " est le solde reste " + res);
        }
        else {
            System.out.println("le solde est insuffisant");
        }
    }
    public void deposer(double montant){
        if(montant>0){
            double dep=montant+this.solde;
            System.out.println("le solde actuel est : "+dep);
        }
        else {
            System.out.println("error le solde est negatif");
        }
    }
}
