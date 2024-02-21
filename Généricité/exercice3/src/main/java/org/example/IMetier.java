package org.example;

import java.util.List;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public interface IMetier <T>{
void add(T o);
List<T> getAll();
T findById(long id);
void delete(long id);
}
