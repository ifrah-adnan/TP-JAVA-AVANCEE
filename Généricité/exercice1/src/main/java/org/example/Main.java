package org.example;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
    StorageGenerique<String> st =new StorageGenerique<>();
    st.addElement("tst");
    st.addElement("adnan");
    st.addElement("ifrah");
        System.out.println(st.getSize());
        System.out.println(st.getElement(2));

        StorageGenerique<Double>st2=new StorageGenerique<>();
        st2.addElement(2.3);
        st2.addElement(6.0);
        System.out.println(st2.getSize());

    }
}