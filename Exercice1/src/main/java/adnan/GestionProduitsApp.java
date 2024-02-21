package adnan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class GestionProduitsApp {
    public static void main(String[] args) {

        List<Produit> produits=new ArrayList<>();
        produits.add(new Produit(1,"bimo",20.0));
        produits.add(new Produit(2,"jus",40.0));
        produits.add(new Produit(3,"cake",10));
        System.out.println("la liste des produit :");

            System.out.println(produits);

        System.out.println("Suppresion :");
        produits.remove(0);
        System.out.println(produits);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez entre un nom d'un produit");
        String p=scanner.nextLine();
        boolean produittrouve=false;
        for (Produit produit:produits
             ) {
            if(produit.getNom().equalsIgnoreCase(p)){
                System.out.println("le produit est trouve dans la liste et leur nom "+p);
                produittrouve=true;

            }


        }
        if(!produittrouve) {
            System.out.println("non trouve");
        }



    }
}
