package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
    Figure c=new Cercle("c1",2);
        System.out.println(c.calculerAir());
        System.out.println("le perimetre de cercle"+c.calculerPerimetre());
c.afficherDetail();
    Rectangle r= new Rectangle("r1",2,4);
        System.out.println("l 'air de rectangle "+r.calculerAir());
        r.afficherDetail();
        System.out.println("le perimetre de rectangle "+r.calculerPerimetre());
    }
}