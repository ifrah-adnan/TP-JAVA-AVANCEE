package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class StorageGenerique <T>{
    List<T>element=new ArrayList<>();
    public void addElement(T o){
        element.add(o);
    }
    public T getElement(int index){
        if (index>=0 && index<element.size())
        return element.get(index);

        else {
            throw new IndexOutOfBoundsException("indice non valid");
        }
    }
    public void removeElement(int index){
        if (index>=0 && index<element.size())
element.remove(index);
        else {
            throw new IndexOutOfBoundsException("indice non trouve");
        }

    }

public int getSize(){
        return element.size();
}

}
