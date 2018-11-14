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
public class ArrayQueue<T> implements QueueInterface<T>{
    private T[]queue;
    private int lastIndex;
    private int firstIndex;
    
    @Override
    public void enqueue(Object newEntry) {
        lastIndex++;
        if(isFull()){
            expandArray();
        }
        queue[lastIndex] = newEnrty;
    }

    @Override
    public T dequeue() {
        T item = null;
        if(!isEmply()){
            item = queue[firstIndex];
            firstIndex;
        }
        return item;
    }

    @Override
    public T getFront() {
        T item =null;
    }

 public boolean isEmpty() {
       if(lastIndex == -1){
           return true;
       }else{
           return false;
       }
    }


    public void clear() {
       for(int i=0;i<queue.length;i++){
        queue[i]=null;
    }
       lastIndex=-1;
    }
    
    private boolean isFull(){
        boolean isFull = false;
        if(lastIndex == queue.length){
            isFull = true;
        }
        return isFull;
    }

    private void expandArray() {
        T[] oldStack = queue;
        int currentLength = oldStack.length;
        //create new stack with double size of current length;
        queue = (T[])new Object[2*currentLength];
        for(int i=0;i<currentLength;i++){
            queue[i]=oldStack[i];
        }
        
    }
    
}
