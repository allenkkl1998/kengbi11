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
public class SortedArrayList<T> implements ListInterface<T>{
    private T[] array;
    private int numberOfEntries;
    
    public SortedArrayList(){
        T[] array = (T[])new Object[DEFAULT_SIZE];
        numberOfEntries = 0;
    }
    
    @Override
    public void add(T newEntry) {
        if(isFull()){
            expandArray();
        }
        array[numberOfEntries] = newEntry;
        numberOfEntries++;
    }
    
    public T get(int i){
        return array[i];
    }
    
    private void expandArray(){
        T[] oldArray = array;
        int size = oldArray.length;
        
        array = (T[])new Object[2*size];
        for(int i=0;i<size;i++){
            array[i]=oldArray[i];
        }
    }
    public boolean remove(){
        if(!isEmpty()){
            for(int i=1;i<numberOfEntries;i++){
                array[i-1]=array[i];
                 
            }
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean remove(T anEntry) {
        boolean found=false;
        if(!isEmpty()){
            for(int i=0;i<numberOfEntries;i++){
                shiftEntries(i);
                numberOfEntries--;
            }
            return found;
        }else{
            return found;
        }
    }
    
    private void shiftEntries(int startIndex){
        for(int i=startIndex;i<numberOfEntries-1;i++){
            array[i]=array[i+1];
        }
    }

    @Override
    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        if(numberOfEntries==0){
         return true;   
        }else{
            return false;
        }
    }
    
    public boolean isFull(){
        if(numberOfEntries==array.length){
            return true;
        }else{
            return false;
        }
        
    }
    
    public String toString(){
        String s="";
        for(int i=0;i<numberOfEntries;i++){
            s= s + array[i]+ "\n";
        }
        return s;
    }
    
    
}
