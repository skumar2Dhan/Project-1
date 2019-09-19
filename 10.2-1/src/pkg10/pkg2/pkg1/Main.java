/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg2.pkg1;



import java.util.ArrayList;

public class Main {

   
    public static void main(String[] args) {
        ArrayList<Integer> L= new ArrayList<Integer>(10);
        for (int i=0; i<=10; i++){
            L.add((int)(i*2));
            
        
        }
        System.out.println(L);
        reverse(L);
        System.out.println(L);
        L.remove(0);
        reverse(L);
        System.out.println(L);
        
    }
    public static void reverse(ArrayList<Integer> L){
        int z= L.size()-1;
        for (int i=0; i<z; i++){
            Integer temp = L.get(i);
            L.set(i, L.get(z));
            L.set(z, temp);
            z--;
        
        }   
               
    
    
    }

}
