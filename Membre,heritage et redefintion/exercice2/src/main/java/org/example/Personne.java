package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private Long tel;
    private int age;

    public Personne(String nom, String prenom, String email, Long tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public Personne() {
    }


    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel=" + tel +
                ", age=" + age +
                '}';
    }

}
