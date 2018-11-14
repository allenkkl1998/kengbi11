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
public class ArrayStack<T> implements StackInterface<T>{
    private T[] stack;
    private int lastIndex;
    
    public ArrayStack(){
        this(DEFAULT_SIZE);
}
    public ArrayStack(int n){
    stack= (T[]) new Object[n];
    lastIndex = -1;
}
    

    public void push(T newEntry) {
       lastIndex++;
       if(isFull()){
           expandArray();
       }
       stack[lastIndex] = newEntry;
    }


    public T pop() {
        T item = null;
        if(!isEmpty()){
            item = stack[lastIndex];
            lastIndex--;
        }
        return item;
    }


    public T peek() {
        return null;
       
    }


    public boolean isEmpty() {
       if(lastIndex == -1){
           return true;
       }else{
           return false;
       }
    }


    public void clear() {
       for(int i=0;i<stack.length;i++){
        stack[i]=null;
    }
       lastIndex=-1;
    }
    
    private boolean isFull(){
        boolean isFull = false;
        if(lastIndex == stack.length){
            isFull = true;
        }
        return isFull;
    }

    private void expandArray() {
        T[] oldStack = stack;
        int currentLength = oldStack.length;
        //create new stack with double size of current length;
        stack = (T[])new Object[2*currentLength];
        for(int i=0;i<currentLength;i++){
            stack[i]=oldStack[i];
        }
        
    }
    
}
