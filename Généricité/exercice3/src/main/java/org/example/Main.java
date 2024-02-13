package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
        MetierProduitImpl m=new MetierProduitImpl(new ArrayList<>());
        m.add(new Produit(1,"bimo","Excelo",2.0,"alimentation",100));
        m.add(new Produit(2,"merendina","be",3.0,"alimentation",3000));
        Produit p= m.findById(2);

        System.out.println( m.findById(2));
//        m.delete(2);
//        List<Produit> produitList=m.getAll();
//        for(Produit p2:produitList){
//            System.out.println(p2);
//        }

    }
}