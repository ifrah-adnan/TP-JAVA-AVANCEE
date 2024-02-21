package org.example;

import java.util.ArrayList;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire>compteBancaires=new ArrayList<>();
        compteBancaires.add(new CompteBancaire(1,20000,"adnan"));
        compteBancaires.add(new CompteBancaire(2,30000,"ahmed"));
        try {
            System.out.println(compteBancaires.get(0).retirer(2000));
        } catch (myException e) {
            throw new RuntimeException(e);
        }
        System.out.println(compteBancaires.get(0));


    }
}