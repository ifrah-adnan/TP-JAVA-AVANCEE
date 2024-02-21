package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel e=new EntierNaturel(4);
            EntierNaturel e2=new EntierNaturel(-3);
            System.out.println(e2.getVal());
        } catch (NombreNegatifException e) {

            e.printStackTrace();
            System.out.println( e.getValeurErronee());

        }


    }
}