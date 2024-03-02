package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {

        Set<String> group1=new HashSet<>();
        Set<String> group2=new HashSet<>();
        group1.add("adnan");
        group1.add("karim");
        group1.add("ilyass");
        group2.add("adnan");
        group2.add("yahya");

        System.out.println("Groupe A : " + group1);
        System.out.println("Groupe B : " + group2);

        Set<String> intersection=new HashSet<>(group1);
        intersection.retainAll(group2);
        System.out.println("Intersection des groupes A et B : " + intersection);
        Set<String> union = new HashSet<>(group1);
        union.addAll(group2);
        System.out.println("Union des groupes A et B : " + union);
    }
}