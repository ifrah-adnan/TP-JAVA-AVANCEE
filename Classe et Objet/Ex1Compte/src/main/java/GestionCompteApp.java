/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class GestionCompteApp {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans l'application de gestion des Comptes");

        Compte c1=new Compte(1L,"AHMED",20000.0);
        Compte c2 =new Compte(2L,"HAJAR", 30000.0);

        c1.retirer(19000);
        c2.retirer(45000);
        c1.deposer(15000);
    }
}
