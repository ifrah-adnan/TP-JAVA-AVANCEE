package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean emprunt;

    public boolean isEmprunt() {
        return emprunt;
    }

    public void setEmprunt(boolean emprunt) {
        this.emprunt = emprunt;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public void emprunter() {
        if(!emprunt && emprunt!=true){
            emprunt=true;
            System.out.println("Le DVD \"" + titre + "\" a été emprunté.");
        } else {
            System.out.println("Le DVD \"" + titre + "\" est déjà emprunté.");
        }
        }


    @Override
    public void retourner() {
        if(emprunt){
            emprunt=false;
        System.out.println("Le DVD \"" + titre + "\" a été retourné.");
    } else {
        System.out.println("Le DVD \"" + titre + "\" n'a pas été emprunté.");
        }


}}
