package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Livre implements Empruntable{
    private String titre;
    private String auteur;
    private boolean emprunt;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public void emprunter() {
        if(!this.emprunt){
            emprunt=true;
            System.out.println("ce livre \""+titre+"a ete emprunte");
        } else {
            System.out.println("Le livre \"" + titre + "\" est déjà emprunté.");
        }

    }

    @Override
    public void retourner() {
        if(emprunt){
            emprunt=false;
            System.out.println("Le livre \"" + titre + "\" a été retourné.");
        } else {
            System.out.println("Le livre \"" + titre + "\" n'a pas été emprunté.");
        }

    }
}
