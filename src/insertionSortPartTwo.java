import java.io.*;
import java.util.*;

public class insertionSortPartTwo {

    public static void insertionSortPart2(int[] ar)
    {       
    	 for (int i = 1; i < ar.length; i++) {
             int next = ar[i];
             // find the insertion location while moving all larger element up
             int j = i;
             //Correctness and the Loop Invariant
             while (j >= 0 && ar[j - 1] > next) {
                 ar[j] = ar[j - 1];
                 j--;
             }
             // insert the element
             ar[j] = next;
             printArray(ar);
         }
         
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
