/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3;

/**
 *
 * @author taruc
 */
public interface ListInterface<T> {
    public static final int DEFAULT_SIZE = 5;
    public T get(int i);
    public void add(T newEntry);
    public boolean remove(T anEntry);
    public int getNumberOfEntries();
    public boolean isEmpty();
}
