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
public interface StackInterface<T> {
    public static final int DEFAULT_SIZE = 5;//not encouraged
    public void push(T newEntry);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void clear();
} // end StackInterface
