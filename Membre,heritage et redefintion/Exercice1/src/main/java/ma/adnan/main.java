package ma.adnan;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class main {
    public static void main(String[] args) {
        Compte c1=new Compte();
        c1.setNumero("11");
        c1.setSolde(20000);
         Compte c2=new Compte();
         c2.setNumero("22");
         c2.setSolde(30000);

        double dp1= c1.deposer(10000);
        System.out.println("depot "+dp1);
        double rt2= c2.retirer(20000);
        System.out.println("retirer :"+rt2);

        Compte.afficherNbComptes();

    }
}
