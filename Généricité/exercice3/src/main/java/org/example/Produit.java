package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Produit {
    private int id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nb_stk;

    public Produit(int id, String nom, String marque, double prix, String description, int nb_stk) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nb_stk = nb_stk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNb_stk() {
        return nb_stk;
    }

    public void setNb_stk(int nb_stk) {
        this.nb_stk = nb_stk;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nb_stk=" + nb_stk +
                '}';
    }
}
