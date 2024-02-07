package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
        Ingenieure i=new Ingenieure("Adnan","ifrah","ifrahadnan61@gmail.com",055555,10000,"df");
        Manager m=new Manager("ahmed","xxx","aadd",100000,33,"info");
        System.out.println(i.calculerSalaire());
        System.out.println(m.calculerSalaire());

    }
}