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
public class Practical3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*StackInterface<Character> cStack = new ArrayStack();
        String s = "12345678";
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            cStack.push(c);
        }
        while(!cStack.isEmpty()){
            System.out.print(cStack.pop());
        }*/
        
        ListInterface<Integer> iList=new ArrayList();
        for(int i=0;i<100;i++){
            iList.add(i);
        }
        for(int i=0;i<100;i++){
            System.out.println(iList.get(i));
        }
    }
    
}
