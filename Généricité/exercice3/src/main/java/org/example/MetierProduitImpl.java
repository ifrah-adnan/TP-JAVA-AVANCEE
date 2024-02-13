package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class MetierProduitImpl implements IMetier<Produit>{
    List<Produit>produits=new ArrayList<>();

    public MetierProduitImpl(List<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit:produits){
            if(produit.getId()==id){
                return produit;
            }

        }
        return null;
    }

    @Override
    public void delete(long id) {
    Produit produit=this.findById(id);
    if(produits.contains(produit)){
        produits.remove(produit);
    }
    }
}
